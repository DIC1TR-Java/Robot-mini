package numerotwo;
import numerone.monde;
import java.lang.*;
public abstract class Robot{
    public int posx;
    public int posy;
    public static Monde m;

    public Robot(int x, int y, Monde m){
        x=posx;
        y=posy;
        m=this.m;
        Robot r = new Robot(x,y,m);
    }

    public Robot(Monde m){
        m=this.m;
        double nb;
        nb = Math.random();
        int x = nb; 
        double nc;
        nc=Math.random();
        int y = nc;
        Robot r = new Robot(m,this.Robot(x,y));
    }

    public Robot vaEn(int i,int j ){
        posx=i;
        posy=j;
        Robot r = new Robot(posx,posy,m);
    }

    public void parcourir() {
        for(int x,x>posx){
            for(int y,y>posy){
                Robot r = new Robot(x+1,y+1,m);
            }
            }
    }
}