import java.util.Scanner;
public class NprimeNumbers {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        num=sc.nextInt();
        int i=1,j=1;
        while(i<=num){
            if(j%2!=0){
                System.out.println(i+"."+j+"\t");
                i=i+1;
            }
            j=j+1;
        }
    }
}
