package sn.esp.dic1.Robot;
import sn.esp.dic1.Monde.Monde;


public abstract class Robot{
    //Les attributs --------------------------------------------------
    private  int posx;
    private  int posy;
    private  Monde m;

    // Les constructeurs ---------------------------------------------
    public Robot(int posx, int posy,Monde m){
        this.posx=posx;
        this.posy=posy;
        this.m=m;
    }

    public Robot(Monde m){
        this((int)(Math.floor(Math.random()*m.getNbL())),(int)(Math.floor(Math.random()*m.getNbC())),m);
    }

    // Les accesseurs --------------------------------------------------
    public int getPosx(){
        return posx;
    }
    public void setPosx(int posx){
        this.posx=posx;
    }

    public int getPosy(){
        return posy;
    }
    public void setPosy(int posy){
        this.posy=posy;
    }

    public Monde getM(){
        return m;
    }
    public void setM(Monde m){
        this.m=m;
    }

    // Les methodes ----------------------------------------------------
    public void vaEn(int i,int j){
        this.posx= i;
        this.posy= j;
    }

    public abstract void parcourir();

}
