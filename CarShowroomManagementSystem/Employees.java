package CarShowroomManagementSystem;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility 
{
	String emp_id;
	
	String emp_name;
	
	int emp_age;
	 
	String emp_department;
	

	public void get_details()
	{
	  System.out.println("ID            : "+emp_id);
	  System.out.println("Name          : "+emp_name);
	  System.out.println("Age           :  "+emp_age);
	  System.out.println("Dempartment   : "+emp_department);
	  System.out.println("Showroom Name : "+showroom_name);
	  
	}
	
	
	public void set_details()
	{
	  Scanner sc=new Scanner(System.in);
	  UUID uuid= UUID.randomUUID();
	  emp_id = String.valueOf(uuid);
	  System.out.println("=========================== *** ENTER EMPLOYEES DETAILS *** ===========================");
	  System.out.println();
	  System.out.println("EMPLOYEES NAME :");
	  emp_name=sc.nextLine();
	  System.out.println(("EMPLOYEES AGE :"));
	  emp_age=sc.nextInt();
	  sc.nextLine();
	  System.out.println("EMPLOYEES DEPARTMENT :");
	  emp_department=sc.nextLine();
	  System.out.println("SHOWROOM NAME :");
	  showroom_name=sc.nextLine();
	}
}
