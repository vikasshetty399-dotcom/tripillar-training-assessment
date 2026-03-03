package strings;

public class stringdemo {
    static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s5="hello";
        String s3=new String("hello");
        String s4=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s5==s1);
    }
}
