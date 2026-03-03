package inheretance;

public class car {
    void engine(){
        System.out.println("3l turbo diesel");
    }
}
class bike extends car{
    void topspeed(){
        System.out.println("red line at 399..");
    }
}
class cycle extends bike{
    void capacity(){
        System.out.println("two members");
    }
}
class driect{
    public static void main(String[] args){
        car c=new car();
        c.engine();
        bike b=new bike();
        b.topspeed();
        b.engine();
        cycle a=new cycle();
        a.capacity();
        a.engine();
        a.topspeed();
        }
    }

