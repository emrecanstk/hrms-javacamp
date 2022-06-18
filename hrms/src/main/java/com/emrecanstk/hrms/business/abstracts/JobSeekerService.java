package com.emrecanstk.hrms.business.abstracts;

import java.util.List;

import com.emrecanstk.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
}
