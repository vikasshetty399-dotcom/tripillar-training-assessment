package Exception_handling;

public class e {
    public static void main(String[] args) {
        int i=50,j=5,k=0;
        try {
            k = i / j;
            System.out.println(k);
            int[]arr={1,2,3,4,5,6,7,8,9};
            System.out.println(arr[2]);
        }
        catch (ArithmeticException a){
            System.out.println("this numeber cannot be divided");
        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("get lost");
        }
      finally {
            int a=2,b=3,c=1;
            c=a+b;
            System.out.println(c);
        }
    }
}
