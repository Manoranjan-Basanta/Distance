
package org.mrb1.abs_project.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mrb1.abs_project.entity.Customer;
import org.mrb1.abs_project.util.SessionFactoryUtil;

public class BankRepository {
public void saveCustomer(Customer customer) {
	SessionFactory factory=SessionFactoryUtil.getSessionfactory();
	Session session=factory.openSession();
	Transaction transaction =session.beginTransaction();
	session.merge(customer);
	transaction.commit();
}
}
