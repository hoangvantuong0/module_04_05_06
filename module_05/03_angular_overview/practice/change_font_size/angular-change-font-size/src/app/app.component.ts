import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  fontSize = 14;
  title = 'angular-change-font-size';

  constructor() {
  }

  ngOnInit() {
  }

  changeFontSizeValue(fontSize) {
    this.fontSize = fontSize;
  }
}
