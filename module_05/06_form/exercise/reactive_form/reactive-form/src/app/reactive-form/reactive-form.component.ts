import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  rfForm: FormGroup;
  constructor(private _formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.rfForm = this._formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['',[Validators.required], Validators.minLength(6) ],
      confirmPassword:['',[Validators.required,Validators.minLength(6)]],
      country: ['', [Validators.required]],
      age: ['', [Validators.required],Validators.min(18)],
      gender: ['', [Validators.required]],
      phone: ['', [Validators.required], Validators.pattern('^\\+84\\d{9,10}$')]

    })
  }

  onSubmit() {

  }
}
