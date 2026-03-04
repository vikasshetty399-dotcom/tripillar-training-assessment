package Exception_handling;
import java.util.Scanner;
public class e3_example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int banalce = 1000;
            System.out.println("enter the withdraw amount");
            int withderaw = sc.nextInt();
            if (withderaw > banalce) {
                throw new RuntimeException("insufficient balance");
            }
            System.out.println("withdraw succesfull");
        }catch (ArithmeticException e){
            System.out.println("Exeption caught"+e.getMessage());
        }
}}
