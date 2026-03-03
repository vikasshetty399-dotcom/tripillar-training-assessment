package tripillar_coding_assesment.module_1;
import  java.util.Scanner;
public class swap_with {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the firts number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("before swapping a="+a +",b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping a = "+a +",b = "+b);
    }
}
