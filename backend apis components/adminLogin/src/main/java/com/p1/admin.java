package com.p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String username;
String pass;
public admin() {
	super();
}
public admin(int id, String username, String pass) {
	super();
	this.id = id;
	this.username = username;
	this.pass = pass;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "admin [id=" + id + ", username=" + username + ", pass=" + pass + "]";
}

}
