package org.mrb1.abs_project;

import java.util.ArrayList;
import java.util.List;

import org.mrb1.abs_project.Repository.BankRepository;
import org.mrb1.abs_project.entity.BankAccount;
import org.mrb1.abs_project.entity.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BankAccount b1=new BankAccount();
       b1.setName("SBI");
       b1.setAccountNumber("404362233815");
       BankAccount b2 = new BankAccount();
       b2.setName("ICICI");
       b2.setAccountNumber("2354168tutu");
       BankAccount b3= new BankAccount();
       b3.setName("HDFC");
       b3.setAccountNumber("523641587manoranjan");
       
       List<BankAccount> list= new ArrayList<BankAccount>();
       list.add(b1);
       list.add(b2);
       list.add(b3);
       Customer customer = new Customer();
       customer.setName("shoaib");
       customer.setAddress("bbsr");
       BankRepository repo= new BankRepository();
       repo.saveCustomer(customer);
    }
}
