package numerone;
public class Monde
{
private int nbL;
private int nbC;
private boolean[nbL][nbC] mat;


public Monde(int i,int j,boolean[i][j] mat)
{
 i=nbL;
 j=nbC;
}

public Monde(){
    nbL=10;
    nbC=10;
for (int k = 0 ; k<10; k++){
     for (int x = 0 ; x<10; x++){
         mat[x][k]=false;
}
}

public	String	toString(){
    for (int k = 0 ; k<nbL; k++){
     for (int x = 0 ; x<nbC; x++){
        if mat[x][k]==true{
            System.Out.prinln("o");
        }
        else {
            System.Out.prinln(".")
        }
 } 
}
}
public void metPapierGras(inti , intj) {
    mat[i][j]=true;
}
public void prendPapierGras(inti ,intj) {
    mat[i][j]=false;
}
public boolean estSale(inti , intj){
    public  boolean estSale; 
    if mat[i][j]==true
    estSale=true ;
    else 
    estSale false ; 
    return estSale;
}
public void nbPapiersGras(){
    int nbpapier =0;
    for (int k = 0 ; k<nbL; k++){
     for (int x = 0 ; x<nbC; x++){
        if mat[x][k]=true{
            nbpapier=nbpapier+1;
        }
    System.Out.prinln(" le nombre de papier dans le monde est :"+nbpapiers)
        
}
}
