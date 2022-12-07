package com.p1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface patientRepository extends CrudRepository<patient, Long>{
	void delete(patient patient);
	List findAll();
	patient findById(int id);
	patient save(patient patient);
	
}
