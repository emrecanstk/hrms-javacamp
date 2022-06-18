package com.emrecanstk.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emrecanstk.hrms.business.abstracts.SystemPersonnelService;
import com.emrecanstk.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/systempersonnels")
public class SystemPersonnelsController {
	
	private SystemPersonnelService systemPersonnelService;
	
	@Autowired
	public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
		super();
		this.systemPersonnelService = systemPersonnelService;
	}
	
	@GetMapping("/getall")
	public List<SystemPersonnel> getAll() {
		return this.systemPersonnelService.getAll();
	}
	
	
}
