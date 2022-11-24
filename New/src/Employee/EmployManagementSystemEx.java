package Employee;
import java.util.*;

import java.io.*;
//Write a program in Employee management System project



class Loginpage
{
	public void page()
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
class Main_Menu
{
  public void menu()
  {
   
    System.out.println("\n\nPress 1 : Add an Employee Details");
    System.out.println("Press 2 : See an Employee Details ");
    System.out.println("Press 3 : Remove an Employee");
    System.out.println("Press 4 : Update Employee Details");
    System.out.println("Press 5 : Exit the EMS Portal");

  }
}

//To add details of Employee 

class Employee_Add
{
    public void createFile()
    {
        Scanner sc=new Scanner(System.in);

        Employ_Detail emp=new Employ_Detail();
        emp.getInfo();
        
        try{
            File f1=new File("file"+emp.employ_id+".txt");
            if(f1.createNewFile()){
                FileWriter myWriter = new FileWriter("file"+emp.employ_id+".txt");
                myWriter.write("Employee ID:"+emp.employ_id+"\n"+"Employee Name     :"+emp.name+"\n"+
                "Father's Name     :"+emp.father_name+"\n"+"Employee Contact  :"+emp.employ_contact+"\n"+
                "Email Information :"+emp.email+"\n"+"Employee position :"+emp.position+"\n"+
                "Employee Salary   :"+emp.employ_salary);
                myWriter.close();
                System.out.println("\nEmployee has been Added :\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        
           else {
                System.out.println("\nEmployee already exists :");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        }
        catch(Exception e){System.out.println(e);}
   }
}

//Take Employee details

class Employ_Detail
{
    String name;
    String father_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee's name : ");
        name=sc.nextLine();
        System.out.print("Enter Employee's Father name : ");
        father_name=sc.nextLine();
        System.out.print("Enter Employee's ID : ");
        employ_id=sc.nextLine();
        System.out.print("Enter Employee's Email ID : ");
        email=sc.nextLine();
        System.out.print("Enter Employee's Position : ");
        position=sc.nextLine();
        System.out.print("Enter Employee contact Info : ");
        employ_contact=sc.nextLine();
        System.out.print("Enter Employee's Salary : ");
        employ_salary=sc.nextLine();
    }
}

//To Show details of Employee 

class Employee_Show
{
  public void viewFile(String s) throws IOException
  {
    File file = new File("file"+s+".txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine())
     {
       System.out.println(sc.nextLine());
     }
   }
}

//To Remove Employee 

class Employee_Remove
{
    public void removeFile(String ID)
    {

    File file = new File("file"+ID+".txt");
      if(file.exists())
       {
         if(file.delete());
         {
           System.out.println("\nEmployee has been removed Successfully");
         }
       }
      else
       {
            System.out.println("\nEmployee does not exists :( ");
       }
     }
}

// To Update details of Employee 
class Employee_Update
{
  public void updateFile(String s,String o,String n) throws IOException
  {
   File file = new File("file"+s+".txt");
   Scanner sc = new Scanner(file);
   String fileContext="";
   while (sc.hasNextLine())
       {
         fileContext =fileContext+"\n"+sc.nextLine();
       }
   FileWriter myWriter = new FileWriter("file"+s+".txt");
   fileContext = fileContext.replaceAll(o,n);
   myWriter.write(fileContext);
   myWriter.close();

  }
}


//To Exit from the EMS Portal 

class Code_Exit
{
  public void out()
  {
    System.out.println("\n********************************************");
    System.out.println("     Thank You For Visiting come again  ");
    System.out.println("*******************************************");
    System.out.println("\t\t EXIT\n");
    System.exit(0);
  }
}


// Main Class 
class EmployManagementSystemEx
{
  public static void main(String arg[])
  {
	  
	Loginpage p=new Loginpage();
	p.page();
	  
    //To clear the output Screen 
	  
    
    Employee_Show epv =new Employee_Show();
    Scanner sc=new Scanner(System.in);
    int i=0;

    //Calling Main menu Class function
   Main_Menu obj1 = new Main_Menu();
    obj1.menu();

    //Initializing loop for Menu Choices 
    while(i<6)
    {

      System.out.print("\nPlease Enter choice :");
      i=Integer.parseInt(sc.nextLine());

      // Switch Case Statements 
      switch(i)
      {
        case 1:
        {
        // Creating class's object and calling Function using that object 
        Employee_Add ep =new Employee_Add();
        ep.createFile();
        obj1.menu();
        break;
        }
        case 2:
        {
          System.out.print("\nPlease Enter Employee's ID :");
          String s=sc.nextLine();
          try
          {
            epv.viewFile(s);}
            catch(Exception e){System.out.println(e);
            }
            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
            obj1.menu();
            break;
          }

        case 3:
        {
          System.out.print("\nPlease Enter Employee's ID :");
          String s=sc.nextLine();
          Employee_Remove epr =new Employee_Remove();
          epr.removeFile(s);

          System.out.print("\nPress Enter to Continue...");
          sc.nextLine();
          obj1.menu();
          break;
        }
        case 4:
        {
            System.out.print("\nPlease Enter Employee's ID :");
            String I=sc.nextLine();
            try
            {
              epv.viewFile(I);
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
            Employee_Update epu = new Employee_Update();
            System.out.print("Please Enter the detail you want to Update :");
    	     System.out.print("\nFor Example :\n");
            System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
            String s=sc.nextLine();
            System.out.print("Please Enter the Updated Info :");
            String n=sc.nextLine();
            try
            {
              epu.updateFile(I,s,n);

              System.out.print("\nPress Enter to Continue...");
              sc.nextLine();
              obj1.menu();
              break;
            }
            catch(IOException e)
            {
              System.out.println(e);
            }
        }
        case 5:
        {
          Code_Exit obj = new Code_Exit();
          obj.out();
        }
      }
    }
  }
}

