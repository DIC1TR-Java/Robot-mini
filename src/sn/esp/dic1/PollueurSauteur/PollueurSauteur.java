package sn.esp.dic1.PollueurSauteur;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.PollueurToutDroit.PollueurToutDroit;

public class PollueurSauteur extends PollueurToutDroit{
    private int deltax;

    public PollueurSauteur(int x, int y, Monde m, int colDepart,int deltax) {
        super(x, y, m, colDepart);
        this.deltax=deltax;
    }
    public void parcourir(){
        int dx;
        for( int i=0; i<this.getM().getNbL(); i++){
            dx = this.getPosx();
            if( i%2 != 0 )
                dx += this.deltax;
            dx %= this.getM().getNbC();
            this.vaEn(dx, i);
            this.polluer();
        }
    }
}