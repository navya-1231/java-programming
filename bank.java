import java.util.Scanner;  
class BankDetails {  
    private String acc_no;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
     
    public void openAccount() {  
        System.out.print("\nEnter Account No   : ");  
        acc_no = sc.next();  
        System.out.print("Enter Account type : ");  
        acc_type = sc.next();  
        System.out.print("Enter Name         : ");  
        name = sc.next();  
        System.out.print("Enter Balance      : ");  
        balance = sc.nextLong();  
    }  
     
    public void showAccount() {  
        System.out.println("\nName of account holder   : " + name);  
        System.out.println("Account no.              : " + acc_no);  
        System.out.println("Account type             : " + acc_type);  
        System.out.println("Balance                  : " + balance);  
    }  
    
    public void deposit() {  
        long amt;  
        System.out.println("\nEnter the amount  to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt; 
        System.out.println("\nBalance after deposit: " + balance); 
    }  
     
    public void withdrawal() {  
        long amt;  
        System.out.println("\nEnter the amount to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("\nBalance after withdrawal: " + balance);  
        } else {  
            System.out.println("\nYour balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    
    public boolean search(String ac_no) {  
        if (acc_no.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
public class exp10 {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("\nEntr the number of account holders are there : ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }  
         
        int ch;  
        do {  
            System.out.println("\n ___Banking System Application___");  
            System.out.println("\n1. Display all account details \n2. Search by Account number \n3. Deposit the amount \n4. Withdraw the amount \n5.Exit ");  
            System.out.println("\nEnter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("\nEnter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("\nSearch failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("\nEnter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("\nSearch failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("\nEnter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("\nSearch failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("\nSee you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  
