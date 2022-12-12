package com.p1.doctors;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepository extends JpaRepository<doctor, Long>{
	
	void delete(doctor doctor);
	
	List findAll();
	
//	@Query("select d from doctor d where department_id = ?1 ")
	List<doctor>findAllDoctorByDid(int id);
	
//	doctor findByName(String name);
	
	doctor save(doctor doctor);
}
