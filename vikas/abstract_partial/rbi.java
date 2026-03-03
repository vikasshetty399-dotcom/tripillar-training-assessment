package abstract_partial;

abstract class rbi {
    abstract int roi();
void min(){
    System.out.println("the minimun intrest is 2%");
}
}


class hdfc extends rbi{
    @Override
    int roi() {
        return 10;
    }
}
class sbi extends rbi{
    @Override
    int roi() {
        return 6;
    }

}
class driver1{
    static void main(String[] args) {
        hdfc h=new hdfc();
        sbi s=new sbi();
        h.roi();
        s.roi();
        System.out.println("hdfc: "+h.roi());
        System.out.println("sbi: "+s.roi());


    }

}
