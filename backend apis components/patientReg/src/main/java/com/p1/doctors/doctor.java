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
String specialization;
String qualification;
String registration_date;
int department_id;
int slot_id;
String age;
String pass;
String status;

public doctor() {
	
	// TODO Auto-generated constructor stub
}
public doctor(int id, String first_name, String last_name, String gender, String dob, String email, String phone_no,
		String specialization, String qualification, String registration_date, int department_id, int slot_id,
		String age, String pass,String status) {
	
	this.id = id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.gender = gender;
	this.dob = dob;
	this.email = email;
	this.phone_no = phone_no;
	this.specialization = specialization;
	this.qualification = qualification;
	this.registration_date = registration_date;
	this.department_id = department_id;
	this.slot_id = slot_id;
	this.age = age;
	this.pass = pass;
	this.status=status;
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
public String getRegistration_date() {
	return registration_date;
}
public void setRegistration_date(String registration_date) {
	this.registration_date = registration_date;
}
public int getDepartment_id() {
	return department_id;
}
public void setDepartment_id(int department_id) {
	this.department_id = department_id;
}
public int getSlot_id() {
	return slot_id;
}
public void setSlot_id(int slot_id) {
	this.slot_id = slot_id;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public void setStatus(String status) {
	this.status = status;
}
public String getStatus() {
	return status;
}
@Override
public String toString() {
	return "doctor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
			+ ", dob=" + dob + ", email=" + email + ", phone_no=" + phone_no + ", specialization=" + specialization
			+ ", qualification=" + qualification + ", registration_date=" + registration_date + ", department_id="
			+ department_id + ", slot_id=" + slot_id + ", age=" + age + ", pass=" + pass + "]";
}

}