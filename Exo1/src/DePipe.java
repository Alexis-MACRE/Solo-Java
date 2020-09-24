public class DePipe extends De {

     //-------------------    ATTRIBUTS    -------------------//

     private int borneMin;

     //-----------------   CONSTRUCTEUR(S)   -----------------//

     public DePipe(int nbFaces, String nom, int borneMin){
          super(nbFaces,nom);
          
          this.borneMin = borneMin;
     }

     //--------------------    METHODES    --------------------//

     public int lancer(){

          int resultatDe;

          do{
               resultatDe = super.lancer();
          }
          while(resultatDe<=borneMin);

          return resultatDe;
     }

}
