import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {DictionaryService} from "../../service/dictionary.service";
import {Router} from "@angular/router";
import {PartsOfSpeech} from "../../model/parts-of-speech";
import {Subscription} from "rxjs";
// import {PartsOfSpeechService} from "../../service/parts-of-speech.service";

@Component({
  selector: 'app-vikordic-create',
  templateUrl: './vikordic-create.component.html',
  styleUrls: ['./vikordic-create.component.css']
})
export class VikordicCreateComponent implements OnInit {

  public formAdd: FormGroup;
  partsOfSpeech: PartsOfSpeech[];
  subscription: Subscription;


  constructor(
    public formBuilder: FormBuilder,
    public dictionaryService: DictionaryService,
    public router: Router,
  // private partsOfSpeechService: PartsOfSpeechService,
  //   public partsOfSpeechService: PartsOfSpeechService,
  ) {
  }


  // ngOnInit() {
  // đang test
  ngOnInit(): void {
    this.formAdd = this.formBuilder.group({
      word: ['', [Validators.required]],
      chinese: ['', [Validators.required]],
      sino: ['', [Validators.required]],
      mean: ['', [Validators.required]],

      partsOfSpeech: ['',],

      derivative: ['',],
      particle: ['',],
      note: ['', ],

      // example: ['', [Validators.required]],


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
        this.partsOfSpeech = value;
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
