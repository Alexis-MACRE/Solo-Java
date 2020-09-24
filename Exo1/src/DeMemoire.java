public class DeMemoire extends De {

     //-------------------    ATTRIBUTS    -------------------//

     private int resultatPrecedent = 0;

     //--------------------    METHODES    --------------------//

     public int lancer(){
          int resultatDe = r.nextInt(nbFaces)+1;

          while(resultatDe==this.resultatPrecedent){
               resultatDe = r.nextInt(nbFaces)+1;
          }

          this.resultatPrecedent = resultatDe;

          return resultatDe;
     }

}
