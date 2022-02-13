import {Component, Inject, OnInit} from '@angular/core';
import {Dictionary} from "../../model/dictionary";
import {Subscription} from "rxjs";
import {DictionaryService} from "../../service/dictionary.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-vikordic-delete',
  templateUrl: './vikordic-delete.component.html',
  styleUrls: ['./vikordic-delete.component.css']
})
export class VikordicDeleteComponent implements OnInit {

  id: number;
  dictionary: Dictionary;
  private subscription: Subscription;

  constructor(
    private dictionaryService: DictionaryService,
    public dialogRef: MatDialogRef<VikordicDeleteComponent>,
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

  deleteDictionaries() {
    console.log(this.dictionary.id);
    this.subscription = this.dictionaryService.deleteDictionary(this.dictionary.id).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
