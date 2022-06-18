package com.emrecanstk.hrms.business.abstracts;

import java.util.List;

import com.emrecanstk.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
}
