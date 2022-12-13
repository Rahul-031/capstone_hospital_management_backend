package com.p1.appointment;
import java.util.List;
public interface appointmentService {
	public appointment create(appointment appointment);
	public appointment delete(int id);
	public List findAll();
	public appointment findById(int id);
	public appointment update(appointment appointment);
}
