import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {DictionaryService} from "../../service/dictionary.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-dictionary-edit',
  templateUrl: './dictionary-edit.component.html',
  styleUrls: ['./dictionary-edit.component.css']
})
export class DictionaryEditComponent implements OnInit {


  public formEdit: FormGroup;
  public dictionaryId;

  constructor(
    public formBuilder: FormBuilder,
    public dictionaryService: DictionaryService,
    public router: Router,
    public activatedRouter: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEdit = this.formBuilder.group({
      id:['', [Validators.required]],
      word: ['', [Validators.required]],
      mean: ['', [Validators.required]],
      description: ['', [Validators.required]],
      example: ['', [Validators.required]],

    });
    this.activatedRouter.params.subscribe(data => {
      this.dictionaryId = data.id;
      this.dictionaryService.getDictionaryById(this.dictionaryId).subscribe(data => {
        this.formEdit.patchValue(data);
        console.log(this.formEdit);
      });
    });
  }
  editDictionarys(){
    this.dictionaryService.editDictionary(this.formEdit.value, this.dictionaryId).subscribe(data=>{
      this.router.navigateByUrl('dictionary');
    });
  }
}
