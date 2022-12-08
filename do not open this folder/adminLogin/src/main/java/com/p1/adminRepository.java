package com.p1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface adminRepository extends CrudRepository<admin, Long>{
	void delete(admin admin);
	List findAll();
	admin findById(int id);
	admin save(admin admin);
}
