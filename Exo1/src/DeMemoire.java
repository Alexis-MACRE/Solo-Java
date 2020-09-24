public class DeMemoire extends De {

     //-------------------    ATTRIBUTS    -------------------//

     private int resultatPrecedent = 0;

     //-----------------   CONSTRUCTEUR(S)   ------------------//

     public DeMemoire(int nbFaces, String nom){
          super(nbFaces, nom);
     }

     //--------------------    METHODES    --------------------//

     public int lancer(){
          int resultatDe;

          do{
               resultatDe = super.lancer();
          } 
          while(resultatDe==this.resultatPrecedent);

          this.resultatPrecedent = resultatDe;

          return resultatDe;
     }

}
