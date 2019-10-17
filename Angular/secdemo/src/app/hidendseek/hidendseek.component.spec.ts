import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HidendseekComponent } from './hidendseek.component';

describe('HidendseekComponent', () => {
  let component: HidendseekComponent;
  let fixture: ComponentFixture<HidendseekComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HidendseekComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HidendseekComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
