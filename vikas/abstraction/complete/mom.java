package abstraction.complete;

class mom {
    void cook(){
        System.out.println("eating");
    }
    }
interface dad{
    void play();
}
interface bro{
    void play();
}
class child{
    public void cook(){
        System.out.println("indian");
    }
    void play(){
        System.out.println("playing...");
    }
}
class driver1 {
    static void main(String[] args) {
        child c = new child();
        c.cook();
        c.play();
        mom m=new mom();
        m.cook();
        dad d=new dad() {
            @Override
            public void play() {
                System.out.println("play...");
            }
            
        };
        };
    }





