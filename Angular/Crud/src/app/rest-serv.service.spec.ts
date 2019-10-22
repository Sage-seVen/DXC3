import { TestBed } from '@angular/core/testing';

import { RestServService } from './rest-serv.service';

describe('RestServService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RestServService = TestBed.get(RestServService);
    expect(service).toBeTruthy();
  });
});
