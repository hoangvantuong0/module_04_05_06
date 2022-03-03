import {Component, OnInit} from '@angular/core';
import {Subscription} from "rxjs";
import {ActivatedRoute, Router} from "@angular/router";
import {DictionaryService} from "../../service/dictionary.service";
import {MatDialog} from "@angular/material/dialog";
import {VikordicDeleteComponent} from "../vikordic-delete/vikordic-delete.component";
import {PartsOfSpeech} from "../../model/parts-of-speech";
import {Dictionary} from "../../model/dictionary";
// import {PartsOfSpeechService} from "../../service/parts-of-speech.service";


@Component({
  selector: 'app-vikordic-list',
  templateUrl: './vikordic-list.component.html',
  styleUrls: ['./vikordic-list.component.css']
})
export class VikordicListComponent implements OnInit {
  // public dictionaries;
  dictionaries: Dictionary[]
  term: any;
  p: string | number;
  // private subscription: Subscription;
  private subscription: Subscription | undefined;
  partsOfSpeech: PartsOfSpeech[];

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
      this.partsOfSpeech = data["content"];
      console.log(this.partsOfSpeech);
      // console.log(this.questions[2].customer_type.name);
    }
    , error => {
      console.log(this.partsOfSpeech);
    });


  }


  openDialog(id: any) {
    console.log(id);
    // Trả về đối tượng
    this.dictionaryService.getDictionaryById(id).subscribe(dictionaryData => {
      console.log(dictionaryData);
      const dialogRef = this.dialog.open(VikordicDeleteComponent, {
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
