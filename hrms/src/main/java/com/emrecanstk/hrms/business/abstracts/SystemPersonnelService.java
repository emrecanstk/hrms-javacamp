package com.emrecanstk.hrms.business.abstracts;

import java.util.List;

import com.emrecanstk.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	List<SystemPersonnel> getAll();
}
