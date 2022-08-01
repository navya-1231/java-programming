import java.io.*;
import java.util.Scanner;
import javax.swing.text.StyledEditorKit.ForegroundAction;
class{
    public static void main(String[] args)throws IOException
    {
        File fin=new File("mynum.txt");
        if(fin.exists())
        {
            System.out.println("exists");
        }else
        {
            fin.createNewFile();
            System.out.println("created");
        }
    }
    FileOutputStream fout=new FileOutputStream("mynum.txt");
    Scanner sc=new Scanner(System.in)
    System.out.print("no of elements");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.println("Enter the number"+i+":");
        int num=sc.nextInt();
        fout.write(num);
    }
    System.out.print("data added successfully");
    int i=0;
    FileInputStream fin1=new FileInputStream("mynum.txt");
    while((i=fin1.read())!=-1)
        System.out.print(i);
    }
}
public class FileTest {
    public static void main(String[] args)throws IOException
    {
        File fin=new File("mynum.txt");
        if(fin.exists())
        {
            System.out.println("exists");
        }else
        {
            fin.createNewFile();
            System.out.println("created");
        }
    }
    FileOutputStream fout=new FileOutputStream("mynum.txt");
    Scanner sc=new Scanner(System.in)
    System.out.print("no of elements");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.println("Enter the number"+i+":");
        int num=sc.nextInt();
        fout.write(num);
    }
    System.out.print("data added successfully");
    int i=0;
    FileInputStream fin1=new FileInputStream("mynum.txt");
    while((i=fin1.read())!=-1)
        System.out.print(i);
    }

}
