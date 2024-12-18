package com.cico.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cico.entity.patient;
@Repository
public interface patientRepo extends JpaRepository<patient, Integer>{

	public abstract List<patient> findByPname(String pname) throws Exception;
}
