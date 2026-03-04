package threads;
 class mythreads extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
        System.out.println("Threads is running");
    }
}
}
public class demo{
    public static void main(String[] args) {
        mythreads t1=new mythreads();
        t1.start();

        for (int i=0;i<10;i++){
            System.out.println("main thread is running..");
        }
    }

}
