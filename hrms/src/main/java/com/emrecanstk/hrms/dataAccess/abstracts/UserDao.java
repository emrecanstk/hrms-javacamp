package com.emrecanstk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emrecanstk.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	
	
}
