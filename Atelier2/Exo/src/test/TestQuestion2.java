package test;

import perso.Employe;
import java.util.*;

public class TestQuestion2 {

     public static void print(){
          Employe employe1 = Employe.createEmploye("Dubois", "Jean-Michel", 20, 10, 2010, 69, "Maréchal Pétain", "69690", "Moncuq", new GregorianCalendar(25,11,2020), 2650);
          System.out.println(employe1);
     }
}
