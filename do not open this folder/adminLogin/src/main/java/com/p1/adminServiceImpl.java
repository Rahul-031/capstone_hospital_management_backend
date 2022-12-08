package com.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class adminServiceImpl implements adminService {
@Autowired
adminRepository repo;
	@Override
	public admin create(admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public admin delete(int id) {
		// TODO Auto-generated method stub
		admin a = findById(id);
		if(a!=null) {
			repo.delete(a);
		}
		return a;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public admin findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public admin update(admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
