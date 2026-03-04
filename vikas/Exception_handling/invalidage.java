package Exception_handling;

public  class  invalidage extends RuntimeException {
        invalidage(String msg){
            super(msg);
        }

}
class driver{
    static void checkage(int age){
        if(age<18){
            throw  new RuntimeException("age must be over 18");
        }
        System.out.println("you are eligible");
    }
    public static void main(String[] args){
        checkage(20);
    }}
