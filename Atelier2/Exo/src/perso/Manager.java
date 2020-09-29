package perso;
import java.util.*;

public class Manager extends Employe{

     public Secretaire secretaire;

     public Manager(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche, float salaire, Secretaire secretaire){
          super(createEmploye(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, dateEmbauche, salaire));
          this.secretaire = secretaire;
     }

     public void augmenterLeSalaire(float pourcentage){          
          this.salaire *= (pourcentage + calculAnnuite()*0.5);
     }
}
