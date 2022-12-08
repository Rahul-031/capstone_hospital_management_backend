package com.p1.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class departmentServiceImpl implements departmentService {
@Autowired
departmentRepository repo;
	@Override
	public department create(department department) {
		// TODO Auto-generated method stub
		return repo.save(department);
	}

	@Override
	public department delete(int id) {
		// TODO Auto-generated method stub
		department d = findById(id);
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
	public department findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public department update(department department) {
		// TODO Auto-generated method stub
		return null;
	}

}
