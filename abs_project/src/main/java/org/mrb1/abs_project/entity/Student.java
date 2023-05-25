package org.mrb1.abs_project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
private int id;
private String name;
private String emaild;
@ManyToMany(cascade=CascadeType.ALL,mappedBy="students")
private List<Course>courses;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmaild() {
	return emaild;
}
public void setEmaild(String emaild) {
	this.emaild = emaild;
}
public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}


}
