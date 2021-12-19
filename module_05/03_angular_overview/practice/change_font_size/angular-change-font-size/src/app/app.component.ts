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

// import { Component, OnInit } from '@angular/core';
//
// @Component({
//   selector: 'app-font-size-editor',
//   templateUrl: './font-size-editor.component.html',
//   styleUrls: ['./font-size-editor.component.css']
// })
// export class FontSizeEditorComponent implements OnInit {
//   fontSize = 14;
//   constructor() { }
//
//   ngOnInit() {
//   }
  // changeFontSizeValue(fontSize) {
  //   this.fontSize = fontSize;
  // }
// }
