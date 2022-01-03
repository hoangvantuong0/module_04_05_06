import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {MedicalService} from "../../../service/medical.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-medical-edit',
  templateUrl: './medical-edit.component.html',
  styleUrls: ['./medical-edit.component.css']
})
export class MedicalEditComponent implements OnInit {

  public formEdit: FormGroup;
  public medicalId;
  // public maxDate = new Date();
  // public minDate = new Date(2015, 0, 1);

  constructor(
    public formBuilder: FormBuilder,
    public medicalService: MedicalService,
    public router: Router,
    public activatedRouter: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEdit = this.formBuilder.group({
      medical_id: ['', [Validators.required]],
      patient_id: ['', [Validators.required]],
      name: ['', [Validators.required]],
      date_in: ['', [Validators.required]],
      date_out: ['', [Validators.required]],
      reason: ['', [Validators.required]],
      method: ['', [Validators.required]],
      doctor: ['', [Validators.required]],


      // idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      // salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      // email: ['', [Validators.required, Validators.email]],
      // phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      // address: ['', [Validators.required]]
    });
    this.activatedRouter.params.subscribe(data => {
      this.medicalId = data.id;
      this.medicalService.getMedicalById(this.medicalId).subscribe(data => {
        this.formEdit.patchValue(data);
        console.log(this.formEdit);
      });
    });
  }
  editMedical(){
    this.medicalService.editMedicals(this.formEdit.value, this.medicalId).subscribe(data=>{
      this.router.navigateByUrl('medical-list');
    });
  }
}
