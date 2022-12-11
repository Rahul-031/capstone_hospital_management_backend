package com.p1.Slots;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface SlotsRepository extends JpaRepository<Slots, Long> {
void delete(Slots Slots);
	
	List findAll();
	
	Slots findById(int id);
	
	Slots save(Slots Slots);
}
