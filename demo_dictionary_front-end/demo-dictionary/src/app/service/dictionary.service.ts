import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  public API: string = 'http://localhost:8080/api/dictionary'

  constructor(
    public http: HttpClient
  ) {
  }

  getAllDictionary(): Observable<any> {
    return this.http.get(this.API)
  }

  addNewDictionary(dictionary): Observable<any> {
    return this.http.post(this.API, dictionary);
  }

  getDictionaryById(dictionaryId): Observable<any> {
    return this.http.get(this.API + '/' + dictionaryId)
  }

  deleteDictionary(dictionaryId): Observable<any> {
    return this.http.delete(this.API + '/' + dictionaryId);
  }

  editDictionary(dictionary, dictionaryId): Observable<any> {
    return this.http.put(this.API + '/' + dictionaryId, dictionary);

  }
}
