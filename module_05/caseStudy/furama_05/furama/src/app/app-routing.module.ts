import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { EmployeeListComponent } from './components/employee/employee-list/employee-list.component';
import {CommonModule} from "@angular/common";
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {NgxPaginationModule} from 'ngx-pagination';
import { EmployeeAddComponent } from './components/employee/employee-add/employee-add.component';
import { EmployeeDeleteDialogComponent } from './components/employee/employee-delete-dialog/employee-delete-dialog.component';
import {MatDialogModule} from "@angular/material/dialog";
import {MaterialModule} from "./material.module";
import { EmployeeEditComponent } from './components/employee/employee-edit/employee-edit.component';



const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-add', component: EmployeeAddComponent},
  {path: 'employee-edit/:id', component: EmployeeEditComponent},

  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    MatDialogModule,
    MaterialModule

  ],
  exports: [RouterModule],
  declarations: [HomeComponent, PageNotFoundComponent, EmployeeListComponent, EmployeeAddComponent, EmployeeDeleteDialogComponent, EmployeeEditComponent]
})
export class AppRoutingModule { }
