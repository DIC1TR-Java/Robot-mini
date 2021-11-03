package sn.esp.dic1.PollueurSauteur;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.PollueurToutDroit.PollueurToutDroit;

public class PollueurSauteur extends PollueurToutDroit{
    private int deltax;

    public PollueurSauteur(int x, int y, Monde m, int colDepart,int deltax) {
        super(x, y, m, colDepart);
        this.deltax=deltax;
    }

    
     
    

}