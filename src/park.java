import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class park {
    private ArrayList<tax> taxi;

    public park(){
        taxi=new ArrayList<>();
    }

    public void attach(tax t){
        taxi.add(t);
    }
    public void getTaxStat() throws InterruptedException {
        for(int i=0;i< taxi.size();i++){

            String str= taxi.get(i).getStat();
            System.out.printf(str);
        }
        TimeUnit.SECONDS.sleep(10);
    }
}
