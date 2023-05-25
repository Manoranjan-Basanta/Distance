package org.mrb1.abs_project.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mrb1.abs_project.entity.BankAccount;
import org.mrb1.abs_project.entity.Course;
import org.mrb1.abs_project.entity.Customer;
import org.mrb1.abs_project.entity.Student;

//import com.manoranjan.appservice.entity.ApplicationEntity;
//import com.manoranjan.appservice.entity.BankAccount;
//import com.manoranjan.appservice.entity.Customer;
//import com.manoranjan.appservice.entity.RegistrationDetails;
//import com.manoranjan.appservice.entity.VehicleEntity;
//import com.manoranjan.appservice.util.MysqlConnectionPropertiesUtil;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory = null;
	static {
		Configuration cfg = new Configuration();
		Properties properties=MysqlConnectionProperties.getConnectionProperties();
		cfg.setProperties(properties);
        cfg.addAnnotatedClass(Customer.class);
        cfg.addAnnotatedClass(BankAccount.class);
        cfg.addAnnotatedClass(Course.class);
        cfg.addAnnotatedClass(Student.class);
		sessionFactory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
