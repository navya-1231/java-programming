import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        String str,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        /*if(str.equals(rev)){
            System.out.println("palindrome string");
        }else{
            System.out.println("not palindrome");
        }*/
        System.out.println("reverse of  the string "+rev); 
    }
}
