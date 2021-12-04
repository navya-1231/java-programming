import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextInt(); 

        int i;
        for(i=2;i<=number/2;i++){
            if(number%i==0){
                break;
            }
        }
        i--;
        
        if(i==number/2){
            System.out.println("The given number is prime number");
        }
        else{
            System.out.println("The given number is not prime number");
        }
    }
}
