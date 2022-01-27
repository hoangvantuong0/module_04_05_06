import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryListComponent } from './crud/dictionary-list/dictionary-list.component';
import {NgxPaginationModule} from "ngx-pagination";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import { DictionaryDeleteComponent } from './crud/dictionary-delete/dictionary-delete.component';

import { DictionaryCreateComponent } from './crud/dictionary-create/dictionary-create.component';
import { DictionaryEditComponent } from './crud/dictionary-edit/dictionary-edit.component';
import { DictionaryDetailComponent } from './crud/dictionary-detail/dictionary-detail.component';


const routes: Routes = [
  {path: 'dictionary', component: DictionaryListComponent},
  {path: 'dictionary-create', component: DictionaryCreateComponent},
  {path: 'dictionary-edit/:id', component: DictionaryEditComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    FormsModule,
    Ng2SearchPipeModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    NgxPaginationModule
  ],
  exports: [RouterModule],
  declarations: [
    DictionaryListComponent,
    DictionaryDeleteComponent,
    DictionaryCreateComponent,
    DictionaryEditComponent,
    DictionaryDetailComponent
  ]
})
export class AppRoutingModule { }
