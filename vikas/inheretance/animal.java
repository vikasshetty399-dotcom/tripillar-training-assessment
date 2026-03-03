package inheretance;

public class animal {
    void eat(){
        System.out.println("eating..");
    }
}
class  dog extends animal{
    void bark(){
        System.out.println("barking..");
    }
}
class driver{
    public static void main(String[] args){
        animal a=new animal();
        a.eat();
        dog d=new dog();
        d.eat();
        d.bark();
    }
}
