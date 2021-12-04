 import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		String str;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		
		System.out.println("Enter the string is "+str);
		int length=str.length();
		for(int i=0;i<(length/2);i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				flag=1;
				break;
		}
}
		if(flag==0) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
			
		}
}
}

