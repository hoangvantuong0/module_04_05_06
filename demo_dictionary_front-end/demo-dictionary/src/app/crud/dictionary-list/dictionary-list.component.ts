import { Component, OnInit } from '@angular/core';
import {Subscription} from "rxjs";
import {ActivatedRoute, Router} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {DictionaryService} from "../../service/dictionary.service";
import {DictionaryDeleteComponent} from "../dictionary-delete/dictionary-delete.component";
import {FormBuilder, FormGroup} from "@angular/forms";
import {Dictionary} from "../../model/dictionary";
import {DictionaryDetailComponent} from "../dictionary-detail/dictionary-detail.component";

@Component({
  selector: 'app-dictionary-list',
  templateUrl: './dictionary-list.component.html',
  styleUrls: ['./dictionary-list.component.css']
})
export class DictionaryListComponent implements OnInit {
  keyWord: string;
  public dictionarys;
  term: any;
  p: string | number;
  private subscription: Subscription;
  showBack;
  sForm: FormGroup;
  dictionaries: Dictionary[] | undefined;

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private dictionaryService: DictionaryService,
    public dialog: MatDialog,
    private fb: FormBuilder
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
    this.sForm = this.fb.group({
      sWord: [''],
      sMean: [''],
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

  openDialogDetail(id: any) {
    console.log(id);
    // Trả về đối tượng
    this.dictionaryService.getDictionaryById(id).subscribe(dictionaryData => {
      console.log(dictionaryData);
      const dialogRef = this.dialog.open(DictionaryDetailComponent, {
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





  // onSearchSubmit() {
  //   const word = this.sForm.value.sWord;
  //   const mean = this.sForm.value.sMean;
    // if (word && mean === '') {
    //   this.subscription = this.dictionaryService.search(name).subscribe(data => {
    //       this.dictionaries = data;
    //       this.showBack = 'True';
    //     }
    //     , error => {
    //     });
    // } else if (word === '' && mean) {
    //   this.subscription = this.dictionaryService.search(address).subscribe(data => {
    //       this.dictionaries = data;
    //       this.showBack = 'True';
    //     }
    //     , error => {
    //     });
    // } else
  //   if (word) {
  //     this.subscription = this.dictionaryService.searchDictionary(word).subscribe(data => {
  //         this.dictionarys = data;
  //         this.showBack = 'True';
  //       }, error => {
  //       });
  //   } else {
  //     this.ngOnInit();
  //   }
  //
  // }

  search() {
    if (this.keyWord === '') {
      this.ngOnInit();
    } else {
      this.dictionaryService.searchDictionary(this.keyWord).subscribe(value => {
          this.dictionaries = value;
        },
        error => {
          console.log(error);
        });
    }
  }


  Back() {
    this.ngOnInit();
  }
}


