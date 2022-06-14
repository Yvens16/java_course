package teste.exos;

import java.util.List;

public class Incrementer {

  /**
   * Inversez la chaîne de charactère
   * 
   * @param numbers
   * @return
   */

  public static String reverse(String s) {
    String reverse = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      reverse = reverse + s.charAt(i);
    }
    return reverse;
  }

  /**
   * Selon un tableau de départ, renvoyer un tableau dont tous ces élements seront
   * incrémenté de leur position.
   * Ici nous parlons de la position à partir de 1 et non 0;
   * Votre résultat ne peut contenir que un chiffre donc si votre résultat est
   * composé de plus d'un chiffre retourné le dernier chiffre du nombre.
   * 32 --> 2
   */
  // [1, 2, 3] --> [2, 4, 6] [1+1, 2+2, 3+3]

  public static int[] incrementer(int[] numbers) { // 1)
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (numbers[i] + i + 1) % 10;
      //
    }
    return numbers;
  }

  /**
   * You will be given an array and a limit value. You must check that all values
   * in the array are below or equal to the limit value. If they are, return true.
   * Else, return false.
   * You can assume all values in the array are numbers.
   * 
   * @param args
   */

  /**
   * Votre méthode prend en paramètre un tableau et une limite
   * Vous devez vérifier si toutes les valeur du tableau
   * 
   * @param args
   */
  public static boolean smallEnough(int[] a, int limit) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] > limit) {
        return false;
      }
    }
    return true;
  }

  /**
   * Un bus fait son chemin à travers la ville. Il s'arrête à plusieurs arrêts
   * pour laisser monter et descendre des passagers.
   * Il vous est donné un tableau de tableaux, comportant en premier élément le
   * nombre de personnes montant dans le bus
   * et en second élément le nombre de personnes descendant du bus.
   * 
   * Au dernier arrêt retournez le nombre de passagers à devoir descendre au
   * terminus
   * 
   * @param args
   */
  // int[][] busStops = {{5,3}, {3,4}, {6,2}};
  // print(busStops[0][1]);
  public static int countPassengers(int[][] stops) {
    // Code here!
    int result = 0;
    for (int i = 0; i < stops.length; i++) {
      result += stops[i][0];
      result -= stops[i][1];
    }
    return result;
  }

  /**
   * Votre voiture est vielle, elle peut encore résister à 8 choque avant d'être
   * inutilisable
   * La route est représenté par une chaîne de charactère
   * Une partie plate de la route sera représenté par un underscore et un choque
   * par n
   * Retournez "Ouff" si vous arrivez à destination (moins de 8 choque) ou "Et
   * merde" si la voiture ne résiste pas
   * 
   * @param road
   * @return
   */

  String road = "_nnnnnnn_n__n______nn__nn_nnn";

  public static String bumps(final String road) {
    int count = 0;
    for (int i = 0; i < road.length(); i++) {
      if (road.charAt(i) == 'n')
        count++;
    }
    if (count <= 15)
      return "Woohoo!";
    else
      return "Car Dead";
  }

  public static void main(String[] args) {

  }

  static void tableauMultiplication(int n) {
    if (n <= 0) {
      System.out.println("Mauvaise entrée");
      return;
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
      System.out.println("-----------");
    }
  }

  static void jeuAvecSwitch(char j1, char j2) { // PCF
    if (Character.isLetter(j1) && Character.isLetter(j2)) {
      if (j1 == j2) {
        System.out.println("Egalité");
        return;
      }
      String combin = (j1 + "" + j2).toUpperCase(); // PCF ==> PC, PF, CF, CP, FP, FC
      switch (combin) {
        case "PC":
        case "CP":
        case "FP":
          System.out.println(j1 + " a gagné");
          break;
        case "PF":
        case "CF":
        case "FC":
          System.out.println(j2 + " a gagné");
          break;
      }
    } else {
      System.out.println("Entrée invalide");
    }
  }
}
}

