package org.mrb1.abs_project;

import java.util.ArrayList;
import java.util.List;

import org.mrb1.abs_project.Repository.StudentRepository;
import org.mrb1.abs_project.entity.Course;
import org.mrb1.abs_project.entity.Student;

public class App2 {
	public static void main(String[] args) {
		Course course = new Course();
		course.setName("java");
		course.setCredits("25");
		Course course2 = new Course();
		course2.setName("python");
		course2.setCredits("25");
		Course course3 = new Course();
		course3.setName("Hibernate");
		course3.setCredits("25");
		List <Course> list= new ArrayList<>();
		list.add(course);
		list.add(course2);
		list.add(course3);
		Student s = new Student();
		s.setName("debasish");
		s.setEmaild("deb@gmail.com");
		s.setCourses(list);
		
	       Student s1 = new Student();
		   s1.setName("abc");
		   s1.setEmaild("abc@gmail.com");
		   s1.setCourses(list);
		   Student s2 = new Student();
		   s2.setName("Bijay");
		   s2.setEmaild("bijay@gmail.com");
		   s2.setCourses(list);
		 List<Student> slist = new ArrayList<>();
		 slist.add(s);
		 slist.add(s1);
		 slist.add(s2);
		 
		
		 
		StudentRepository repository = new StudentRepository();
            repository.saveStudent(slist);
	}

}
