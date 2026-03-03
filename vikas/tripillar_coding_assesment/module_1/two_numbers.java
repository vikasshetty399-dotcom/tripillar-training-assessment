package tripillar_coding_assesment.module_1;
import java.util.Scanner;

public class two_numbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num1");
        int a=sc.nextInt();
        System.out.println("enet the num2");
        int b= sc.nextInt();
        int adddition = a+b;
        int substration = a-b;
        int multiplication=a*b;
        double division=a/b;
        System.out.println("the addition of two numbers is "+adddition);
        System.out.println("the substration of two numbers is  "+substration);
        System.out.println("the multiplication of two numbers is "+multiplication);
        System.out.println("the division of two numbers is  "+division);
    }
}
