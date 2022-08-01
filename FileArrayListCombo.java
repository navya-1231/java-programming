import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

public class FileArrayListCombo {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input=new Scanner(new File("input.txt"));
        ArrayList<String>words=new ArrayList<>();
        while(input.hasNext()){
            String nextWord=input.next();
            words.add(nextWord);
        }
        words.sort(Comparator.naturalOrder());
        System.out.println(" ");
        
    }
    
}
