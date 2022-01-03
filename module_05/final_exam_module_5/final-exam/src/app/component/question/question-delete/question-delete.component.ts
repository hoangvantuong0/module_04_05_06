import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {QuestionsService} from "../../../service/questions.service";

@Component({
  selector: 'app-question-delete',
  templateUrl: './question-delete.component.html',
  styleUrls: ['./question-delete.component.css']
})
export class QuestionDeleteComponent implements OnInit {
  public questionTitle;
  public questionId;

  constructor(
    public dialogRef: MatDialogRef<QuestionDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public questionService: QuestionsService
  ) {}

  ngOnInit(): void {
    this.questionTitle = this.data.data1.title;
    this.questionId = this.data.data1.id;
  }

  deleteEmployee() {
    this.questionService.deleteQuestion(this.questionId).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
