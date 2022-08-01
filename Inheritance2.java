
import java.util.Scanner;
class Employeee2{
	Scanner Sc= new Scanner(System.in);
	public String name,address;
	public int age;
	public long phoneNumber;
	public int salary;
	
	public void printSalary(){

	    System.out.println("Enter the salary "+salary);
}
	public void display() {
		System.out.println("Enter the name"+name);
		System.out.println("Enter the age"+age);
		System.out.println("Enter the phone number"+phoneNumber);
		System.out.println("Enter the address"+address);
		System.out.println("Enter the salary"+salary);
	}
}
class Officer extends Employeee2{
	String Specialisation;
	public void display() {
	
	System.out.println("Enter the name of officer: ");
    name=Sc.next();
	System.out.println("Enter the address of officer: ");
	address=Sc.next();
	System.out.println("Enter the phone number of officer: ");
	phoneNumber=Sc.nextInt();
	System.out.println("Enter the age of officer: ");
	age=Sc.nextInt();
	System.out.println("Enter the salary of officer: ");
	salary=Sc.nextInt();
	System.out.println("Enter the specialisation of officer: ");
	Specialisation=Sc.next();
	
}
}
class Manager extends Employeee2{
	String Department;
	public void display() {
	System.out.println("Enter the name of manager: ");
	name=Sc.next();
	System.out.println("Enter the address of manager: ");
	address=Sc.next();
	System.out.println("Enter the phone number of manager: ");
	phoneNumber=Sc.nextInt();
	System.out.println("Enter the age of manager: ");
	age=Sc.nextInt();
	System.out.println("Enter the salary of manager: ");
    salary=Sc.nextInt();
	System.out.println("Enter the department of manger: ");
	Department=Sc.next();
}
}
public class Inheritance2 {
	public static void main(String[] args) {
		Officer O=new Officer();
		Manager M=new Manager();
		O.display();
		
		
		M.display();
		
		
		System.out.println("\t\tDETAILS OF OFFICER");
		System.out.println("Name          : "+O.name);
		System.out.println("Address       : "+O.address);
		System.out.println("Phone number  : "+O.phoneNumber);
		System.out.println("Age           : "+O.age);
		System.out.println("Salary        : "+O.salary);
		System.out.println("Specialisation: "+O.Specialisation);
		
		System.out.println("\t\tDETAILS OF MANAGER");
		System.out.println("Name        : "+M.name);
		System.out.println("Address     : "+M.address);
		System.out.println("Phone number: "+M.phoneNumber);
		System.out.println("Age         : "+M.age);
		System.out.println("Salary      : "+M.salary);
		System.out.println("Department  : "+M.Department);
		
		}
}	