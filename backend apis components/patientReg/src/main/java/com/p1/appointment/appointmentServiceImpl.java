package com.p1.appointment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.appointment.appointment;
import com.p1.appointment.appointmentRepository;
import com.p1.appointment.appointmentService;

@Service
public class appointmentServiceImpl implements appointmentService {
	
@Autowired
appointmentRepository repo;
	
@Override
public appointment create(appointment appointment) {
	
	return repo.save(appointment);
}

@Override
public appointment delete(int id) {
	// TODO Auto-generated method stub
	appointment a = findById(id);
	if(a!=null) {
		repo.delete(a);
	}
	return a;
}

@Override
public List<appointment> findAll() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

@Override
public appointment findById(int id) {
	// TODO Auto-generated method stub
	return repo.findById(id);
}

@Override
public appointment update(appointment appointment) {
	// TODO Auto-generated method stub
	return null;
}

}
