import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { QuestionListComponent } from './component/question/question-list/question-list.component';
import { HomeComponent } from './component/home/home.component';
import { PageNotFoundComponent } from './component/page-not-found/page-not-found.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserModule} from "@angular/platform-browser";
import { QuestionDeleteComponent } from './component/question/question-delete/question-delete.component';
import { QuestionAddComponent } from './component/question/question-add/question-add.component';
import {MatDatepickerModule} from "@angular/material/datepicker";

import {Ng2SearchPipeModule} from "ng2-search-filter";
import {MaterialModule} from "./material.module";
import { QuestionEditComponent } from './component/question/question-edit/question-edit.component';
import { QuestionDetailComponent } from './component/question/question-detail/question-detail.component';
import {NgxPaginationModule} from "ngx-pagination";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'question-list', component: QuestionListComponent},
  {path: 'question-add', component: QuestionAddComponent},
  {path: 'question-edit/:id', component: QuestionEditComponent},
  {path: 'question-detail/:id', component: QuestionDetailComponent},


  {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    BrowserModule,
    ReactiveFormsModule,
    MatDatepickerModule,

    Ng2SearchPipeModule,
    MaterialModule,
    NgxPaginationModule

  ],
  exports: [RouterModule,
    FormsModule
  ],
  declarations: [QuestionListComponent, HomeComponent, PageNotFoundComponent,
    QuestionDeleteComponent, QuestionAddComponent, QuestionEditComponent, QuestionDetailComponent]
})
export class AppRoutingModule { }
