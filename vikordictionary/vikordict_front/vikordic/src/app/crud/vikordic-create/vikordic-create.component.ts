import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {DictionaryService} from "../../service/dictionary.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-vikordic-create',
  templateUrl: './vikordic-create.component.html',
  styleUrls: ['./vikordic-create.component.css']
})
export class VikordicCreateComponent implements OnInit {

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
      chinese: ['', [Validators.required]],
      sino: ['', [Validators.required]],
      mean: ['', [Validators.required]],
      derivative: ['',],
      particle: ['',],
      note: ['', ],

      // example: ['', [Validators.required]],
      // date_out: ['', [Validators.required]],
      // reason: ['', [Validators.required]],
      // method: ['', [Validators.required]],
      // doctor: ['', [Validators.required]],


    });
  }

  addNewDictionaries() {
    this.dictionaryService.addNewDictionary(this.formAdd.value).subscribe(data => {
      this.router.navigateByUrl('dictionary');
    });
  }

}
