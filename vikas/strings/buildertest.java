package strings;

public class buildertest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("hello");
        for(int i=0;i<10000;i++){
            sbf.append("world");
        }
        long stoptime = System.currentTimeMillis();
        System.out.println("time taken :"+(stoptime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("hello");
        for(int i=0 ;i<100000;i++) {
            sbl.append("world");
        }
        stoptime=System.currentTimeMillis();
            System.out.println("time taken :"+(stoptime-startTime)+"ms");
        }
    }



