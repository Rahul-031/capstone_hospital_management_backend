package com.p1.Slots;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Slots")
public class Slots {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String morning;
	String afternoon;
	String evening;
	public Slots(int id, String morning, String afternoon, String evening) {
		super();
		this.id = id;
		this.morning = morning;
		this.afternoon = afternoon;
		this.evening = evening;
	}
	public Slots() {
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getAfternoon() {
		return afternoon;
	}
	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}
	public String getEvening() {
		return evening;
	}
	public void setEvening(String evening) {
		this.evening = evening;
	}
	@Override
	public String toString() {
		return "Slots [id=" + id + ", morning=" + morning + ", afternoon=" + afternoon + ", evening=" + evening + "]";
	}
}
