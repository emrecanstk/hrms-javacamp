package com.emrecanstk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emrecanstk.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel, Integer> {

}
