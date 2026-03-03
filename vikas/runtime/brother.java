package runtime;

public class brother {
    void play(){
        System.out.println("football....");
    }
}
class sister{
    void play(){
        System.out.println("dancing...");
    }
}
class driver1{
    static void main(String[] args) {
        brother b=new brother();
        sister s= new sister();
        b.play();
        s.play();

    }

}