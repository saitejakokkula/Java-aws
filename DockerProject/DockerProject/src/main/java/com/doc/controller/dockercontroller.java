package com.doc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doc.dto.dockerDTO;
import com.doc.service.Idockerservice;

@RestController
@RequestMapping("dcontroller")
public class dockercontroller {
	
	@Autowired
	private Idockerservice ser;
	
	@PostMapping("save")
	public ResponseEntity<dockerDTO> save(@RequestBody dockerDTO adto) throws Exception{
		
	    return ser.save(adto);
	}
	@GetMapping("getbyid/{did}")
	public ResponseEntity<dockerDTO> getByid(@PathVariable("did") int did) throws Exception{
		
		return ser.getByid(did);
	}
	@GetMapping("getall")
	public ResponseEntity<List<dockerDTO>> getall() throws Exception {
		
		return ser.getall();
	}
	@GetMapping("getbyname/{dname}")
	public ResponseEntity<List<dockerDTO>> getbyname(@PathVariable("dname") String dname) throws Exception{
		
		return ser.getbyname(dname);
		
	}

}
