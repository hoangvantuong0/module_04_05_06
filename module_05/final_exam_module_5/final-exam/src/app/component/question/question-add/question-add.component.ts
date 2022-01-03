import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {QuestionsService} from "../../../service/questions.service";

@Component({
  selector: 'app-question-add',
  templateUrl: './question-add.component.html',
  styleUrls: ['./question-add.component.css']
})
export class QuestionAddComponent implements OnInit {
  public formAdd: FormGroup;
  public maxDate = new Date();
  public minDate = new Date(1900, 0, 1);

  constructor(
    public formBuilder: FormBuilder,
    public questionService: QuestionsService,
    public router: Router
  ) {
  }

  ngOnInit() {
    this.formAdd = this.formBuilder.group({
      title: ['', [Validators.required]],
      type_of_question: ['', [Validators.required]],
      date: ['', [Validators.required]],
      status: ['', [Validators.required]],
      // idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      // salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      // email: ['', [Validators.required, Validators.email]],
      // phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      // address: ['', [Validators.required]]
    });
  }

  addNewQuestion() {
    this.questionService.addNewQuestion(this.formAdd.value).subscribe(data => {
      this.router.navigateByUrl('question-list');
    });
  }

}
