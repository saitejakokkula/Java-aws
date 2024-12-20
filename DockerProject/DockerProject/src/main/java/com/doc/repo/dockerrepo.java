package com.doc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.doc.entity.docker;
@Repository
public interface dockerrepo extends JpaRepository<docker, Integer> {

	public abstract   List<docker> findByDname(String dname) throws Exception;
}
