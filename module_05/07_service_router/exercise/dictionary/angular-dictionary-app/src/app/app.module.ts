import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {AppComponent} from "./app.component";
import {ListComponent} from "./dictionary/list/list.component";
import {DetailComponent} from "./dictionary/detail/detail.component";
import {AppRoutingModule} from "./app-routing.module";



let DictionaryComponent;

@NgModule({
  declarations: [
    AppComponent,
    DictionaryComponent,
    ListComponent,
    DetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
