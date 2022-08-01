import java.util.*;
import java.util.Scanner;
public class exceptionHandling{
    public static void main(String[] args) throws ArithmeticException  {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number");
            int a=sc.nextInt();
            System.out.println("Enter the second number");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("result is"+c); 
        }
        catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("Exception occured");
        }
        finally{
            System.out.println("thank you");
        }
    }   
}
