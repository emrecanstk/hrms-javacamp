package com.emrecanstk.hrms.business.abstracts;

import java.util.List;

import com.emrecanstk.hrms.entities.concretes.User;

public interface ProductService {
	List<User> getAll();
}
