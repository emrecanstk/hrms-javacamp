package com.emrecanstk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emrecanstk.hrms.business.abstracts.UserService;
import com.emrecanstk.hrms.dataAccess.abstracts.EmployerDao;
import com.emrecanstk.hrms.entities.concretes.User;

public class EmployerManager implements UserService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}

}
