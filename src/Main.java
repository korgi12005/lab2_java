
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        park fp= new park();
        tax t1=new tax("first");
        tax t2=new tax("sec");
        fp.attach(t1);
        fp.attach(t2);
        while (true){
            fp.getTaxStat();
        }
    }
}
