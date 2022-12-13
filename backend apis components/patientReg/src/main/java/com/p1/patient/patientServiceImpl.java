package com.p1.patient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientServiceImpl implements patientService {
		
	@Autowired
	patientRepository repo;
		
	@Override
	public patient create(patient patient) {
		
		return repo.save(patient);
	}

	@Override
	public patient delete(int id) {
		// TODO Auto-generated method stub
		patient p = findById(id);
		if(p!=null) {
			repo.delete(p);
		}
		return p;
	}

	@Override
	public List<patient> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public patient findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		
		return repo.setPatientInfoById(id);
	}

}
