import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        
    int number1;
    int number2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first element");
    number1=sc.nextInt();
    System.out.println("Enter the second element");
    number2=sc.nextInt();

    int sum=number1+number2;
    int sub=number1-number2;
    int product=number1*number2;
    float div=(float)number1/number2;

    System.out.println("The sum of number1 and number2: "+sum);
    System.out.println("The difference of number1 and number2: "+sub);
    System.out.println("The product of number1 and number2: "+product);
    System.out.println("The division of number1 and number2: "+div);

    System.out.println(number1<<1);
    System.out.println(number1>>1);

    }

}
