package tripillar_coding_assesment.Module_3;
import java.util.Scanner;
public class SquareNumber {
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int result = square(num);

        System.out.println("Square of " + num + " is " + result);
    }


}
