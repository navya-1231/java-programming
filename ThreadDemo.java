class DemoThread extends Thread{
    public void run(){
        System.out.println("Thread Running");
    }
}
public class ThreadDemo {
    public static void main(String[] args){
        DemoThread thread=new DemoThread();//creating the thread
        thread.setName("Demo");
        System.out.println("Thread State:"+thread.getState());
        thread.start();//changing the state from new to runnable
        System.out.println("Thread State:"+thread.getState());
        System.out.println("Thread Name:"+thread.getName());
    }
}
