package sn.esp.dic1.RobotNettoyeur;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.Robot.*;


public class RobotNettoyeur extends Robot{
    
    //constructeur
    public RobotNettoyeur(Monde m){
        super(0,0,m);
    }


    //methode nettoyer
    public void nettoyer(){
        this.getM().prendPapierGras(this.getPosx(),this.getPosy());
    }

    //methode parcourir en boustrophedon
    public void parcourir(){
        for(int i=0; i<this.getM().getNbL(); i++){
            if( i%2 == 0 ){
                for(int j=0; j<this.getM().getNbC(); j++){
                    this.vaEn(j, i);
                    if(this.getM().estSale(i, j)) this.nettoyer();
                }
            }
            else{
                for(int j=this.getM().getNbC()-1; j>=0; j--){
                    this.vaEn(j, i);
                    if(this.getM().estSale(i, j)) this.nettoyer();
                }
            }
        }
    }

}

