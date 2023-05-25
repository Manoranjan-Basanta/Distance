package org.mrb1.abs_project.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mrb1.abs_project.entity.Student;
import org.mrb1.abs_project.util.SessionFactoryUtil;

public class StudentRepository {
public void saveStudent(List<Student>slist) {
	SessionFactory factory=SessionFactoryUtil.getSessionfactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	for(Student s:slist) {
		session.save(s);
	}
	transaction.commit();
}
}
