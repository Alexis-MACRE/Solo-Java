public class App {
    public static void main(String[] args) throws Exception {
        Entier entierValeurDefaut = new Entier(1,10);
        Entier entierValeurIncorrecte = new Entier(1,10,11);
        Entier entierIncremente = new Entier(1,10,8);
        Entier entierIncrementePas = new Entier(1,10);
        
        EntierFou entierFolie = new EntierFou(1,10,4);

        // Test valeur par défaut
        System.out.println("-------------------------------");
        System.out.println("        Entier Defaut ");
        System.out.println("-------------------------------");

        System.out.println("Valeur par Defaut: " + entierValeurDefaut.getValeur() + "\n");

        // Test valeur hors bornes à la construction de l'object
        System.out.println("-------------------------------");
        System.out.println("Entier mauvaise initialisation ");
        System.out.println("-------------------------------");

        System.out.println("Valeur incorrecte à l'initialisation: " + entierValeurIncorrecte.getValeur() + "\n");

        // Test valeurs incrémentées de 1
        System.out.println("-------------------------------");
        System.out.println("    Entier incrémenté de 1 ");
        System.out.println("-------------------------------");

        System.out.println("Valeur avant incrémentation: " + entierIncremente.getValeur());
        entierIncremente.incremente();
        System.out.println("Valeur après incrémentation: "+ entierIncremente.getValeur());
        entierIncremente.incremente();
        System.out.println("Valeur après incrémentation en dehors de la borne: "+ entierIncremente.getValeur() + "\n");

        // Test valeurs incrémentées avec pas
        System.out.println("-------------------------------");
        System.out.println("   Entier incrémenté avec pas ");
        System.out.println("-------------------------------");

        System.out.println("Valeur avant incrémentation de 7: " + entierIncrementePas.getValeur());
        entierIncrementePas.incremente(7);
        System.out.println("Valeur après incrémentation: "+ entierIncrementePas.getValeur());
        entierIncrementePas.incremente(7);
        System.out.println("Valeur après incrémentation en dehors de la borne: "+ entierIncrementePas.getValeur() + "\n");

        // Test valeurs incrémentées de aléatoire (EntierFou)
        System.out.println("-------------------------------");
        System.out.println("           Entier Fou: ");
        System.out.println("-------------------------------");

        System.out.println("Valeur avant incrémentation entre 0 et 4: " + entierFolie.getValeur());
        entierFolie.incremente();
        System.out.println("Valeur après incrémentation: "+ entierFolie.getValeur());
        entierFolie.incremente();
        System.out.println("Valeur après seconde incrémentation: "+ entierFolie.getValeur());
        entierFolie.setValeur(9);
        System.out.println("Valeur avant incrémentation en dehors de la borne: "+ entierFolie.getValeur());
        entierFolie.incremente();
        entierFolie.incremente();
        entierFolie.incremente();
        System.out.println("Valeur après incrémentation en dehors de la borne: "+ entierFolie.getValeur() + "\n");

    }
}
