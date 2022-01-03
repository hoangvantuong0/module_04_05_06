import {Component, OnInit, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../../../services/employee.service";


@Component({
  selector: 'app-employee-delete-dialog',
  templateUrl: './employee-delete-dialog.component.html',
  styleUrls: ['./employee-delete-dialog.component.css']
})
export class EmployeeDeleteDialogComponent implements OnInit {
  public employeeOfFullName;
  public employeeOfId;

  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService
    ) {}

  ngOnInit(): void {
    this.employeeOfFullName = this.data.data1.fullName;
    this.employeeOfId = this.data.data1.id;
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employeeOfId).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
















