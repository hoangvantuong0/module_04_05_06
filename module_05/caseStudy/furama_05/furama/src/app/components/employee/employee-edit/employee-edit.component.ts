import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../services/employee.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {

  public formEditEmployee: FormGroup
  public maxDate = new Date();
  public minDate = new Date(1900, 0, 1);
  public employeeOfId;

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
    public activatedRouter: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEditEmployee = this.formBuilder.group({
      fullName: ['', [Validators.required]],
      position: ['', [Validators.required]],
      academicLevel: ['', [Validators.required]],
      part: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      email: ['', [Validators.required, Validators.email]],
      phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]],
    })
    this.activatedRouter.params.subscribe(data => {
      this.employeeOfId = data.id;
      this.employeeService.getEmployeeById(this.employeeOfId).subscribe(data => {
        this.formEditEmployee.patchValue(data);
        console.log(this.formEditEmployee);
      });
    });
  }
  editEmployee(){
    this.employeeService.editEmployee(this.formEditEmployee.value, this.employeeOfId).subscribe(data=>{
      this.router.navigateByUrl('employee-list');
    });
  }
}
















