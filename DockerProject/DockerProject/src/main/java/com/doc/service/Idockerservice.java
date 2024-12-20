package com.doc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.doc.dao.dockerdao;
import com.doc.dto.dockerDTO;

@Service
public class Idockerservice implements dockerservice {

	@Autowired
	private dockerdao dao;

	@Override
	public ResponseEntity<dockerDTO> save(dockerDTO adto) throws Exception {
		// TODO Auto-generated method stub
		return dao.save(adto);
	}

	@Override
	public ResponseEntity<dockerDTO> getByid(int did) throws Exception {
		// TODO Auto-generated method stub
		return dao.getByid(did);
	}

	@Override
	public ResponseEntity<List<dockerDTO>> getall() throws Exception {
		// TODO Auto-generated method stub
		return dao.getall();
	}

	@Override
	public ResponseEntity<List<dockerDTO>> getbyname(String dname) throws Exception {
		// TODO Auto-generated method stub
		return dao.getbyname(dname);
	}

}
