package tripillar_coding_assesment.module_1;
import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        int area = sc.nextInt();
        double radius=Math.PI*area*area;
        System.out.println("the radius of the circle is "+radius);
    }

}
