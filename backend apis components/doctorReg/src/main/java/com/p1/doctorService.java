package com.p1;

import java.util.List;

public interface doctorService {
	public doctor create(doctor doctor);
	public doctor delete(int id);
	public List findAll();
	public doctor findById(int id);
	public doctor update(doctor doctor);
}
