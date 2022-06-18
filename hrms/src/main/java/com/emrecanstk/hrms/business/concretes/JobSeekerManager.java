package com.emrecanstk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emrecanstk.hrms.business.abstracts.UserService;
import com.emrecanstk.hrms.dataAccess.abstracts.JobSeekerDao;
import com.emrecanstk.hrms.entities.concretes.User;

public class JobSeekerManager implements UserService {
	
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.jobSeekerDao.findAll();
	}

}
