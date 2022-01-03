import {Component, Inject, OnInit} from '@angular/core';
import {Medical} from "../../model/medical";
import {Subscription} from "rxjs";
import {MedicalService} from "../../service/medical.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-medical-delete',
  templateUrl: './medical-delete.component.html',
  styleUrls: ['./medical-delete.component.css']
})
export class MedicalDeleteComponent implements OnInit {
  id: number;
  medical: Medical;
  private subscription: Subscription;

  constructor(
    private medicalService: MedicalService,
    public dialogRef: MatDialogRef<MedicalDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
  ) {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  ngOnInit(): void {
    console.log(this.data.customerData.id);
    this.medical = this.data.customerData;
  }

  deleteMedical() {
    console.log(this.medical.id);
    this.subscription = this.medicalService.deleteMedical(this.medical.id).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
