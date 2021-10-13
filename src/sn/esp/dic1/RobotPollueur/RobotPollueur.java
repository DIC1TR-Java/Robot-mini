package sn.esp.dic1.RobotPollueur;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.Robot.Robot;

public abstract class RobotPollueur extends Robot{

    public RobotPollueur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }
    public RobotPollueur(Monde m){
        super(m);
    };

    public void polluer(){
        this.getM().metPapierGras(this.getPosx(),this.getPosy());
    }
}