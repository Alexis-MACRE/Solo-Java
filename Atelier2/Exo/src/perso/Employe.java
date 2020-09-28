package perso;
import java.time.Year;
import java.util.*;

public class Employe extends Personne {

     private GregorianCalendar dateEmbauche;
     private int salaire;

     private Employe(Personne personne, GregorianCalendar dateEmbauche, int salaire){
          super(personne);

          this.dateEmbauche = dateEmbauche;
          this.salaire = salaire;
     }
     
     public static Employe createEmploye(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche, int salaire){
          
          Employe retour;          

          GregorianCalendar now = new GregorianCalendar();
          GregorianCalendar dateMajorite = new GregorianCalendar(a+18,m,j);
          GregorianCalendar dateRetraite = new GregorianCalendar(a+65,m,j);

          if(dateMajorite.compareTo(now) < 0 && dateRetraite.compareTo(now) > 0 ){
               retour = new Employe(new Personne(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville), dateEmbauche, salaire);
          }

          else{
               retour = null;
          }

          return retour;

     }
     
}
