package test;

import perso.Employe;
import java.util.*;
import perso.*;

public class TestQuestion2 {
     public static void print(){
          //Employe employe1 = Employe.createEmploye("Dubois", "Jean-Michel", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650);
          //System.out.println(employe1 + "\n\nAnnuites: " + employe1.calculAnnuite() + " ans");
          Employe[] listeEmployes = new Employe[10];          

          Secretaire secretaire1 = new Secretaire("Berger", "Constance", 02, 02, 1992, 24, "Jesaispasou", "98790", "Roquefort",new GregorianCalendar(2000,10,12), 2850);

          listeEmployes[0] = new Manager("Dubois", "Jean-Michel", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(2005,11,25), 2650, secretaire1);
     }
}
