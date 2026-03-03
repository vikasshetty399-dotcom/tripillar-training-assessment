package abstract_partial;
abstract class animal {
    abstract void eat();
   abstract void legs();
    void run(){
        System.out.println("runnimg......");
    }
}
class lion extends animal{
    @Override
    void eat() {
        System.out.println("non--veg");
    }
    void legs(){
        System.out.println("four");
    }
}
class cow extends animal{
    @Override
    void eat() {
        System.out.println("grass.....");
    }

    @Override
    void legs() {
        System.out.println("four");
    }
}
class driver{
    public static void main(String[] args){
        lion l=new lion();
        l.eat();
        l.run();
        l.legs();
        cow c=new cow();
        c.eat();
        c.run();
        c.legs();
    }
}
