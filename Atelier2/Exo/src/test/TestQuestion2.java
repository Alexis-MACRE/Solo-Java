package test;

import java.util.*;
import perso.*;

public class TestQuestion2 {
     public static void print(){
          //Employe employe1 = Employe.createEmploye("Dubois", "Jean-Michel", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650);
          //System.out.println(employe1 + "\n\nAnnuites: " + employe1.calculAnnuite() + " ans");
          Employe[] listeEmployes = new Employe[10];          

          Secretaire secretaire1 = new Secretaire("Berger", "Constance", 02, 02, 1992, 24, "Jesaispasou", "98790", "Roquefort",new GregorianCalendar(2000,10,12), 2850);

          listeEmployes[0] = new Manager("Dubois", "Manager 1 an expérience", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2019,11,25), 2650.0, secretaire1);
          listeEmployes[1] = new Manager("Dubois", "Manager 15 ans expérience", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650.0);
          listeEmployes[2] = Employe.createEmploye("Dubois", "Employé normal", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650.0);
          listeEmployes[3] = new Secretaire("Dubois", "Secretaire 0 managers", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650);
          listeEmployes[4] = new Secretaire("Dubois", "Secretaire 2 managers", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650);
          ((Manager)listeEmployes[0]).changeSecretaire(((Secretaire)listeEmployes[4]));
          ((Manager)listeEmployes[1]).changeSecretaire(((Secretaire)listeEmployes[4]));

          for(Employe employe : listeEmployes){
               employe.augmenterLeSalaire(10.0);
               System.out.println(employe + "\n\nAnnuites: " + employe.calculAnnuite() + " ans");               
          }
          
     }
}
