import {Injectable} from '@angular/core';
import {Dictionary} from "../model/dictionary";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionary: Dictionary[] = [
    {
      id: 1,
      word: 'cat',
      mean: 'con mèo'
    },
    {
      id: 2,
      word: 'dog',
      mean: 'con chó'
    },
    {
      id: 3,
      word: 'rain',
      mean: 'mưa'
    },
    {
      id: 4,
      word: 'door',
      mean: 'cánh cửa'
    }
  ];

  constructor() {
  }

  getAll() {
    return this.dictionary;
  }

  getById(id: number) {
    return this.dictionary.find(x => x.id === id);
  }
}
