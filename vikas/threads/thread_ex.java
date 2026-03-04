package threads;
class task implements Runnable{
    public void run(){
        int a=4,b=5,c=0;
        c=a+b;
        System.out.println("hi");

    }
}

public class thread_ex {
    public static void main(String[] args) {
        task obj=new task();
        Thread t=new Thread();
        t.start();
    }
}
