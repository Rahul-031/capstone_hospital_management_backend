package com.p1.appointment;
import javax.persistence.Column;
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
int id;
@Column(name = "patientname")
String patientname;
@Column(name = "doctorname")
String doctorname;
public appointment() {
	
}
public appointment(int id, String patientname, String doctorname) {
	
	this.id = id;
	this.patientname = patientname;
	this.doctorname = doctorname;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
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
	return "appointment [id=" + id + ", patientname=" + patientname + ", doctorname="
			+ doctorname + "]";
}

}
