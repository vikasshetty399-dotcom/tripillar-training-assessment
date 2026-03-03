package inheretance;

import java.security.spec.RSAOtherPrimeInfo;

public class person {
    String firstname;
    String lastname;
    person(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }
}
class student extends person{
    int usn;
    student(String firstname,String lastname,int usn){
        super(firstname,lastname);
        this.usn=usn;}
        void display (){
            System.out.println("name:"+firstname +lastname);
            System.out.println("usn:"+usn);



    }
}

class direct{
    static void main(String[] args) {
        student s1=new student("VIKAS",     "     SHETTY",124);
        s1.display();
    }

}

