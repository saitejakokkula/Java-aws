package com.cico.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cico.Dto.patientDTO;
import com.cico.entity.patient;




@Service
public interface patientIservice {

	
	public abstract ResponseEntity<patient> save(patient per) throws Exception;
	
	public abstract ResponseEntity<patient> getbyid(int pid) throws Exception;
	
	public abstract ResponseEntity<List<patient>> getall() throws Exception;
	
	public abstract ResponseEntity<String> delete(int pid) throws Exception;
	
	public abstract ResponseEntity<List<patient>> getbyname(String pname) throws Exception;
}
