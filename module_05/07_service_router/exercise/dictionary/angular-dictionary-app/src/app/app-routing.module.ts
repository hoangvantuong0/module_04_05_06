import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListComponent} from "./dictionary/list/list.component";
import { DetailComponent } from './dictionary/detail/detail.component';
// import {ListComponent} from "./dictonary/list/list.component";
// import {DetailComponent} from "./dictonary/detail/detail.component";


// @ts-ignore
const routes: Routes = [
  {
    path: 'home',
    component: ListComponent,
    children:[
      {
        path:':id',
        component: DetailComponent
      }
    ]

  },
  {path: '', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
