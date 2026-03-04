package Exception_handling;
import java.util.Scanner;
public class e3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age= sc.nextInt();

        if (age>=18){
            System.out.println("access granted");
        }else {
            throw new RuntimeException("access denied");
        }

    }
    }

