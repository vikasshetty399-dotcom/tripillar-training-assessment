package tripillar_coding_assesment.module_1;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of temperatur in celcius");
        double celcius = sc.nextDouble();
        double fahrenheit = celcius*9/5+32;
        System.out.println(" the value of temperature in fahrenheit "+fahrenheit);

    }
}
