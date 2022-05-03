import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Subscription} from "rxjs";
import {PartsOf} from "../../model/parts-of";
import {DictionaryService} from "../../service/dictionary.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  public formAdd: FormGroup;
  partsOf: PartsOf[];
  subscription: Subscription;


  constructor(
    public formBuilder: FormBuilder,
    public dictionaryService: DictionaryService,
    public router: Router,

  ) {
  }

  ngOnInit(): void {
    this.formAdd = this.formBuilder.group({
      word: ['', [Validators.required]],
      mean: ['', [Validators.required]],
      partsOf: ['',],

      example: ['', [Validators.required]],


    });
    this.getAllPart();
  }

  addNewDictionaries() {
    this.dictionaryService.addNewDictionary(this.formAdd.value).subscribe(data => {
      this.router.navigateByUrl('dictionary');
    });
  }



  getAllPart() {
    this.subscription = this.dictionaryService.getAllParts().subscribe(value => {
        this.partsOf = value;
      }, error => {
        console.log(error);
      }
    );
  }

  // onSubmit() {
  //   if (this.formAdd.valid) {
  //     const mess = 'Add new word successfully!';
  //     this.dictionaryService.addNewDictionary(this.formAdd.value).subscribe(value => {
  //         this.router.navigate(['/dictionary', mess]);
  //       },
  //       error => {
  //         console.log(error);
  //       });
  //   } else {
  //     console.log(this.formAdd);
  //   }

  // }

}
