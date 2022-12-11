package com.p1.Slots;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.patient.patient;
@Service
public class SlotsServiceImpl implements SlotService {
	
	@Autowired
	SlotsRepository sr;
	

	@Override
	public Slots delete(int id) {
		// TODO Auto-generated method stub
		Slots s = findById(id);
		if(s!=null) {
			sr.delete(s);
		}
		return s;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Slots findById(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public Slots update(Slots Slots) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slots create(Slots Slots) {
		// TODO Auto-generated method stub
		return sr.save(Slots);
	}

}
