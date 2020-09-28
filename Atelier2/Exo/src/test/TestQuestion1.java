package test;

import perso.*;

public class TestQuestion1 {
    public static void print(){
          Personne personne1 = new Personne("Dubois", "Jean-Michel", 20, 10, 2010, 69, "Maréchal Pétain", "69690", "Moncuq");
          Personne personne2 = new Personne("Berger", "Constance", 02, 02, 1992, 24, "Jesaispasou", "98790", "Roquefort");

          Personne pareilPersonne2 = new Personne("Berger", "Constance", 02, 02, 1992, 24, "Jesaispasou", "98790", "Roquefort");

          System.out.println("\nNombre de personnes: " + Personne.getNbPersonne() + "\n");

          System.out.println("------------------------------");
          System.out.println("         Test plusAgee()");
          System.out.println("------------------------------");

          System.out.println("Date de naissance de la personne 1: " + personne1.afficheDate());
          System.out.println("Date de naissance de la personne 2: " + personne2.afficheDate() + "\n");
          System.out.println("Personne 1 plus agée que personne 2: " + personne1.plusAgee(personne2));
          System.out.println("Personne 2 plus agée que personne 1: " + personne2.plusAgee(personne1) + "\n");

          System.out.println("------------------------------");
          System.out.println("         Test equals()");
          System.out.println("------------------------------");

          System.out.println("\nObjet 1: \n" + personne2);
          System.out.println("\nObjet 2:\n " + pareilPersonne2);
          System.out.println("\nResultat equals 1 et 2: " + personne2.equals(pareilPersonne2));
          System.out.println("\nResultat equals 1 et un String: " + personne2.equals("Salut"));
    }
}
