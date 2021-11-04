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
        PollueurToutDroit ptd = new PollueurToutDroit(3, m);
        ptd.parcourir();
        System.out.println(m.toString());
        PollueurSauteur ps = new PollueurSauteur(2, 3, m);
        ps.parcourir();
        System.out.println(m.toString());
        RobotNettoyeur rn = new RobotNettoyeur(m);
        rn.parcourir();
        System.out.println(m.toString());
        NettoyeurDistrait nd = new NettoyeurDistrait(m);
        nd.parcourir();
        System.out.println(m.toString());
        

    }

}
