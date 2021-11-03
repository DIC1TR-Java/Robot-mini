package sn.esp.dic1.Monde;

public class Monde{
// Les attributs -----------------------------------------
private int nbL;
private int nbC;
private boolean[][] mat ;

// Les constructeurs --------------------------------------
public Monde(int nbL,int nbC,boolean [][] mat){
    this.nbL=nbL;
    this.nbC=nbC;
    this.mat=mat;
}

public Monde(){
    nbL=10;
    nbC=10;
    mat=new boolean[nbL][nbC];
    for (int k = 0 ; k<10; k++){
        for (int x = 0 ; x<10; x++){
            mat[k][x]=false;
        }
    }
}

// Les acceusseurs ----------------------------------------
public int getNbL(){
    return nbL;
}
public void  setNbl(int nbL){
    this.nbL = nbL;
}
public int getNbC(){
    return nbC;
}
public void  setNbC(int nbC){
    this.nbC = nbC;
}
public boolean[][] getMat (){
    return mat;
}
public void  setMat(boolean [][] mat){
    this.mat = mat;
}


// Les methodes -------------------------------------------------------
public String toString(){
    String chaine = "";
    for (int k = 0 ; k<nbL; k++){
        for (int x = 0 ; x<nbC; x++){
            if (mat[k][x]==true){
                chaine = chaine+"o";
            }
            else{
                chaine = chaine+".";
            }
        }
        chaine = chaine+"\n";
    }
    return chaine;
}

public void metPapierGras(int i, int j){
    mat[i][j]=true;
}

public void prendPapierGras(int i, int j){
    mat[i][j]=false;
}

public boolean estSale(int i , int j){
    boolean estSale = false; 
    if(mat[i][j] == true){
        estSale=true ;
    } 
    return estSale;
}

public int  nbPapiersGras(){
    int nbpapier =0;
    for (int k = 0; k<nbL; k++){
        for (int x = 0 ; x<nbC; x++){
            if(mat[k][x]=true){
                nbpapier=nbpapier+1;
            }
        }
    }
    return nbpapier;
}
    
}
