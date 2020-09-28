public class Entier {
     
     //-------------------    ATTRIBUTS    -------------------//

     public final int borneInf;
     public final int borneSup;
     protected int valeur;

     //-----------------   CONSTRUCTEUR(S)   -----------------//

     public Entier(int borneInf,int borneSup){
          this(borneInf,borneSup,borneInf+1);
     } 

     public Entier(int borneInf,int borneSup,int valeur){
          this.borneInf = borneInf;
          this.borneSup = borneSup;
          setValeur(valeur);
     } 

     //------------------ GETTERS / SETTERS ------------------//

     public void setValeur(int valeur){
          if(valeur > borneInf && valeur < borneSup){
               this.valeur = valeur;
          }
     }

     public int getValeur(){
          return this.valeur;
     }

     //--------------------    METHODES    --------------------//

     public void incremente(){
          if(valeur < borneSup-1){
               this.valeur++;
          }
     }

     
     public void incremente(int pas){
          if(valeur < borneSup-pas){
               this.valeur+=pas;
          }
     }

     public String toString() { 
          return Integer.toString(this.valeur);
     }

     public boolean equals(Object obj){
          Entier entier2 = (Entier)obj;
          return (this.valeur == entier2.getValeur());     
     }
     
}
