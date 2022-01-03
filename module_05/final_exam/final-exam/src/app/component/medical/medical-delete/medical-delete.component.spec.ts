import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicalDeleteComponent } from './medical-delete.component';

describe('MedicalDeleteComponent', () => {
  let component: MedicalDeleteComponent;
  let fixture: ComponentFixture<MedicalDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MedicalDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MedicalDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
