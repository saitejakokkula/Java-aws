package com.doc.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.doc.dto.dockerDTO;
import com.doc.entity.docker;
import com.doc.repo.dockerrepo;

@Component
public class dockerdao {
	
	@Autowired
	private dockerrepo jpa;
	
	@Autowired
	private ModelMapper mp;

	public ResponseEntity<dockerDTO> save(dockerDTO adto) throws Exception {
		
	 docker data = mp.map(adto, docker.class);
	 jpa.save(data);
		return new ResponseEntity<dockerDTO>(adto, HttpStatus.CREATED);
	}

	public ResponseEntity<dockerDTO> getByid(int did) {
		
	    Optional<docker> adata = jpa.findById(did);
		 dockerDTO doc  = mp.map(adata, dockerDTO.class);
		return new ResponseEntity<dockerDTO>(doc, HttpStatus.CREATED);
	}

	public ResponseEntity<List<dockerDTO>> getall() throws Exception {
		
		List<docker> doc = jpa.findAll();
		dockerDTO[] docdata = mp.map(doc, dockerDTO[].class);
		List<dockerDTO> ldata = Arrays.asList(docdata);
		
		return new ResponseEntity<List<dockerDTO>>(ldata, HttpStatus.OK);
	}

	public ResponseEntity<List<dockerDTO>> getbyname(String dname) throws Exception {
		
		 List<docker> dock =  jpa.findByDname(dname);
		 dockerDTO[] docdata = mp.map(dock, dockerDTO[].class);
		 List<dockerDTO> ldata = Arrays.asList(docdata);
		 
		return new ResponseEntity<List<dockerDTO>>(ldata, HttpStatus.OK);
	}

}
