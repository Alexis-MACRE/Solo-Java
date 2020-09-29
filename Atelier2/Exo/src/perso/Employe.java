package perso;
import java.util.*;

public class Employe extends Personne {

     protected GregorianCalendar dateEmbauche;
     protected float salaire;

     protected Employe(Personne personne, GregorianCalendar dateEmbauche, float salaire){
          super(personne);

          this.dateEmbauche = dateEmbauche;
          this.salaire = salaire;
     }

     protected Employe(Employe employe){
          super(employe.getPrenom(), employe.getNom(), employe.getDateNaissance(), employe.getAdresse());

          this.dateEmbauche = (GregorianCalendar) employe.getDateEmbauche().clone();
          this.salaire = employe.getSalaire();
     }
     
     public static Employe createEmploye(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche, float salaire){
          
          Employe retour = null;          

          GregorianCalendar now = new GregorianCalendar();
          GregorianCalendar dateMajorite = new GregorianCalendar(a+18,m,j);
          GregorianCalendar dateRetraite = new GregorianCalendar(a+65,m,j);

          if(dateMajorite.compareTo(now) < 0 && dateRetraite.compareTo(now) > 0 ){
               retour = new Employe(new Personne(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville), dateEmbauche, salaire);
          }

          return retour;

     }

     public String toString(){
          return super.toString()+"\nSalaire : " + this.salaire + "€";
     }

     public GregorianCalendar getDateEmbauche(){
          return this.dateEmbauche;
     }

     public float getSalaire(){
          return this.salaire;
     }

     public void augmenterLeSalaire(float pourcentage){
          this.salaire *= pourcentage;
     }

     public int calculAnnuite(){
          GregorianCalendar now = new GregorianCalendar();

          return now.get(GregorianCalendar.YEAR) - this.dateEmbauche.get(GregorianCalendar.YEAR);
     }
     
}
