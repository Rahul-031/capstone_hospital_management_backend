package com.p1.doctors;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="doctor")
public class doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String first_name;
String last_name;
String gender;
String dob;
String email;
String phone_no;
String id_proof;
String id_no;
String specialization;
String qualification;
String pass;
public doctor() {
	super();
}
public doctor(int id, String first_name, String last_name, String gender, String dob, String email, String phone_no,
		String id_proof, String id_no, String specialization, String qualification, String pass) {
	super();
	this.id = id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.gender = gender;
	this.dob = dob;
	this.email = email;
	this.phone_no = phone_no;
	this.id_proof = id_proof;
	this.id_no = id_no;
	this.specialization = specialization;
	this.qualification = qualification;
	this.pass = pass;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone_no() {
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
public String getId_proof() {
	return id_proof;
}
public void setId_proof(String id_proof) {
	this.id_proof = id_proof;
}
public String getId_no() {
	return id_no;
}
public void setId_no(String id_no) {
	this.id_no = id_no;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "doctor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
			+ ", dob=" + dob + ", email=" + email + ", phone_no=" + phone_no + ", id_proof=" + id_proof + ", id_no="
			+ id_no + ", specialization=" + specialization + ", qualification=" + qualification + ", pass=" + pass
			+ "]";
}

}
