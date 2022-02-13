import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VikordicCreateComponent } from './vikordic-create.component';

describe('VikordicCreateComponent', () => {
  let component: VikordicCreateComponent;
  let fixture: ComponentFixture<VikordicCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VikordicCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VikordicCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
