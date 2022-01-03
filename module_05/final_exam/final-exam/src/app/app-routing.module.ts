import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { PageNotFoundComponent } from './component/page-not-found/page-not-found.component';
import { MedicalListComponent } from './component/medical/medical-list/medical-list.component';
import {BrowserModule} from "@angular/platform-browser";
import { MedicalDeleteComponent } from './component/medical/medical-delete/medical-delete.component';
import {MaterialModule} from "./material.module";
import { MedicalAddComponent } from './component/medical/medical-add/medical-add.component';
import {ReactiveFormsModule} from "@angular/forms";
import {MatDatepickerModule} from "@angular/material/datepicker";
import { MedicalEditComponent } from './component/medical/medical-edit/medical-edit.component';
import {NgxPaginationModule} from "ngx-pagination";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'medical-list', component: MedicalListComponent},
  {path: 'medical-add', component: MedicalAddComponent},
  {path: 'medical-edit/:id', component: MedicalEditComponent},
  {path: '**', component: PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    BrowserModule,
    MaterialModule,
    MatDatepickerModule,
    ReactiveFormsModule,
    NgxPaginationModule

  ],
  exports: [RouterModule],
  declarations: [HomeComponent,
    PageNotFoundComponent,
    MedicalListComponent,
    MedicalDeleteComponent,
    MedicalAddComponent,
    MedicalEditComponent]
})
export class AppRoutingModule { }
