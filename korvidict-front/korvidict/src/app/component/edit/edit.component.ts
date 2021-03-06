import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {PartsOfSpeech} from "../../model/parts-of-speech";
import {Subscription} from "rxjs";
import {DictionaryService} from "../../service/dictionary.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  public formEdit: FormGroup;
  public dictionaryId;

  partsOfSpeech: PartsOfSpeech[];
  subscription: Subscription;



  constructor(
    public formBuilder: FormBuilder,
    public dictionaryService: DictionaryService,
    public router: Router,
    public activatedRouter: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEdit = this.formBuilder.group({
      id: [''],
      word: ['', [Validators.required]],
      chinese: ['', [Validators.required]],
      sino: ['', [Validators.required]],
      mean: ['', [Validators.required]],

      partsOfSpeech: ['',],


      derivative: ['',],
      particle: ['',],
      note: ['',],

    });


    this.activatedRouter.params.subscribe(data => {
      this.dictionaryId = data.id;
      this.dictionaryService.getDictionaryById(this.dictionaryId).subscribe(data => {
        this.formEdit.patchValue(data);
        console.log(this.formEdit);
      });
    });
    this.getAllPart();
  }

  editDictionaries() {
    this.dictionaryService.editDictionary(this.formEdit.value, this.dictionaryId).subscribe(data => {
      this.router.navigateByUrl('dictionary');
    });
  }

  getAllPart() {
    // this.subscription = this.dictionaryService.getAllParts().subscribe(data => {
    //     this.partsOfSpeech = data["content"];
    //     console.log(this.partsOfSpeech);
    //     // console.log(this.questions[2].customer_type.name);
    //   }
    //   , error => {
    //     console.log(this.partsOfSpeech);
    //   });


    //

    this.subscription = this.dictionaryService.getAllParts().subscribe(value => {
        this.partsOfSpeech = value;
      }, error => {
        console.log(error);
      }
    );
  }
}
