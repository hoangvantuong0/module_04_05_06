import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {QuestionsService} from "../../../service/questions.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-question-edit',
  templateUrl: './question-edit.component.html',
  styleUrls: ['./question-edit.component.css']
})
export class QuestionEditComponent implements OnInit {

  public formEdit: FormGroup
  public maxDate = new Date();
  public minDate = new Date(1900, 0, 1);
  public questionId;

  constructor(
    public formBuilder: FormBuilder,
    public questionService: QuestionsService,
    public router: Router,
    public activatedRouter: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEdit = this.formBuilder.group({
      title: ['', [Validators.required]],
      type_of_question: ['', [Validators.required]],
      date: ['', [Validators.required]],
      status: ['', [Validators.required]],
      // idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      // salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      // email: ['', [Validators.required, Validators.email]],
      // phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      // address: ['', [Validators.required]],
    })
    this.activatedRouter.params.subscribe(data => {
      this.questionId = data.id;
      this.questionService.getQuestionById(this.questionId).subscribe(data => {
        this.formEdit.patchValue(data);
        console.log(this.formEdit);
      });
    });
  }
  editQuestion(){
    this.questionService.editQuestion(this.formEdit.value, this.questionId).subscribe(data=>{
      this.router.navigateByUrl('question-list');
    });
  }
}
