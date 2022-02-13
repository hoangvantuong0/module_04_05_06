import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VikordicDeleteComponent } from './vikordic-delete.component';

describe('VikordicDeleteComponent', () => {
  let component: VikordicDeleteComponent;
  let fixture: ComponentFixture<VikordicDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VikordicDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VikordicDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
