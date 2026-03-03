package abstraction.complete;

public interface animal {
    void eat();
    void run();

}
class dog implements animal{
    public void eat(){
        System.out.println("eating.....");
    }
    public void run(){
        System.out.println("running....");
    }
}
class driver{
    static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.run();

    }
}
