package com.p1.doctors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class doctorServiceImpl implements doctorService {
@Autowired
doctorRepository repo;
	@Override
	public doctor create(doctor doctor) {
		// TODO Auto-generated method stub
		return repo.save(doctor);
	}

	@Override
	public doctor delete(int id) {
		// TODO Auto-generated method stub
		doctor d = findById(id);
		if(d!=null) {
			repo.delete(d);
		}
		return d;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public doctor findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public doctor update(doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

}
