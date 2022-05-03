import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import {ListComponent} from "./component/list/list.component";
import {EditComponent} from "./component/edit/edit.component";
import {DeleteComponent} from "./component/delete/delete.component";
import {CreateComponent} from "./component/create/create.component";

const routes: Routes = [
  {path: 'dictionary', component: ListComponent},
  {path: 'dictionary-create', component: CreateComponent},
  {path: 'dictionary-edit/:id', component: EditComponent}
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
  declarations: [CreateComponent, ListComponent, EditComponent, DeleteComponent]
})
export class AppRoutingModule { }
