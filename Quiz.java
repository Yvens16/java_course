import java.util.Scanner;

public class Quiz {
  /**
   * Si vous placez une de vos méthodes à l'intérieur de la méthode main ou à
   * l'extérieur de votre classe, le programme ne compilera pas.
   */

  /**
   * 
   * @param args
   *             Tableau avec mes questions,
   *             Tableau avec mes réponses
   *             Valeur qui contient le score sur 10
   *             Un message qui contient selon le score bof, moyen, bien
   */
  public static void main(String[] args) {
    String[] c1 = { "Molotov", "Lénine", "Staline", "Trotski" };
    String[] c2 = { "France", "Italie", "Espagne", "Portugal" };
    String[] c3 = { "The Beattles", "Bob Marley", "Jim Morisson", "Eric Clapton" };
    String[] c4 = { "La France", "L'allemagne", "l'Italie", "l'Espagne" };
    String[] c5 = { "Rome", "Milan", "Venise", "Vérone" };

    // le terme new permet d'instancier la class
    Question q1 = new Question("Quel célèbre dictateur dirigea l’URSS du milieu des années 1920 à 1953 ?", c1,
        "Staline");
    Question q2 = new Question("Dans quel pays peut-on trouver la Catalogne, l’Andalousie et la Castille ?", c2,
        "Espagne");
    Question q3 = new Question("À qui doit-on la chanson « I Shot the Sheriff » ?", c3, "Eric Clapton");
    Question q4 = new Question("Quel pays a remporté la coupe du monde de football en 2014 ?", c4, "L'allemagne");
    Question q5 = new Question(
        "Dans quelle ville italienne l’action de la pièce de Shakespeare « Roméo et Juliette » se situe-t-elle ?", c5,
        "Vérone");

    Question[] questions = { q1, q2, q3, q4, q5 };

    System.out.println("Bienvenue dans notre quiz!");

    // for (int i = 0; i < questions.length; i++) {
    //   System.out.println(questions[i].name);
    // }

    int e = 0;
    int score = 0;
    try (Scanner sc = new Scanner(System.in)) {
      while (e < questions.length) {
        System.out.println(questions[e].name);
        System.out.println(questions[e].choices[0]);
        System.out.println(questions[e].choices[1]);
        System.out.println(questions[e].choices[2]);
        System.out.println(questions[e].choices[3]);
        String input = sc.nextLine();
        System.out.println("Votre reponse est ");
        System.out.println(input);
        if (input.toLowerCase().equals(questions[e].response.toLowerCase())) {
          System.out.println("Good Response mothafucker");
          score += 2;
        }
        System.out.println('\n');
        e += 1;
      }
      String template = "Merci d'avoir participé, votre score est de %s points sur 10";
      String results = String.format(template, score);
      System.out.println(results);
    }
  }

  // private veut dire que la classe ne peut être appeller que depuis le fichier
  // et la classe dans laquelle elle est créer exactement
  // public veut dire qu'elle peut être appeller depuis l'extérieur du fichier
  public class Question {
    // le mot static veut dire que la class est appelable directement depuis la
    // class, qu'il n'y a pas besoin de l'initialiser avant de l'appeler
    // l'initialisation se ferait comme ça; Question q1 = new Qestion({});
    // q1.doSomething()
    // J'ai dû l'initialiser comme ça pour créer mon tableau
    String name;
    String[] choices = new String[] {};
    String response;

    // Le constructeur est une méthode qui doit porter le même nom que la Classe
    // c'est une règle immuable
    // Le constructeur se charge de dire à notre classe qu'il faut réserver de la
    // mémoire pour nos paramètre.
    public Question(String pName, String pChoices[], String pResponse) {
      name = pName;
      choices = pChoices;
      response = pResponse;
    }
  }

}

/**
 * Quel célèbre dictateur dirigea l’URSS du milieu des années 1920 à 1953 ?
 * - Molotov
 * - Lénine
 * - Staline *
 * Trotski
 * 
 * Dans quel pays peut-on trouver la Catalogne, l’Andalousie et la Castille ?
 * 
 * - France
 * - Italie
 * - Espagne *
 * - Portugal
 * 
 * À qui doit-on la chanson « I Shot the Sheriff » ?
 * - The Beattles
 * - Bob Marley
 * - Jim Morisson
 * - Eric Clapton *
 * 
 * Quel pays a remporté la coupe du monde de football en 2014 ?
 * 
 * - La France
 * - L'allemagne *
 * - l'Italie
 * - l'Espagne
 * 
 * Dans quelle ville italienne l’action de la pièce de Shakespeare « Roméo et
 * Juliette » se situe-t-elle ?
 * 
 * - Rome
 * - Milan
 * - Venise
 * - Vérone *
 * 
 */

/**
 * 
 * if (str1.equals(str2))
 */