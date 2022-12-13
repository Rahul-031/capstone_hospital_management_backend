package com.p1.appointment;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.p1.appointment.appointment;

@Repository
public interface appointmentRepository extends JpaRepository<appointment, Long>{
	
	void delete(appointment appointment);
	
	@Query("select a from appointment a where status ='active'")
	List findAll();
	
	@Query("select a from appointment a where status ='active'")
	appointment findById(int id);
	
	appointment save(appointment appointment);
	
}
