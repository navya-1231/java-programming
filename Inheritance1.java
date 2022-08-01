import java.util.Scanner;
class Employee{
	public int basicSalary,DA,HRA;
	public double grossSalary;
	public void display() {
		System.out.println("The Gross Salary of Engineer is "+grossSalary);
	}
	public void calcSalary(){
		this.grossSalary=basicSalary+(double)(DA*basicSalary)/100+(double)(HRA*basicSalary)/100;
		
	}
}
class Engineer extends Employee{
	public void salaryDetails(){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the  basic salary of the Engineer: ");
	this.basicSalary=input.nextInt();
	System.out.println("Enter the DA of the Engineer: ");
	this.DA=input.nextInt();
	System.out.println("Enter the HRA of the Engineer: ");
	this.HRA=input.nextInt();
	input.close();
}
	
}
public class Inheritance1 {
	public static void main(String[] args) {
		Engineer engg= new Engineer();
		engg.salaryDetails();
		engg.calcSalary();
		engg.display();
}
}