import java.util.ArrayList;

public class DeAutre extends De {

     //-------------------    ATTRIBUTS    -------------------//
     
     ArrayList<Object> faces = new ArrayList<Object>();

     //-----------------   CONSTRUCTEUR(S)   -----------------//

     public DeAutre(int nbFaces, String nom, Object[] faces){
          super(nbFaces, nom);

          for( Object face : faces ){
               this.faces.add(face);
          }
     }

     //--------------------    METHODES    --------------------//

     public Object lancer_special(){
          int index = r.nextInt(this.nbFaces);
     
          return faces.get(index);
     }

     public Object lancer_special(int nbLances){
          int indexPrecedent = 1;
          int indexMax = 0;
          int index;

          for(int i=0; i<nbLances ; i++){
               index = r.nextInt(this.nbFaces);

               if(index > indexPrecedent){
                    indexMax = index;
               }
               indexPrecedent = index;
          }
          
     
          return faces.get(indexMax);
     }
}
