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

          int resultatDe=1;

          while(resultatDe<=borneMin){
               resultatDe = r.nextInt(this.nbFaces)+1;
          }
     
          return resultatDe;
     }

}
