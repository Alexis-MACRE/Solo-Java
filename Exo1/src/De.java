import java.util.*;

public class De {

     //-------------------    ATTRIBUTS    -------------------//

     protected static Random r = new Random();
     protected static int nb_des=0;

     protected int nbFaces;
     protected final String nom;

     //-----------------   CONSTRUCTEUR(S)   -----------------//
     
     public De(){
          nb_des++;

          this.nbFaces = 6;
          this.nom = new String("Dé n° "+nb_des);
     }

     public De(int nbFaces, String nom){
          nb_des++;

          if(nbFaces>=3 && nbFaces <= 120 && nom!=""){
               this.nbFaces = nbFaces;
               this.nom = new String(nom);
          }
           else{
               this.nom = new String("ERROR");
               System.err.println();
          }
     }

     //------------------ GETTERS / SETTERS ------------------//

     public int getNbFaces() {
         return this.nbFaces;
     }

     public void setNbFaces(int nbFaces) {
         if(nbFaces>=3 && nbFaces <= 120){
             this.nbFaces = nbFaces;
          }
         else{
             System.err.println();
          }
 
     }

     public String getNom(){
          return this.nom;
     }

     //--------------------    METHODES    --------------------//

     public String toString(){
          return this.nom;
     }

     public Boolean equals(De deCompare){
          String nomCompare = deCompare.getNom();
          int nbFacesCompare = deCompare.getNbFaces();
          
          if(nomCompare.equals(this.nom) && nbFacesCompare == this.nbFaces){
               return true;
          }
          else{
               return false;
          }
     }
     
     public int lancer(){
          int resultatDe = r.nextInt(this.nbFaces)+1;
     
          return resultatDe;
     }
     

     public int lancer(int nbLances){
          int resultatPrecedent = 1;
          int resultatMax = 1;
          int resultatDe;

          for(int i=0; i<nbLances ; i++){
               resultatDe = lancer();

               if(resultatDe > resultatPrecedent){
                    resultatMax = resultatDe;
               }
               resultatPrecedent = resultatDe;
          }
          
     
          return resultatMax;
     }
 }