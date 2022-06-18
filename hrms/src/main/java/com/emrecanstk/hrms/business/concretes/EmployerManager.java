package com.emrecanstk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emrecanstk.hrms.business.abstracts.EmployerService;
import com.emrecanstk.hrms.dataAccess.abstracts.EmployerDao;
import com.emrecanstk.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}

}
