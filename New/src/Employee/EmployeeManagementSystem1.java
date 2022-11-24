package Employee;


import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
	
class EmployeeEx {
	private int emp_Id;
	private String emp_name;
	private int age;
	private String email;
	private String position;
	private int salary;
    private String contact;
	
	EmployeeEx(int  emp_Id,String emp_name,int age,String email,String position ,int salary,String contact)
	{
		this.emp_Id=emp_Id;
		this.emp_name=emp_name;
		this.age=age;
		this.email=email;
		this.position=position;
		this.salary=salary;
		this.contact=contact;
		
	}
	public int getemp_Id()
	{
		return emp_Id;
	}
	public String getemp_name()
	{
		return emp_name;
	}
    public int getage(){
		      return age;
		   }
	public String getemail()
	{
		return email;
	}
	public String getposition()
	{
		return position;
	}
	public int getsalary()
	{
		return salary;
	}
	public String getcontact(){
		return contact;
	}
	public String toString(){
		return emp_Id+" "+emp_name+" "+age+" "+email+" "+position+" "+salary+" "+contact;
	
	}
	}
public class EmployeeManagementSystem1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter username:");//username is user
	        username = s.nextLine();
	        System.out.print("Enter password:");//password is user
	        password = s.nextLine();
	        if(username.equals("user") && password.equals("user"))
	        {
	        System.out.println("Login Successful");
	        System.out.println("\t\t******************************************");
	        System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
	        System.out.println("\t\t******************************************");
	        System.out.println("\t\t\t   ----------------------------");
	        System.out.println("\t\t\t     WELCOME TO ABC COMPANY");
	        System.out.println("\t\t\t   ----------------------------");
	        List<EmployeeEx> e=new ArrayList<EmployeeEx>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int ch;
		do{
			
		System.out.println("1.Add Employee details:");
		System.out.println("2.Display Employee details:");
		System.out.println("3.Search Employee details:");
		System.out.println("4.Update Employee details:");
		System.out.println("5.Delete Employee details:");
		System.out.println("6.Exit From Employee Recodes:");
		
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1://add
				System.out.print("Enter the employee ID: ");
				int emp_Id=sc.nextInt();
				System.out.print("Enter the employee Name: ");
				String emp_name=sc1.next();
				System.out.print("Enter employee age : ");
	            int age = s.nextInt();
				System.out.print("Enter the employee email: ");
				String email=sc1.next();
				System.out.print("Enter the employee Position: ");
				String position=sc1.next();
				System.out.print("Enter the employee Salary: ");
				int salary=sc.nextInt();
				System.out.print("Enter the employee contact Number: ");
				String contact=sc.next();
			    e.add(new EmployeeEx(emp_Id,emp_name,age,email,position,salary,contact));// collection  is using to call the constructor to add the employee details
		        break;	
		        
			case 2://Display
				System.out.println("--------------------------------");
				Iterator<EmployeeEx> i= e.iterator();
				while(i.hasNext())
				{
					EmployeeEx ex=i.next();
					System.out.println(ex);
				}
				System.out.println("--------------------------------");
				break;
				
			case 3://Search
				boolean found =false;
				System.out.println("Enter the Employee Id to search :");
				emp_Id=sc.nextInt();
				System.out.println("--------------------------------");
				i=e.iterator();
				while(i.hasNext())
				{
					EmployeeEx ex=i.next();
					if(ex.getemp_Id()==emp_Id)
						{
						System.out.println(ex);
				found =true;
						}
					}
			
				if(!found){
					System.out.println("Record not found");
				}
				System.out.println("--------------------------------");
				break;
			case 4://update
				found =false;
				System.out.println("Enter the Employee Id to Update :");
				emp_Id=sc.nextInt();
				ListIterator<EmployeeEx>l=e.listIterator();
				i=e.iterator();
				while(l.hasNext())
				{
					EmployeeEx ex=l.next();
					if(ex.getemp_Id()==emp_Id)
						{
						System.out.println(ex);
					System.out.print("Enter new Name:");
					emp_name=sc1.next();
					System.out.print("Enter new age : ");
                    age = s.nextInt();
					System.out.print("Enter new salary:");
					salary=sc1.nextInt();
					System.out.print("Enter new email:");
					email=sc1.next();
					System.out.print("Enter new position:");
					position=sc1.next();
					System.out.print("Enter new contact:");
					contact=sc1.next();
					l.set(new EmployeeEx( emp_Id, emp_name,age,email, position, salary, contact));
				        found =true;
						}
					}
			
				if(!found){
					System.out.println("Record not found");
				}
				else{
					System.out.println("Employee Record is  Updated Successfully");	
				}
			
				break;
			case 5://Delete
				found =false;
				System.out.println("Enter the Employee Id to Delete :");
				emp_Id=sc.nextInt();
				System.out.println("--------------------------------");
				i=e.iterator();
				while(i.hasNext())
				{
					EmployeeEx ex=i.next();
					if(ex.getemp_Id()==emp_Id)
						{
						System.out.println(ex);
						i.remove();
				        found =true;
						}
					}
			
				if(!found){
					System.out.println("Record not found");
				}
				else{
					System.out.println("Employee Record is Deleted Successfully");	
				}
				System.out.println("--------------------------------");
				break;
			
			case 6://Exit

			    System.out.println("\n********************************************");
			    System.out.println("               Thank You                       ");
			    System.out.println("*******************************************");
			    System.out.println("\t\t EXIT\n");
			    System.exit(0);
				
		 }
		}while(ch!=0);

	        }

else
{
    System.out.println("Login Failed..!");
    System.out.println("Cann't Access Employee Management System");
    System.out.println("Please enter correct user name and password");
    
}
	
}      
	
}



