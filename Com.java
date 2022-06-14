import java.util.Scanner;
//import java.util.*; 
//Ceci importe toutes les classes du package java.util

public class Com {
  public static void main(String[] args) {
    System.out.println("Tapez votre message");
    try (Scanner sc = new Scanner(System.in)) {
      String message = sc.nextLine();
      System.out.println("Le message que vous avez tapé est ");
      System.out.println(message);
    }
  }
}
