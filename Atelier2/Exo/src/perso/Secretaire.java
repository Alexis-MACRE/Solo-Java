package perso;

import java.util.*;

public class Secretaire extends Employe{
     Manager[] managers = new Manager[5];

     public Secretaire(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, GregorianCalendar dateEmbauche, float salaire){
          super(createEmploye(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, dateEmbauche, salaire));
     }

     public void augmenterLeSalaire(float pourcentage){       
          this.salaire *= (pourcentage + 0.1 * nbManagers());
     }     

     private int nbManagers(){
          int compteur = 0;

          for( Manager manager : managers){
               compteur++;
          }

          return compteur;
     }

     public void ajoutManager(Manager manager){
          int i = 0;

          while(managers[i]!=null){
               i++;
          }

          if(i!=5){
               managers[i] = manager;
          }
     }

     public void retirerManager(int numero){
          this.managers[numero] = null;
     }
}
