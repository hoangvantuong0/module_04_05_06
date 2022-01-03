import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateComponent } from './box/create/create.component';

import { DetailComponent } from './box/detail/detail.component';

import { MedicalListComponent } from './box/medical-list/medical-list.component';

import { MedicalDeleteComponent } from './box/medical-delete/medical-delete.component';
import {NgxPaginationModule} from "ngx-pagination";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {BrowserModule} from "@angular/platform-browser";
import {MedicalEditComponent} from "./box/medical-edit/medical-edit.component";



const routes: Routes = [
  {path: 'medical', component: MedicalListComponent},
  {path: 'medical/edit/:id', component: MedicalEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    NgxPaginationModule,
    FormsModule,
    Ng2SearchPipeModule,
    BrowserAnimationsModule,
    ReactiveFormsModule],
  exports: [RouterModule],
  declarations: [CreateComponent,
    DetailComponent,
    MedicalListComponent,
    MedicalEditComponent,
    MedicalDeleteComponent]
})
export class AppRoutingModule {
}
