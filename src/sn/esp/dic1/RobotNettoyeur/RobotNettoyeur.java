package sn.esp.dic1.RobotNettoyeur;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.Robot.*;


public class RobotNettoyeur extends Robot{
    
    //constructeur
    public RobotNettoyeur(int posx,int posy,Monde m){
        super(posx, posy, m);
    }


    //methode nettoyer
    public void nettoyer(){
        this.getM().prendPapierGras(this.getPosx(),this.getPosy());
    }

    //methode parcourir en boustrophedon
    public void parcourir(){
        for(int i=0; i<this.getM().getNbL(); i++){
            if(i%2==0){
                for(int j=0; j<this.getM().getNbC();j++){
                    this.nettoyer();
                }
            }
            else{
                for(int j=this.getM().getNbC()-1; j<=0; j--){
                    this.nettoyer();
                }
            }
        }
    }

}

