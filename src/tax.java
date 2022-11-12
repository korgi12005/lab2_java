import java.util.concurrent.TimeUnit;

public class tax {

    private String name;
    private int X=0,Y=0;
    public tax(String n){
        this.name=n;

    }
    public String getStat(){
        this.X+=(int)((Math.random()*11)-5);
        this.Y+=(int)((Math.random()*11)-5);
        String str=("Машина с именем - " + this.name + "\nНаходится по координатам X=" + this.X + " : Y=" + this.Y + "\n\n");
        return str;
    }

}
