import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Dictionary} from "../model/dictionary";
import {PartsOfSpeech} from "../model/parts-of-speech";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  public API: string = 'http://localhost:8080/api/dictionary';
  public API_POS: string = 'http://localhost:8080/api/dictionary/parts';
  constructor(
    public http: HttpClient
  ) {

  }

  // getAllDictionary(): Observable<any> {
  //   return this.http.get(this.API)
  // }


  // getAllDictionary(): Observable<Dictionary[]> {
  //   return this.http.get<Dictionary[]>(this.API);
  // }


  getAllDictionary(): Observable<Dictionary[]> {
    return this.http.get<Dictionary[]>(this.API + '/list');
  }



  getAllParts(): Observable<PartsOfSpeech[]> {
    return this.http.get<PartsOfSpeech[]>(this.API_POS + '/list');
  }




  // addNewDictionary(dictionary): Observable<any> {
  //   return this.http.post(this.API, dictionary);
  // }

  addNewDictionary(dictionary: Dictionary): Observable<Dictionary> {
    return this.http.post<Dictionary>(this.API + '/create', dictionary);
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
