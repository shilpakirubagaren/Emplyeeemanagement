// Employee management System project
package Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
class Login
{
	public void Check()
	{
String Username,Password;
Scanner s=new Scanner(System.in);
System.out.println("Enter the user name:");
Username=s.next();
System.out.println("Enter the password:");
Password=s.next();	
System.out.println("\t\t******************************************");
System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
System.out.println("\t\t******************************************");
System.out.println("\t\t\t   ----------------------------");
System.out.println("\t\t\t     WELCOME TO ABC COMPANY");
System.out.println("\t\t\t   ----------------------------");
	}
	

}

class Employee{
   private int emp_ID;
   private String ename;
   private int age;
   private String email;
   private String position;
   private int salary;
   private String contact;

   Employee(int emp_ID, String ename,int age,String email, String position,int salary,String contact){
      this.emp_ID = emp_ID;
      this.ename = ename;
      this.age=age;
      this.email=email;
      this.position=position;
      this.salary = salary;
      this.contact=contact;
  
      
   }

   public int getEmp_ID(){
      return emp_ID;
   }
   public String getEname(){
	      return ename;
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
   public int getSalary(){
      return salary;
   }
  
   public String getcontact(){
		return contact;
	}
   

   public String toString(){
      return emp_ID+" "+ename+" "+age+" "+email+" "+position+" "+salary+" "+contact;
   }
}

public class EmployeeManagementSystem{
   public static void main(String[] args) {
	    Login p=new Login();
		p.Check();
      List<Employee> c = new ArrayList<Employee>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int ch;
      do{
         System.out.println("1.Add Employee details");
         System.out.println("2.Display Employee details");
         System.out.println("3.Search Employee details");
         System.out.println("4.Delete Employee details");
         System.out.println("5.Update Employee details");
         System.out.println("6.Exit From Employee details:");
         System.out.print("Enter Your Choice : ");
         ch = s.nextInt();

         switch(ch){
            case 1:
               System.out.print("Enter EmpID : ");
               int emp_ID = s.nextInt();
               System.out.print("Enter EmpName : ");
               String ename = s1.next();
               System.out.print("Enter Empage : ");
               int age = s.nextInt();
               System.out.print("Enter email : ");
               String email = s1.next();
               System.out.print("Enter position : ");
               String position = s1.next();
               System.out.print("Enter salary:");
               int salary=s.nextInt();
               System.out.print("Enter contact:");
               String contact=s1.next();
               c.add(new Employee(emp_ID,ename,age,email,position,salary,contact));
            break;
            case 2:
               System.out.println("----------------------------");
               Iterator<Employee> i = c.iterator();
               while(i.hasNext()){
                  Employee e = i.next(); 
                  System.out.println(e);
               }
               System.out.println("----------------------------");
            break;
            case 3:
               boolean found = false;
               System.out.print("Enter EmpID to Search :");
               emp_ID = s.nextInt();
               System.out.println("----------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  Employee e = i.next();
                  if(e.getEmp_ID() == emp_ID)  {
                     System.out.println(e);
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }
               System.out.println("----------------------------");
            break;

            case 4:
               found = false;
               System.out.print("Enter EmpID to Delete :");
               emp_ID = s.nextInt();
               System.out.println("----------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  Employee e = i.next();
                  if(e.getEmp_ID() == emp_ID)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println(" Employee Record is Deleted Successfully...!");
               }

               System.out.println("----------------------------");
            break;
            case 5:
               found = false;
               System.out.print("Enter EmpID to Update :");
               emp_ID = s.nextInt();
               
               ListIterator<Employee>li = c.listIterator();
               while(li.hasNext()){
                  Employee e = li.next();
                  if(e.getEmp_ID() == emp_ID)  {
                     System.out.print("Enter new Name : ");
                     ename = s1.next();
                     System.out.print("Enter Employee age : ");
                     age = s.nextInt();
                     System.out.print("Enter new email : ");
                     email = s1.next();
                     System.out.print("Enter new position : ");
                     position = s1.next();
                     System.out.print("Enter new Salary : ");
                     salary = s.nextInt();
                     System.out.print("Enter new contact : ");
                     contact = s1.next();
                     
                     li.set(new Employee(emp_ID,ename,age,email,position,salary,contact));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println("Employee Record is Updated Successfully...!");
               }

               
            break;
            case 6:
            	 System.out.println("\n********************************************");
 			    System.out.println("     Thank You For Visiting come again  ");
 			    System.out.println("*******************************************");
 			    System.out.println("\t\t EXIT\n");
 			    System.exit(0);

            
         }
      }while(ch!=0);
   }
}

