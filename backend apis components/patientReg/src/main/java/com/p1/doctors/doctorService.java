package com.p1.doctors;

import java.util.List;

public interface doctorService {
	public doctor create(doctor doctor);
//	public doctor delete(int id);
	public List findAll();
	public List<doctor> findById(int id);
	public doctor update(doctor doctor);
}
