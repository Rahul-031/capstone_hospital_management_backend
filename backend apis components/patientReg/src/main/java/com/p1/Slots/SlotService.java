package com.p1.Slots;

import java.util.List;


public interface SlotService {
	public Slots create(Slots Slots);
	public Slots delete(int id);
	public List findAll();
	public Slots findById(int id);
	public Slots update(Slots Slots);
}
