package sn.esp.dic1.TestRobots;

import sn.esp.dic1.Monde.Monde;
import sn.esp.dic1.NettoyeurDistrait.NettoyeurDistrait;
import sn.esp.dic1.PollueurSauteur.PollueurSauteur;
import sn.esp.dic1.PollueurToutDroit.PollueurToutDroit;
import sn.esp.dic1.RobotNettoyeur.*;
public class TestRobots{
    
    public static void main(String [] args){

        //test des classes et des methodes
        Monde m = new Monde();
        System.out.println(m.toString());
        PollueurToutDroit pollueurTD = new PollueurToutDroit(3, m);
        pollueurTD.parcourir();
        System.out.println(m.toString());
        PollueurSauteur pollueurS = new PollueurSauteur(2, 3, m);
        pollueurS.parcourir();
        System.out.println(m.toString());
        RobotNettoyeur robotN = new RobotNettoyeur(m);
        robotN.parcourir();
        System.out.println(m.toString());
        NettoyeurDistrait nettoyeurD = new NettoyeurDistrait(m);
        nettoyeurD.parcourir();
        System.out.println(m.toString());
        

    }

}
