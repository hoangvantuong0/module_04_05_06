import { Component, OnInit } from '@angular/core';
import {Subscription} from "rxjs";
import {ActivatedRoute, Router} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {DictionaryService} from "../../service/dictionary.service";
import {DictionaryDeleteComponent} from "../dictionary-delete/dictionary-delete.component";

@Component({
  selector: 'app-dictionary-list',
  templateUrl: './dictionary-list.component.html',
  styleUrls: ['./dictionary-list.component.css']
})
export class DictionaryListComponent implements OnInit {

  public dictionarys;
  term: any;
  p: string | number;
  private subscription: Subscription;

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private dictionaryService: DictionaryService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.subscription = this.dictionaryService.getAllDictionary().subscribe(data => {
        this.dictionarys = data['content'];
        console.log(this.dictionarys);
        // console.log(this.questions[2].customer_type.name);
      }
      , error => {
        console.log(this.dictionarys);
      });
  }
  openDialog(id: any) {
    console.log(id);
    // Trả về đối tượng
    this.dictionaryService.getDictionaryById(id).subscribe(dictionaryData => {
      console.log(dictionaryData);
      const dialogRef = this.dialog.open(DictionaryDeleteComponent, {
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
