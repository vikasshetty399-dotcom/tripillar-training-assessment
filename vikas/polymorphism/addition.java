package polymorphism;

public class addition {
    int add( int a, int b){
        return a+b;
    }
    int add(int a,int b , int c){
        return a+b+c;
    }

}
class driver{
    static void main(String[] args) {
        addition obj=new addition();
        System.out.println(obj.add(10,52,9));
        System.out.println(obj.add(56,89,56));

    }
}
