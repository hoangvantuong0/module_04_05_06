import {Component, OnInit} from '@angular/core';
import {QuestionsService} from '../../../service/questions.service'
import {MatDialog} from "@angular/material/dialog";
import {QuestionDeleteComponent} from "../question-delete/question-delete.component";

@Component({
  selector: 'app-question-list',
  templateUrl: './question-list.component.html',
  styleUrls: ['./question-list.component.css']
})
export class QuestionListComponent implements OnInit {
  public questions;
  term: any;
  p: string | number;

  constructor(
    public questionService: QuestionsService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.questionService.getAllQuestion().subscribe(data => {
      this.questions = data;
      console.log(this.questions)
    })
  }
    openDialog(questionId): void {
      this.questionService.getQuestionById(questionId).subscribe(dataOfQuestion => {
        const dialogRef = this.dialog.open(QuestionDeleteComponent, {
          width: '500px',
          data: { data1: dataOfQuestion},
          disableClose: true

        });

        dialogRef.afterClosed().subscribe(result => {
          console.log('The dialog was closed');
          this.ngOnInit();
        });
      });

  }

}
