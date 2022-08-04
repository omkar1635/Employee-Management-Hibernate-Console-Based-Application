package com.project.main.Project_Hibernate_Employee_Details;

import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorTimesTenDatabaseImpl;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Employee Management System using Hibernate" );
        
        Configuration configuration = new Configuration();
       	configuration.configure("hibernate.cfg.xml");
       	SessionFactory sessionFactory = configuration.buildSessionFactory();
       	Session session = sessionFactory.openSession();
        

    	Scanner scanner = new Scanner(System.in);
        int count=0;
        while(count!=1) {
        	System.out.println("\nSelect choice :");
        	System.out.println("1: Show Employee details");
        	System.out.println("2: Insert Employee details");
        	System.out.println("3: Update Employee details");
        	System.out.println("4: Delete Employee details\n");
        	
        	int input = 0;
        	
        	input = scanner.nextInt();
        	switch (input) {
			case 1:
				Transaction transaction = session.beginTransaction();
				Query query = session.createQuery("from Employee_Class_Hibernate_Project");
//				Employee_Class_Hibernate_Project employee = (Employee_Class_Hibernate_Project) session.get(Employee_Class_Hibernate_Project.class, session)
				List<Employee_Class_Hibernate_Project> list =  query.getResultList();
				if(list.size()==0) {
					System.out.println("No Data found...!!");
				}
				else {
					Formatter fmt = new Formatter();  
					fmt.format("%7s %7s %7s\n", "Id", "Name", "Salary");  
					for(Employee_Class_Hibernate_Project employee : list) {
						fmt.format("%7s %7s %7s\n", employee.getId(), employee.getName(),employee.getSalary());  
					}
					System.out.println(fmt);
				}
				transaction.commit();
				break;
				
			case 2:
				Transaction transaction1 = session.beginTransaction();
				try {
					
					System.out.println("Enter ID : ");
					int id = scanner.nextInt(); 
					System.out.println("Enter Name :");
					String name = scanner.next();
					scanner.nextLine();
					System.out.println("Enter Salary :");
					int salary = scanner.nextInt();
					
					Employee_Class_Hibernate_Project employee = new Employee_Class_Hibernate_Project();
					employee.setId(id);
					employee.setName(name);
					employee.setSalary(salary);
					
					session.save(employee);
					System.out.println("Data saved successfully...!!");
					
					
				}catch (Exception e) {
					System.out.println("ID is present already...!! Use another");
				}
				transaction1.commit();
				break;

			case 3:
				Transaction transaction2 = session.beginTransaction();
				System.out.println("Enter Id to update ");
				int updating = scanner.nextInt();
				Employee_Class_Hibernate_Project employee1 = (Employee_Class_Hibernate_Project) session.get(Employee_Class_Hibernate_Project.class, updating);
				
				if(employee1==null) {
					System.out.println("ID is not present in DB..!!");
				}
				else {
					System.out.println("Enter Name to Update : ");
					String nameString = scanner.next();
					scanner.nextLine();
					System.out.println("Enter salary to update : ");
					int sal = scanner.nextInt();
					employee1.setName(nameString);
					employee1.setSalary(sal);
				
					System.out.println("Value updated successfully..!!");
				}
				transaction2.commit();
				break;
				
			case 4:
				Transaction transaction3 = session.beginTransaction();
				System.out.println("Enter Id to delete ");
				int delete = scanner.nextInt();
				Employee_Class_Hibernate_Project employee2 = (Employee_Class_Hibernate_Project) session.get(Employee_Class_Hibernate_Project.class, delete);
				
				if(employee2==null) {
					System.out.println("ID is not present in DB..!!");
				}
				else {
					session.delete(employee2);
					
					System.out.println("Value Delete successfully..!!");
				}
				transaction3.commit();
				break;
				
			default:
				System.out.println("Please select valid input..!!");
				break;
			}

        }
    }
}
