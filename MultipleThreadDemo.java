import java.io.FileWriter;
import java.io.IOException;

class Odd extends Thread{
	
	public void run() {
		try {
			FileWriter fr = new FileWriter("odd.txt");
			for(int i=1;i<=20;i+=2) {
				fr.write(Integer.toString(i));
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
class Even extends Thread{
	public void run() {
		try {
			FileWriter frEven = new FileWriter("even.txt");
			for(int i=2;i<=20;i+=2) {
				frEven.write(Integer.toString(i));
			}
			frEven.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class MultipleThreadDemo {

	public static void main(String[] args) throws IOException {
		Odd oddThread = new Odd();
		Even evenThread = new Even();
		//Multiple Thread
		oddThread.start();
		evenThread.start();
		

	}

}