import java.util.Scanner;
public class frequency {
	public static void main(String[] args) {
		String str;
		char s;
		int count=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		str=sc.next();
		
		System.out.println("Enter the character: ");
		s=sc.next().charAt(0);
		int length=str.length();
		for(int i=0;i<length;i++) {
			if(str.charAt(i)==s) {
				count++;
			}
		}
		System.out.println("The frequency of character is "+count);
	
		
	}

}


