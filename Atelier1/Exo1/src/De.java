import java.util.*;

public class De {

     //-------------------    ATTRIBUTS    -------------------//

     private static final int NB_FACES_MIN = 3;
     private static final int NB_FACES_MAX = 120;

     private static final int NB_FACES_DEFAUT = 6;

     protected static Random r = new Random();
     private static int nb_des=0;

     protected int nbFaces;
     public final String nom;

     //-----------------   CONSTRUCTEUR(S)   -----------------//
     
     public De(int nbFaces, String nom){
          nb_des++;

          if(nbFaces>=NB_FACES_MIN && nbFaces<=NB_FACES_MAX){
               this.nbFaces = nbFaces;
          }
          else{
               System.err.println("Valeurs entrées incorrectes");
          }

          if(nom=="")
          {
               this.nom = new String("Dé n° "+nb_des);
          }
           else{               
               this.nom = new String(nom);
          }
     }

     public De(){
          this(NB_FACES_DEFAUT,"");      
     }

     public De(int nbFaces){
          this(nbFaces,"");
     }

     public De(String nom){
          this(NB_FACES_DEFAUT,nom);
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
             System.err.println(("Valeurs entrées incorrectes"));
          }
 
     }

     //--------------------    METHODES    --------------------//

     public String toString(){
          return this.nom;
     }

     public Boolean equals(De deCompare){
          String nomCompare = deCompare.nom;
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
               resultatDe = r.nextInt(this.nbFaces)+1;

               if(resultatDe > resultatPrecedent){
                    resultatMax = resultatDe;
               }
               resultatPrecedent = resultatDe;
          }
          
     
          return resultatMax;
     }
 }