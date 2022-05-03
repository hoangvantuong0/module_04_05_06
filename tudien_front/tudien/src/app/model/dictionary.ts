import {PartsOf} from "./parts-of";

export interface Dictionary {
  id: number;
  word: string;
  mean: string;
  example: string;
  partsOf: PartsOf
}
