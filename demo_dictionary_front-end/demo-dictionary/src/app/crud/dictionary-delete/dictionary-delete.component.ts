import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {DictionaryService} from "../../service/dictionary.service";
import {Dictionary} from "../../model/dictionary";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-dictionary-delete',
  templateUrl: './dictionary-delete.component.html',
  styleUrls: ['./dictionary-delete.component.css']
})
export class DictionaryDeleteComponent implements OnInit {

  id: number;
  dictionary: Dictionary;
  private subscription: Subscription;

  constructor(
    private dictionaryService: DictionaryService,
    public dialogRef: MatDialogRef<DictionaryDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
  ) {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  ngOnInit(): void {
    console.log(this.data.dictionaryData.id);
    this.dictionary = this.data.dictionaryData;
  }

  deleteDictionarys() {
    console.log(this.dictionary.id);
    this.subscription = this.dictionaryService.deleteDictionary(this.dictionary.id).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
