import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Dictionary} from "../model/dictionary";

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

  search(word, mean): Observable<Dictionary[]> {
    return this.http.get<Dictionary[]>(this.API + '?word_like=' + word + '&mean_like=' + mean);
  }

  // searchDictionary(keyWord): Observable<Dictionary[]>{
  //   return this.http.get<Dictionary[]>(this.API + '?word_like=' + keyWord);
  // return this.http.get<Dictionary[]>(this.API + '?mean_like=' + word);
  // }
  searchDictionary(keyWord): Observable<Dictionary[]> {
    return this.http.get<Dictionary[]>(this.API + '?' + keyWord);

  }
}
