import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {MedicalService} from "../../../service/medical.service";

@Component({
  selector: 'app-medical-delete',
  templateUrl: './medical-delete.component.html',
  styleUrls: ['./medical-delete.component.css']
})
export class MedicalDeleteComponent implements OnInit {
  public medicalName;
  public medicalId;

  constructor(
    public dialogRef: MatDialogRef<MedicalDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public medicalService: MedicalService
  ) {}

  ngOnInit(): void {
    this.medicalName = this.data.data1.medical_id;
    this.medicalId = this.data.data1.id;
  }

  deleteMedical() {
    this.medicalService.deleteMedical(this.medicalId).subscribe(data => {
      this.dialogRef.close();
    });
  }

}
