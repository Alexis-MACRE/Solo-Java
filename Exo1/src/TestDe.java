public class TestDe {
     public static void main(String[] args){

          De de6Faces = new De();
          De deCompare1 = new De(6,"comp");
          De deCompare2 = new De(6,"comp");

          DePipe de7Pipe = new DePipe(7,"de7Pipe.titre",5);

          DeMemoire deMem = new DeMemoire();

          Object faces[] = new Object[]{2.7,"Salade",98,true,de7Pipe,'c'};
          DeAutre deBizarre = new DeAutre(6,"bizarre",faces);

          //TEST EQUALS//
          System.out.println("--------------------");
          System.out.println("TEST EQUALS");
          System.out.println(deCompare1.equals(deCompare2));
          System.out.println("--------------------");

          //TEST NOM ET LANCER DÉ NORMAL//
          System.out.println("TEST NOM ET LANCER DÉ NORMAL");
          System.out.println("Nom du dé : "+de6Faces.getNom());
          System.out.println(de6Faces.lancer(10));
          System.out.println("--------------------");

          //TEST NOM ET LANCER DÉ PIPÉ//
          System.out.println("TEST NOM ET LANCER DÉ PIPÉ");
          System.out.println("Nom du dé : "+de7Pipe.getNom());
          System.out.print(" | ");
          for(int i = 0 ; i < 40 ; i++){
               System.out.print(de7Pipe.lancer()+" ");
          }
          System.out.println(de7Pipe.lancer(3));
          System.out.println("--------------------");

          //TEST LANCER DÉ MÉMOIRE//
          System.out.println("TEST NOM ET LANCER DÉ MÉMOIRE");
          System.out.println("Un seul résultat: "+deMem.lancer(20));
          System.out.println("\nPlusieurs lancés:");
          System.out.print(" | ");
          for(int i = 0 ; i < 40 ; i++){
               System.out.print(deMem.lancer()+" | ");
          }
          System.out.println("\n--------------------");

          //TEST LANCER DÉ AUTRE//
          System.out.println("TEST NOM ET LANCER DÉ AUTRE");
          System.out.println("Nom du dé : "+deBizarre.getNom());
          System.out.print("| ");
          for(int i = 0 ; i < 10 ; i++){
               System.out.print(deBizarre.lancer_special()+" | ");
          }
          System.out.println("\n--------------------");

     }
}