package com.doc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.doc.dto.dockerDTO;

@Component
public interface dockerservice {

	
	public abstract ResponseEntity<dockerDTO> save(dockerDTO adto) throws Exception ;
	
	public abstract ResponseEntity<dockerDTO> getByid(int did) throws Exception;
	
	public abstract ResponseEntity<List<dockerDTO>> getall() throws Exception;
	
	public abstract ResponseEntity<List<dockerDTO>> getbyname(String dname) throws Exception;
}
