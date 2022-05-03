import { Component, OnInit } from '@angular/core';
import {Dictionary} from "../../model/dictionary";
import {Subscription} from "rxjs";
import {PartsOf} from "../../model/parts-of";
import {ActivatedRoute, Router} from "@angular/router";
import {DictionaryService} from "../../service/dictionary.service";
import {DeleteComponent} from "../delete/delete.component";
import {MatDialog} from "@angular/material/dialog";
import {DetailComponent} from "../detail/detail.component";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  dictionaries: Dictionary[]
  term: any;
  p: string | number;
  // private subscription: Subscription;
  private subscription: Subscription | undefined;
  partsOf: PartsOf[];

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private dictionaryService: DictionaryService,
    // private partsOfSpeechService: PartsOfSpeechService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {

    this.subscription = this.dictionaryService.getAllDictionary().subscribe(data => {
        //   this.subscription = this.dictionaryService.getAllParts().subscribe(data => {
        this.dictionaries = data["content"];
        console.log(this.dictionaries);
        // console.log(this.questions[2].customer_type.name);
      }
      , error => {
        console.log(this.dictionaries);
      });
    this.getAllParts();
  }


  getAllParts() {
    this.subscription = this.dictionaryService.getAllParts().subscribe(data => {
        this.partsOf = data["content"];
        console.log(this.partsOf);
        // console.log(this.questions[2].customer_type.name);
      }
      , error => {
        console.log(this.partsOf);
      });


  }


  openDialog(id: any) {
    console.log(id);
    // Trả về đối tượng
    this.dictionaryService.getDictionaryById(id).subscribe(dictionaryData => {
      console.log(dictionaryData);
      const dialogRef = this.dialog.open(DeleteComponent, {
        width: '500px',
        data: {dictionaryData},
        // Khi bấm ra ngoài dialog khong bi mat di
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }


  openDialogs(id: any) {
    console.log(id);
    // Trả về đối tượng
    this.dictionaryService.getDictionaryById(id).subscribe(dictionaryData => {
      console.log(dictionaryData);
      const dialogRef = this.dialog.open(DetailComponent, {
        width: '500px',
        data: {dictionaryData},
        // Khi bấm ra ngoài dialog khong bi mat di
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }
}
