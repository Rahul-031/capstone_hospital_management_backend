package com.p1.appointment;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "appointment")
public class appointment {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
int appointment_id;
String patientname;
String doctorname;
public appointment() {
	super();
}
public appointment(int appointment_id, String patientname, String doctorname) {
	super();
	this.appointment_id = appointment_id;
	this.patientname = patientname;
	this.doctorname = doctorname;
}
public int getAppointment_id() {
	return appointment_id;
}
public void setAppointment_id(int appointment_id) {
	this.appointment_id = appointment_id;
}
public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
@Override
public String toString() {
	return "appointment [appointment_id=" + appointment_id + ", patientname=" + patientname + ", doctorname="
			+ doctorname + "]";
}

}
