package com.p1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface doctorRepository extends CrudRepository<doctor, Long>{
	void delete(doctor doctor);
	List findAll();
	doctor findById(int id);
	doctor save(doctor doctor);
}
