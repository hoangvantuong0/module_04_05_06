import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {MedicalService} from "../../../service/medical.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-medical-add',
  templateUrl: './medical-add.component.html',
  styleUrls: ['./medical-add.component.css']
})
export class MedicalAddComponent implements OnInit {

  public formAdd: FormGroup;

  constructor(
    public formBuilder: FormBuilder,
    public medicalService: MedicalService,
    public router: Router
  ) {
  }

  ngOnInit() {
    this.formAdd = this.formBuilder.group({
      medical_id: ['', [Validators.required]],
      patient_id: ['', [Validators.required]],
      name: ['', [Validators.required]],
      date_in: ['', [Validators.required]],
      date_out: ['', [Validators.required]],
      reason: ['', [Validators.required]],
      method: ['', [Validators.required]],
      doctor: ['', [Validators.required]],

    });
  }

  addNewMedicall() {
    this.medicalService.addNewMedical(this.formAdd.value).subscribe(data => {
      this.router.navigateByUrl('medical-list');
    });
  }
}
