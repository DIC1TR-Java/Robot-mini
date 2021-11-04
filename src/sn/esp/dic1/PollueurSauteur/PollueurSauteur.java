package sn.esp.dic1.PollueurSauteur;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.RobotPollueur.RobotPollueur;

public class PollueurSauteur extends RobotPollueur{
    private int deltax;

    public PollueurSauteur(int colDepart, int deltax, Monde m){
        super(colDepart,0,m);
        this.deltax = deltax;
    }

    public void parcourir(){
        int temp;
        for( int i=0; i<this.getM().getNbL(); i++){
            temp = this.getPosx();
            if( i%2 != 0 ){
                temp += this.deltax;
            }   
            temp %= this.getM().getNbC();
            
            this.vaEn(temp, i);
            this.polluer();

        }
    }
}