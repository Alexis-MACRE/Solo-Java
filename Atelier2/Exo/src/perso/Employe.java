package perso;
import java.util.*;

public class Employe extends Personne {

     static private final int AGE_MINIMUM = 16;
     static private final int AGE_MAXIMUM = 65;

     protected GregorianCalendar dateEmbauche;
     protected double salaire;

     private Employe(Personne personne, GregorianCalendar dateEmbauche,double salaire){
          super(personne);

          this.dateEmbauche = dateEmbauche;
          this.salaire = salaire;
     }

     protected Employe(Employe employe){
          super(employe.getNom(), employe.getPrenom(), employe.getDateNaissance(), employe.getAdresse());

          this.dateEmbauche = (GregorianCalendar) employe.getDateEmbauche().clone();
          this.salaire = employe.getSalaire();
     }
     
     public static Employe createEmploye(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche,double salaire){
          
          Employe retour = null;          

          GregorianCalendar now = new GregorianCalendar();
          GregorianCalendar dateAgeMin= new GregorianCalendar(a+AGE_MINIMUM,m,j);
          GregorianCalendar dateAgeMax = new GregorianCalendar(a+AGE_MAXIMUM,m,j);

          if(dateAgeMin.compareTo(now) < 0 && dateAgeMax.compareTo(now) > 0 ){
               retour = new Employe(new Personne(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville), dateEmbauche, salaire);
          }

          return retour;
     }

     public String toString(){
          return super.toString()+"\nSalaire : " + String.format("%.2f",this.salaire) + "€";
     }

     public GregorianCalendar getDateEmbauche(){
          return this.dateEmbauche;
     }

     public double getSalaire(){
          return this.salaire;
     }

     public void augmenterLeSalaire(double pourcentage){
          this.salaire *= 1+(pourcentage/100);
     }

     public int calculAnnuite(){
          GregorianCalendar now = new GregorianCalendar();

          return now.get(GregorianCalendar.YEAR) - this.dateEmbauche.get(GregorianCalendar.YEAR);
     }
     
}
