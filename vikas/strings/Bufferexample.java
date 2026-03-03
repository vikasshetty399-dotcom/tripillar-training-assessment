package strings;

public class Bufferexample {
    static void stringappend(){
        StringBuffer sbf=new StringBuffer("Hello");
        System.out.println("original string :"+sbf);
        sbf.append("world");
        System.out.println("new string :"+sbf);
    }
    static void stringinsert(){
        StringBuffer sbf=new StringBuffer("hello");
        System.out.println("original string :"+sbf);
        sbf.insert(2,"world");
        System.out.printf("new string :"+sbf);
    }
    static void  stringreverse(){
        StringBuffer sbf=new StringBuffer("hello");
        System.out.println("    original string :"+sbf);
        sbf.reverse();
        System.out.println("new string :"+sbf);
    }

    public static void main(String[] args) {
        stringappend();
        stringinsert();


        stringreverse();
    }
}


