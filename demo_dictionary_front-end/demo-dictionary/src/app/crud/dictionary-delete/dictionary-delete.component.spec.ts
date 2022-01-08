import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DictionaryDeleteComponent } from './dictionary-delete.component';

describe('DictionaryDeleteComponent', () => {
  let component: DictionaryDeleteComponent;
  let fixture: ComponentFixture<DictionaryDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DictionaryDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DictionaryDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
