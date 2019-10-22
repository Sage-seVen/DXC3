import { TestBed } from '@angular/core/testing';

import { DocservService } from './docserv.service';

describe('DocservService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DocservService = TestBed.get(DocservService);
    expect(service).toBeTruthy();
  });
});
