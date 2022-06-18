package com.emrecanstk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emrecanstk.hrms.business.abstracts.UserService;
import com.emrecanstk.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.emrecanstk.hrms.entities.concretes.User;

public class SystemPersonnelManager implements UserService {
	
	private SystemPersonnelDao systemPersonnelDao;
	
	@Autowired
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.systemPersonnelDao.findAll();
	}

}
