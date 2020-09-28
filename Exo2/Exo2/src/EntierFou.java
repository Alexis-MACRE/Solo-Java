import java.util.*;

public class EntierFou extends Entier{
     private int niveauDeFolie;
     private static Random r = new Random();

     public EntierFou(int borneInf,int borneSup,int valeur,int niveauDeFolie){
          super(borneInf,borneSup,valeur);
          this.niveauDeFolie = niveauDeFolie;
     }

     public EntierFou(int borneInf,int borneSup,int niveauDeFolie){
          super(borneInf,borneSup);
          this.niveauDeFolie = niveauDeFolie;
     }

     public void incremente(){
          int nombreAleatoire = r.nextInt(niveauDeFolie);

          super.incremente(nombreAleatoire);
     }

}
