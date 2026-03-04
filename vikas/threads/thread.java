package threads;
  class mytask implements Runnable{
      public  void run(){
          for (int i=0;i<10;i++){
              System.out.println("thread is running.....");
          }
      }
  }

public class thread {
    public static void main(String[] args) {
        mytask obj = new mytask();
        Thread a = new Thread(obj);
        a.start();
        for (int i=0;i<10;i++){
            System.out.println("main is running");
        }
    }
}

