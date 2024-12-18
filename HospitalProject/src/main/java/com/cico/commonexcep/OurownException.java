package com.cico.commonexcep;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OurownException {

	private static final Logger log = LoggerFactory.getLogger(OurownException.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> validationException(MethodArgumentNotValidException e)
	{
		log.debug("I am in validationException method"+e);
		
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(SQLException.class)
	public ResponseEntity<String> databaseException(SQLException e)
	{
		log.debug("I am in database relation Exception method"+e);
		
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> commonException(Exception e)
	{
		log.debug("I am in commonException method"+e);
		
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
