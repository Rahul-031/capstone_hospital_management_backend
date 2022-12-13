package com.p1.patient;
import java.util.List;
public interface patientService {
	public patient create(patient patient);
	public patient delete(int id);
	public List findAll();
	public patient findById(int id);
	public int update(int id);
}
