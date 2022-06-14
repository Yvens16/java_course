package teste.solution;

import java.util.List;
import java.util.Scanner;

public class Solution {
  static void print(Object param) { // Object agit comme un type (any: veut dire peu importe le type de param)
    System.out.println(param);
  }
  public static void main(String[] args) {
  }

  static void jeu(char j1, char j2) { // feiulle, ciseaux, pierre P > C,
    // F > P,
    // C > F
    // P, C, F
    List<Character> list = List.of('P', 'C', 'F');
    if (!list.contains(j1) || !list.contains(j2)) {
      System.out.println("Entrée invalide");
    } else if (list.indexOf(j1) == 0 && list.indexOf(j2) == 2) { // j1 = P, j2 = F
      System.out.println(j2 + " a gagné");
    } else if (list.indexOf(j1) == 2 && list.indexOf(j2) == 0) {
      System.out.println(j1 + " a gagné");
    } else if (list.indexOf(j1) == list.indexOf(j2)) {
      System.out.println("égalité");
    } else {
      char vanq = list.indexOf(j1) < list.indexOf(j2) ? j1 : j2;
      System.out.println(vanq + " a gagné");
    }

  }

  static void PCF() {
    boolean bot;
    int[] joueur = { 0, 0 };
    String[] signe = { "Pierre", "Ciseau", "Feuille" };
    String commande;
    Scanner entree = new Scanner(System.in);
    print("2 joueurs ou 1 joueur?");
    switch (entree.nextInt()) {
      case 1:
        bot = true;
        break;

      case 2:
        bot = false;
        break;
      default:
        print("Nombre incorrect");
        return;
    }

    do {
      joueur[0] = demandeJoueur(1);
    } while (joueur[0] == -1);

    if (bot) {
      joueur[1] = (int) (Math.random() * 3);
    } else {
      do {
        joueur[1] = demandeJoueur(2);
      } while (joueur[1] == -1);
    }

    switch ((joueur[0] - joueur[1] + 3) % 3) {
      case 0:
        print(signe[joueur[0]] + " contre " + signe[joueur[1]]);
        print("Egalité");
        break;
      case 1:
        print(signe[joueur[0]] + " contre " + signe[joueur[1]]);
        print("Victoire Joueur 2");
        break;
      case 2:
        print(signe[joueur[0]] + " contre " + signe[joueur[1]]);
        print("victoire Joueur 1");
        break;
    }
  }

  static int demandeJoueur(int joueur) {
    String commande;
    print("Joueur " + joueur + " joue");
    print("P/C/F");
    Scanner entree = new Scanner(System.in);
    commande = entree.nextLine();
    switch (commande) {
      case "P":
        return 0;
      case "C":
        return 1;
      case "F":
        return 2;
      default:
        print("Mauvaise entrée");
        return -1;
    }
  }

  static void PFC(String P1, String P2) {
    P1 = P1.toUpperCase();
    P2 = P2.toUpperCase();
    if (P1 == P2)
      print("egalite");
    else if (P1 == "P" && P2 == "C")
      print("P1");
    else if (P1 == "P" && P2 == "F")
      print("P2");
    else if (P2 == "P" && P1 == "C")
      print("P2");
    else if (P2 == "P" && P1 == "F")
      print("P1");
  }

  static void tabMul(int tab) {
    for (int i = 1; i < 11; i++)
      print(tab + " + " + i + " = " + tab * i);

  }
}
