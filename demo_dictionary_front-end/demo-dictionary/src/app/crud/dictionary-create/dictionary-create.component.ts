import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {DictionaryService} from "../../service/dictionary.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-dictionary-create',
  templateUrl: './dictionary-create.component.html',
  styleUrls: ['./dictionary-create.component.css']
})
export class DictionaryCreateComponent implements OnInit {

  public formAdd: FormGroup;

  constructor(
    public formBuilder: FormBuilder,
    public dictionaryService: DictionaryService,
    public router: Router
  ) {
  }

  ngOnInit() {
    this.formAdd = this.formBuilder.group({
      word: ['', [Validators.required]],
      mean: ['', [Validators.required]],
      description: ['', [Validators.required]],
      example: ['', [Validators.required]],
      // date_out: ['', [Validators.required]],
      // reason: ['', [Validators.required]],
      // method: ['', [Validators.required]],
      // doctor: ['', [Validators.required]],

    });
  }

  addNewDictionarys() {
    this.dictionaryService.addNewDictionary(this.formAdd.value).subscribe(data => {
      this.router.navigateByUrl('dictionary');
    });
  }


}
