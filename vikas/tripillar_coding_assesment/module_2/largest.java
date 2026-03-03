package tripillar_coding_assesment.module_2;
import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of first number A");
        int a = sc.nextInt();
        System.out.println("enter the value of second number B");
        int b = sc.nextInt();
        System.out.println("enter the value of third number C");
        int c = sc.nextInt();
        if(a>b & a>c)
        {
            System.out.println(" A is the greatest");
        }else if (b>a &b>c)
        {
            System.out.println("B is the greatest");
        }
        else if (c>a&c>b){
            System.out.println("C is the greatest");
        }
    }
}
