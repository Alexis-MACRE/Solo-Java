package perso;
import perso.Secretaire.*;
import java.util.*;

public class Manager extends Employe{

     private Secretaire secretaire;

     public Manager(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche,double salaire, Secretaire secretaire){
          super(createEmploye(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, dateEmbauche, salaire));
          this.secretaire = secretaire;
     }

     public Manager(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche,double salaire){
          super(createEmploye(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, dateEmbauche, salaire));
     }

     public void augmenterLeSalaire(double pourcentage){          
          this.salaire *= 1+((pourcentage+calculAnnuite()*0.5)/100) ;
     }

     public void changeSecretaire(Secretaire secretaire){
          this.secretaire = secretaire;
          this.secretaire.ajoutManager(this);
     }
}
