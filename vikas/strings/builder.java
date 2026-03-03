package strings;

public class builder {
    static void stringappend(){
        StringBuilder sbf=new StringBuilder("Hello");
        System.out.println("original string :"+sbf);
        sbf.append("world");
        System.out.println("new string :"+sbf);
    }
    static void stringinsert(){
        StringBuilder sbf=new StringBuilder("hello");
        System.out.println("original string :"+sbf);
        sbf.insert(2,"world");
        System.out.println("new string :"+sbf);
    }
    static void  stringreverse(){
        StringBuilder sbf=new StringBuilder("hello");
        System.out.println("original string :"+sbf);
        sbf.reverse();
        System.out.println("new string :"+sbf);
    }

    public static void main(String[] args) {
        stringappend();
        stringinsert();
        stringreverse();
    }
}
