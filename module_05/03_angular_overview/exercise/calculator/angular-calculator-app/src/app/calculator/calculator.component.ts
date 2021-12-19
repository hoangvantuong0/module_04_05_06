import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  numberOne: number;
  numberTwo: number;
  cal: string;
  result: string;

  calculator() {
    if (this.cal === '+') {
      console.log(this.cal);
      this.result = ' = ' + (this.numberOne + this.numberTwo).toString();
    } else if (this.cal === '-') {
      this.result = ' = ' + (this.numberOne - this.numberTwo).toString();
    } else if (this.cal === '*') {
      this.result = ' = ' + (this.numberOne * this.numberTwo).toString();
    } else{
      if (this.numberTwo !== 0) {
        this.result = ' = ' + (this.numberOne / this.numberTwo).toString();
      }else{
        this.result = 'Cant division by 0';
      }
    }
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
