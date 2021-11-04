package sn.esp.dic1.PollueurToutDroit;
import sn.esp.dic1.RobotPollueur.RobotPollueur;
import sn.esp.dic1.Monde.Monde;

public class PollueurToutDroit extends RobotPollueur{

	private int colDepart;//numero de la colonne de depart

    
    //int x, int y, Monde m ,int colDepart
    public PollueurToutDroit(int colDepart,Monde m){  
        super(colDepart,0,m);
        this.colDepart=colDepart;
    }


	 public int getcolDepart(){
        return colDepart;
    }
    public void setcolDepart(int colDepart){
        this.colDepart=colDepart;
    }

   
    public void parcourir(){
    	for(int i=0;i<this.getM().getNbL();i++){
    		this.vaEn(this.colDepart,i);
    		this.polluer();
	    }
    }

}
