package Exception_handling;

public class e3_1 {
    static void checkage(int age){
        if (age>=18){
            System.out.println("access granted");
        }else {
            throw new RuntimeException("access denied");
        }
    }
    public static void main(String[] args) {
        checkage(12);
    }
}
