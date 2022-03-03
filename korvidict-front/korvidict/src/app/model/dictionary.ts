import {PartsOfSpeech} from "./parts-of-speech";

export interface Dictionary {
  id: number;
  word: string;
  chinese: string;
  sino: string;
  mean: string;
  derivative: string;
  particle: string;
  note: string;

  partsOfSpeech: PartsOfSpeech;
}
