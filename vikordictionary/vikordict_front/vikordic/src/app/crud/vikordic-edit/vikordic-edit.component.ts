import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {DictionaryService} from "../../service/dictionary.service";

@Component({
  selector: 'app-vikordic-edit',
  templateUrl: './vikordic-edit.component.html',
  styleUrls: ['./vikordic-edit.component.css']
})
export class VikordicEditComponent implements OnInit {

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
      id: [''],
      word: ['', [Validators.required]],
      chinese: ['', [Validators.required]],
      sino: ['', [Validators.required]],
      mean: ['', [Validators.required]],
      derivative: ['',],
      particle: ['',],
      note: ['', ],

    });
    this.activatedRouter.params.subscribe(data => {
      this.dictionaryId = data.id;
      this.dictionaryService.getDictionaryById(this.dictionaryId).subscribe(data => {
        this.formEdit.patchValue(data);
        console.log(this.formEdit);
      });
    });
  }
  editDictionaries(){
    this.dictionaryService.editDictionary(this.formEdit.value, this.dictionaryId).subscribe(data =>{
      this.router.navigateByUrl('dictionary');
    });
  }

}
