package com.p1.departments;

import java.util.List;

public interface departmentService {
	public department create(department department);
	public department delete(int id);
	public List findAll();
	public department findById(int id);
	public department update(department department);
}
