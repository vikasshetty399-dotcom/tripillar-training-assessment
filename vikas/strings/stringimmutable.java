package strings;

public class stringimmutable {
    static void main(String[] args) {
        String s1="hello";
        String s2=s1.concat("  world");
        String s3=s2.concat("  hi");
        System.out.println(s3);
    }
}
