package com.emrecanstk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emrecanstk.hrms.business.abstracts.SystemPersonnelService;
import com.emrecanstk.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.emrecanstk.hrms.entities.concretes.SystemPersonnel;

public class SystemPersonnelManager implements SystemPersonnelService {
	
	private SystemPersonnelDao systemPersonnelDao;
	
	@Autowired
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}


	@Override
	public List<SystemPersonnel> getAll() {
		// TODO Auto-generated method stub
		return this.systemPersonnelDao.findAll();
	}

}
