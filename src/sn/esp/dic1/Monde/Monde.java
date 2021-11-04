package sn.esp.dic1.Monde;

public class Monde{
// Les attributs -----------------------------------------
private int nbL;
private int nbC;
private boolean mat[][] ;

// Les constructeurs --------------------------------------
public Monde(){
    this.nbL = 10;
    this.nbC = 10;
    this.mat = new boolean[this.nbL][this.nbC];
    for(int i=0; i<this.nbL; i++)
        for(int j=0; j<this.nbC; j++)
            this.mat[i][j] = false;
}

public Monde(int l, int c){
    this.nbL = l;
    this.nbC = c;
    this.mat = new boolean[this.nbL][this.nbC];
    for(int i=0; i<(this.nbL-1); i++)
        for(int j=0; j<(this.nbC-1); j++)
            this.mat[i][j] = false;
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
