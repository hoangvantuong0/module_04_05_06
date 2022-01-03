import { Injectable } from '@angular/core';

import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class QuestionsService {

  public API: string = 'http://localhost:3000/questions'

  constructor(
    public http: HttpClient
  ) {
  }

  getAllQuestion(): Observable<any> {
    return this.http.get(this.API)
  }

  addNewQuestion(question): Observable<any> {
    return this.http.post(this.API, question);
  }

  getQuestionById(questionId): Observable<any> {
    return this.http.get(this.API + '/' + questionId)
  }

  deleteQuestion(employeeId): Observable<any> {
    return this.http.delete(this.API + '/' + employeeId);
  }

  editQuestion(question, questionId): Observable<any> {
    return this.http.put(this.API + '/' + questionId, question);

  }
}
