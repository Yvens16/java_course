package outils;

public class Exos {
  public static void main(String[] args) {
    // 1) Afficher Hello world
      System.out.print("Hello wolrd");
    // 2) Afficher votre nom et prénom sur 2 ligne différente
      System.out.print("Yvens\n Belaston");
    // 3) Afficher une division de 2 nombres
      System.out.print(25/2);
    // 4) Afficher le produit de 2 chiffres
    System.out.print(25*2);
    // 5) Afficher si un chiffre est un multiple de 3
    System.out.print(23 % 3 == 0);
    // 6) Écrire un programme qui prend un nombre et affiche sa table de multiplication jusqu'a 10
    int num = 1;
    for (int i=0; i< 10; i++){
      System.out.println(num + " x " + (i+1) + " = " + 
        (num * (i+1)));
    }
      // 7) Écrire un programme qui nous donne la somme de 5 chiffre
      System.out.println("Hello");
      int num1 = 1; int num2 = 2; int num3 = 3; int num4 = 4; int num5 = 5;
      System.out.println("La moyenne de ces chiffres est: " + (num1 + num2 + num3 + num4 + num5) / 5);
      // 8) Écrire un programme qui vous affiche le périmètre et l'air d'un circle qui à un rayon de 6 cm
      int rayon = 6;
      double perimeter = 2 * Math.PI * rayon;
      double area = Math.PI * Math.pow(rayon, 2); // ou rayon * rayon
      System.out.println(perimeter);
      System.out.println(area);

      //9) Écrire un programme pour calculer l'air et le périmètre d'une rectangle avec une longueur de 15 et une largeur de 23
      int length = 25;
      int width = 23;
      double airRectangle = length * width;
      double perimeterRectangle = 2*(length + width);

      //10) Écrire un programme pour afficher la version de java qui est installé sur votre ordinnateur
      // To look for in the example: get java version in java
      System.out.println(System.getProperty("java.version"));
      // 11) Écrire un programme qui nous dis quel joueur à gagner à Pierre Feuille Ciseaux
      // L'algorithme est une fonction qui prend en entrée le choix du player2 et le choix du player2
      // Selon les règle que vous connaisser dites qui est le gagnant ou si c'est une égalité
      static void Pfc(String player1, String player2) {
        switch(player1) {
          case "p":
          if (player2 == "f") {
            System.out.print("player2");
          } else if (player2 == "c") {
            System.out.print("player1");
          } else {
            System.out.print("C'est une égalité");
          }
          break;
          case "f":
          if (player2 == "c") {
            System.out.print("player2");
          } else if (player2 == "p") {
            System.out.print("player1");
          } else {
            System.out.print("C'est une égalité");
          }
          break;
          case "c":
          if (player2 == "p") {
            System.out.print("player2");
          } else if (player2 == "f") {
            System.out.print("player1");
          } else {
            System.out.print("C'est une égalité");
          }
        }
      }
      // 12) Créer un programme qui selon si on lui donne un mois sous la forme d'un chiffre de 1 à 12
      // Nous retourne de quel trimestre il fait partie sachant qu'il y 4 trimestre
        /**
   * chiffre de 1 à 12
   * Trimestre 1 ==> les mois inférieur à 4
   * Trimestre 2 ==> les mois compris en 3 et 7 strict
   * Trimestre 1 ==> les mois compris en 6 et 10 strict
   * Trimestre 1 ==> les mois compris en 9 et 13 strict
   * 
   * @param args
   */

  static void WhichSemester(int month) {
    if (month < 4) {
      System.out.print(1);
    } else if (month > 3 && month < 7) {
      System.out.print(2);
    } else if (month > 6 && month < 10) {
      System.out.print(3);
    } else {
      System.out.print(4);
    }
  }
  }
  // 13) 
  /**
    Notre héros est en route pour le château maléfique pour sauver la princesse,
    le problème étant que le château est entouré de dragon, 
    il sait qu'il faut 2 balles pour tuer un dragon alors combien de balles lui faudra t'il pour tuer x dragon
    Sachant qu'il va prendre un nombre spécifique de balle et qu'il devra affronter un nombre spécifique de dragon
    Vous devez nous dire si il survivra à son aventure !
    La fonction prend en entrer le nombre de balle et le nombre de dragon
  */

    /**
   * Je sais qu'il faut 2 balle pour tuer un dragon
   * Je connais le nombre de balle et le nombre de dragon
   * Je dois retourner si le héro survivra ou pas 
   * donc je dois multiplier le nombre de dragon par 2 et le comparer au nombre de balles
   *  
   * @param bullet
   * @param dragon
   */

  static void hero(int bullets, int dragon){
    if (dragon * 2 > bullets) {
      System.out.print("Notre héro meurt");
    } else {
      System.out.print("Notre héro survie ! ");
    }
  }

  // 14) Votre fonction prend 2 arguments l'âge du père et l'âge du fils
  // Calculer, il y'a combien d'année le père avait le double de l'âge du fils ou dans combien d'année ce sera le cas

    /**
   * 2 params l'âge du père et celui du fils
   * prendre l'âge du fils, le multiplier par 2 le comparer à l'âge du pere
   * on fais l'âge du père moins le double si c'est positif il avait le double il y 'a x années '
   * Si c'est négatif il aura le double dans x annés
   * @param args
   */
  static void twiceAsOld(int dadAge, int sonAge) {
    if (dadAge <= sonAge) {
      print("Entrée invalide");
      return;
    }
    int doubleSonAge = sonAge * 2;
    int age = dadAge - doubleSonAge;
    if (dadAge - doubleSonAge > 0) {
      System.out.print("Il avait le double de l'âge de son fils il y a " + age + " ans");
    } else {
      System.out.print("Il aura le double de l'âge de son fils il y dans " + -age + " ans");
    }
  }

  //15) Utiliser une méthode récursive pour calculer un factoriel
    public static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial (n-1);
    }
  
}




