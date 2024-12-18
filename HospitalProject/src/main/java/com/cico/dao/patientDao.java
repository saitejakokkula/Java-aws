package com.cico.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cico.entity.patient;
import com.cico.repo.patientRepo;


import jakarta.validation.Valid;

@Component
public class patientDao {

	@Autowired
	private patientRepo jpa;
	private static final Logger log = LoggerFactory.getLogger(patientDao.class);

	
	public ResponseEntity<patient> save(patient per) throws Exception
	{
		
		log.debug("debug I am in dao class --"+per.toString());
		log.info("info I am in dao class --"+per.toString());
		log.warn("warn I am in dao class --"+per.toString());
		log.error("error I am in dao class --"+per.toString());
		
		

		jpa.save(per);
		
		return new ResponseEntity<patient>(HttpStatus.OK);
		
	}
	
	 public ResponseEntity<List<patient>> getall() throws Exception {
			
			
		    log.debug("I am in personcontroller class started");
			
			log.info("I am in personcontroller class  started");
			
			log.warn("I am in personcontroller class started");
			
			log.error("I am in personcontroller class started");
		
		     return new ResponseEntity<List<patient>>(jpa.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<patient> getbyid(int pid) throws Exception {
		
		 log.debug("I am in personcontroller class started"+pid);
			
			log.info("I am in personcontroller class  started"+pid);
			
			log.warn("I am in personcontroller class started"+pid);
			
			log.error("I am in personcontroller class started"+pid);
		
		   Optional<patient> data  = jpa.findById(pid);
		
		    log.debug("I am in class completed"+pid);
			
			log.info("I am in personcontroller class completed"+pid);
			
			log.warn("I am in personcontroller class completed"+pid);
			
			log.error("I am in personcontroller class completed"+pid);
		
		   return new ResponseEntity<patient>(data.get(),HttpStatus.OK);
	}

	public ResponseEntity<String> delete(int pid) throws Exception{
		
		   log.debug("I am in personcontroller class started"+pid);
			
			log.info("I am in personcontroller class  started"+pid);
			
			log.warn("I am in personcontroller class started"+pid);
			
			log.error("I am in personcontroller class started"+pid);
		
		     jpa.deleteById(pid);
		     
		     log.debug("I am in personcontroller class completed"+pid);
			
			log.info("I am in personcontroller class completed"+pid);
			
			log.warn("I am in personcontroller class completed"+pid);
			
			log.error("I am in personcontroller class completed"+pid);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	       public ResponseEntity<List<patient>> getbyname(String pname) throws Exception {
		
		    log.debug("I am in personcontroller class started"+pname);
			
			log.info("I am in personcontroller class  started"+pname);
			
			log.warn("I am in personcontroller class started"+pname);
			
			log.error("I am in personcontroller class started"+pname);
		
		    List<patient>  data = jpa.findByPname(pname);
		
		    log.debug("I am in personcontroller class completed"+pname);
			
			log.info("I am in personcontroller class completed"+pname);
			
			log.warn("I am in personcontroller class completed"+pname);
			
			log.error("I am in personcontroller class completed"+pname);
			
		return new ResponseEntity<List<patient>>(data, HttpStatus.CREATED);
	}

	
}

