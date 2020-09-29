package test;

import perso.Employe;
import java.util.*;

public class TestQuestion2 {
     public static void print(){
          GregorianCalendar test = new GregorianCalendar(25,11,2020);
          Employe employe1 = Employe.createEmploye("Dubois", "Jean-Michel", 20, 10, 1990, 69, "Maréchal Pétain", "69690", "Moncuq", test, 2650);
          System.out.println(employe1 + "\n\n Annuites: " + employe1.calculAnnuite() + "an(s)");
     }
}
