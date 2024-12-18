package com.cico.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cico.Dto.patientDTO;
import com.cico.dao.patientDao;

import com.cico.entity.patient;

import jakarta.validation.Valid;

@Component
public class patientservices implements patientIservice {
	
	private static final Logger log = LoggerFactory.getLogger(patientservices.class);
	
	@Autowired
	private patientDao deo;
	
	@Override
	public ResponseEntity<patient> save(patient per) throws Exception{
		
      
     
		return deo.save(per);
				
		
	}

	@Override
	public ResponseEntity<List<patient>> getall() throws Exception {
		
        log.debug("I am in personcontroller class started");
		
		log.info("I am in personcontroller class  started");
		
		log.warn("I am in personcontroller class started");
		
		log.error("I am in personcontroller class started");
		
	    
        log.debug("I am in persoservice class completed");
		
		log.info("I am in persoservice class  completed");
		
		log.warn("I am in persoservice class completed");
		
		log.error("I am in persoservice class completed");
	    
		return deo.getall();
	}

	@Override
	public ResponseEntity<patient> getbyid(int pid) throws Exception {
		 
        log.debug("I am in personcontroller class started"+pid);
		
		log.info("I am in personcontroller class  started"+pid);
		
		log.warn("I am in personcontroller class started"+pid);
		
		log.error("I am in personcontroller class started"+pid);
		
		
		
        log.debug("I am in personcontroller class completed"+pid);
		
		log.info("I am in personcontroller class completed"+pid);
		
		log.warn("I am in personcontroller class completed"+pid);
		
		log.error("I am in personcontroller class completed"+pid);
		
		return deo.getbyid(pid);
	}

	@Override
	public ResponseEntity<String> delete(int pid) throws Exception {
		
		    log.debug("I am in personcontroller class started"+pid);
			
			log.info("I am in personcontroller class  started"+pid);
			
			log.warn("I am in personcontroller class started"+pid);
			
			log.error("I am in personcontroller class started"+pid);

		
		
		
		    log.debug("I am in personcontroller class completed"+pid);
			
			log.info("I am in personcontroller class completed"+pid);
			
			log.warn("I am in personcontroller class completed"+pid);
			
			log.error("I am in personcontroller class completed"+pid);
		
		return deo.delete(pid);
	}

	@Override
	public ResponseEntity<List<patient>> getbyname(String pname) throws Exception {
		
		 log.debug("I am in personcontroller class started"+pname);
			
			log.info("I am in personcontroller class  started"+pname);
			
			log.warn("I am in personcontroller class started"+pname);
			
			log.error("I am in personcontroller class started"+pname);
		    
		
		    log.debug("I am in personcontroller class completed"+pname);
			
			log.info("I am in personcontroller class completed"+pname);
			
			log.warn("I am in personcontroller class completed"+pname);
			
			log.error("I am in personcontroller class completed"+pname);
		return deo.getbyname(pname);
	}


}
