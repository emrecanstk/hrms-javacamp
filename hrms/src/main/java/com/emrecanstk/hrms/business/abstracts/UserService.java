package com.emrecanstk.hrms.business.abstracts;

import java.util.List;

import com.emrecanstk.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
