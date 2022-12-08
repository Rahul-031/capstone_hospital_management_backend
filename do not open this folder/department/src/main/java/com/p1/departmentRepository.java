package com.p1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface departmentRepository extends CrudRepository<department, Long>{
	void delete(department department);
	List findAll();
	department findById(int id);
	department save(department department);
}
