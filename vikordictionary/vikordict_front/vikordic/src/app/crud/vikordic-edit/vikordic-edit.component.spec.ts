import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VikordicEditComponent } from './vikordic-edit.component';

describe('VikordicEditComponent', () => {
  let component: VikordicEditComponent;
  let fixture: ComponentFixture<VikordicEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VikordicEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VikordicEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
