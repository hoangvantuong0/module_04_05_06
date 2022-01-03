// material.module.ts
import {NgModule} from '@angular/core';

import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatNativeDateModule} from '@angular/material/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material/dialog';
import {EmployeeDeleteDialogComponent} from './components/employee/employee-delete-dialog/employee-delete-dialog.component';
import {MatDatepickerModule} from '@angular/material/datepicker';


@NgModule({
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  exports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [ MatDatepickerModule ],
  entryComponents: [EmployeeDeleteDialogComponent]
})

export class MaterialModule {}

















