package com.p1.admin;

import java.util.List;

public interface adminService {
	public admin create(admin admin);
	public admin delete(int id);
	public List findAll();
	public admin findById(int id);
	public admin update(admin admin);
}
