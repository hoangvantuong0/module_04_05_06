import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DictionaryCreateComponent } from './dictionary-create.component';

describe('DictionaryCreateComponent', () => {
  let component: DictionaryCreateComponent;
  let fixture: ComponentFixture<DictionaryCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DictionaryCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DictionaryCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
