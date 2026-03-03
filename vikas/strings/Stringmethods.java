package strings;

public class Stringmethods {
    static void main(String[] args) {
        String s1="java programming";
        String s2=new String("Java programming");
        System.out.println("original String  :"+s1);
        //length method()
        System.out.println("length :"+s1.length());

        //charAT()
        System.out.println("character at index :"+s1.charAt(5));

        //toUpper() and toLower()
        System.out.println("Upper case :"+s1.toUpperCase());
        System.out.println("lower case :"+s1.toLowerCase());

        //equals() and ==
        System.out.println("using =="+(s1==s2));
        System.out.println("using equals() "+s1.equals(s2));

        //compareTO()
        System.out.println("compare "+s1.compareTo(s2));

        //substring()
        System.out.println("substring :"+s1.substring(0,12));

        //contain()
        System.out.println("contains :"+s1.contains("java p"));

        //indexof()
        System.out.println("index of :"+s1.indexOf("m"));

        //replace()
        System.out.println("replace :"+s1.replace("java","python"));

        //trip()
        String s3="     hello world    ";
        System.out.println(" before trim :"+s3);
        System.out.println("after trim  :"+s3.trim());

        //isempty()
        String s4 = "";
        System.out.println("is empty: "+s4.isEmpty());

        //split()
        String setence ="java is a programming language ";
        String[] arr= setence.split(" ");

        for(String i :arr){
            System.out.println(i);
        }
    }
}
