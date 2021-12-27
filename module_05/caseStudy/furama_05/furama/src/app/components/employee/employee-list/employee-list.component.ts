import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../../services/employee.service';
import {EmployeeDeleteDialogComponent} from "../employee-delete-dialog/employee-delete-dialog.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public employees;
  term: string;
  p: string | number;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmployees().subscribe(data=> {
      this.employees = data;
      console.log(this.employees);
    })
  }

  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(dataOfEmployee=>{
      const dialogRef = this.dialog.open(EmployeeDeleteDialogComponent, {
        width: '500px',
        data: { data1: dataOfEmployee},
        disableClose:true

      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    })

  }
}






