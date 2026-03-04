package Exception_handling;

public class e1 {
    public static void main(String[] args) {
        int i=10,j=2,k=10;
        try {
            k = i / j;
            int []arr={1,2,3,4,5};
                System.out.println(arr[3]);

        }
        catch (ArithmeticException e){
            System.out.println("u cannot divide");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("get lost");
        }
        catch (Exception e){
            System.out.println("unknown exeption");
        }
        finally {
            System.out.println("This block will be executed");
        }
        System.out.println("hello");


        }
    }

