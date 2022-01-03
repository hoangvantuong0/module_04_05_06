import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class MedicalService {
  public API: string = 'http://localhost:3000/medical'

  constructor(
    public http: HttpClient
  ) {
  }

  getAllMedical(): Observable<any> {
    return this.http.get(this.API)
  }

  addNewMedical(medical): Observable<any> {
    return this.http.post(this.API, medical);
  }

  getMedicalById(medicalId): Observable<any> {
    return this.http.get(this.API + '/' + medicalId)
  }

  deleteMedical(medicalId): Observable<any> {
    return this.http.delete(this.API + '/' + medicalId);
  }

  editMedicals(question, questionId): Observable<any> {
    return this.http.put(this.API + '/' + questionId, question);

  }
}
