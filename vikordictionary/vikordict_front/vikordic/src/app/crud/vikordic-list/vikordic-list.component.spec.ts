import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VikordicListComponent } from './vikordic-list.component';

describe('VikordicListComponent', () => {
  let component: VikordicListComponent;
  let fixture: ComponentFixture<VikordicListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VikordicListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VikordicListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
