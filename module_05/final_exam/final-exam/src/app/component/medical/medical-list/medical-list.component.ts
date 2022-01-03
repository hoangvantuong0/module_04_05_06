import { Component, OnInit } from '@angular/core';
import {MedicalService} from "../../../service/medical.service";
import {MedicalDeleteComponent} from "../medical-delete/medical-delete.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-medical-list',
  templateUrl: './medical-list.component.html',
  styleUrls: ['./medical-list.component.css']
})
export class MedicalListComponent implements OnInit {
  public medicals;
  term: any;
  p: string | number;

  constructor(
    public medicalService: MedicalService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.medicalService.getAllMedical().subscribe(data => {
      this.medicals = data;
      console.log(this.medicals)
    })
  }
  openDialog(medicalId): void {
    this.medicalService.getMedicalById(medicalId).subscribe(dataOfMedical => {
      const dialogRef = this.dialog.open(MedicalDeleteComponent, {
        width: '500px',
        data: { data1: dataOfMedical},
        disableClose: true

      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });

  }
}
