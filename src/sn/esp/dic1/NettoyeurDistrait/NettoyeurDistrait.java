package sn.esp.dic1.NettoyeurDistrait;
import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.RobotNettoyeur.RobotNettoyeur;

public class NettoyeurDistrait extends RobotNettoyeur{
    // Il n'y a pas de methodes propre à cette classe -----------------------

    // Le connstructeur -----------------------------------------------------
    public NettoyeurDistrait(int posx,int posy,Monde m){
        super(posx, posx, m);
    }

    // Les methodes ---------------------------------------------------------
    public void parcourir(){
        int compteur = 0;
        for(int i=0; i<this.getM().getNbL(); i++){
            if(i%2==0){
                for(int j=0; j<this.getM().getNbC();j++){
                    if(this.getM().getMat()[i][j]==true && compteur%2==0){
                        this.nettoyer();
                        compteur = compteur+1;
                    }
                    else if(this.getM().getMat()[i][j]==true && compteur%2==1){
                        compteur = compteur+1;
                    }
                }
            }
            else{
                for(int j=this.getM().getNbC()-1; j<=0; j--){
                    if(this.getM().getMat()[i][j]==true && compteur%2==0){
                        this.nettoyer();
                        compteur = compteur+1;
                    }
                    else if(this.getM().getMat()[i][j]==true && compteur%2==1){
                        compteur = compteur+1;
                    }
                }
            }
        }
    }
}

