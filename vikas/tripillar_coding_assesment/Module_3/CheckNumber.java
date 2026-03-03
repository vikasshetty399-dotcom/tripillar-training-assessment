package tripillar_coding_assesment.Module_3;
import java.util.Scanner;
public class CheckNumber {
    static void checkNumber(int n) {
        if (n > 0) {
            System.out.println(n + " is Positive");
        }
        else if (n < 0) {
            System.out.println(n + " is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        checkNumber(num);
    }
}
