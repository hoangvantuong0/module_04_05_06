import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import {VikordicListComponent} from './crud/vikordic-list/vikordic-list.component';
import {VikordicDeleteComponent} from './crud/vikordic-delete/vikordic-delete.component';
import {VikordicCreateComponent} from './crud/vikordic-create/vikordic-create.component';
import {VikordicEditComponent} from './crud/vikordic-edit/vikordic-edit.component';


const routes: Routes = [
  {path: 'dictionary', component: VikordicListComponent},
  {path: 'dictionary-create', component: VikordicCreateComponent},
  {path: 'dictionary-edit/:id', component: VikordicEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],
  exports: [RouterModule],
  declarations: [
    VikordicListComponent,
    VikordicDeleteComponent,
    VikordicCreateComponent,
    VikordicEditComponent]
})
export class AppRoutingModule { }
