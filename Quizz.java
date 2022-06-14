import java.util.Scanner;

public class Quizz {

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

        Question[] questions = {q1,q2,q3,q4,q5};
        System.out.print("Bienvenu dans notre Quiz");

        Scanner sc = new Scanner(System.in);

        // for(int  i= 0; i < 5; i++) {
        //   System.out.print(i);
        // }
        int e = 0;
        int score = 0;
        while(e < questions.length) {
          System.out.println(questions[e].name);
          System.out.println(questions[e].choices[0]);
          System.out.println(questions[e].choices[1]);
          System.out.println(questions[e].choices[2]);
          System.out.println(questions[e].choices[3]);
          String input = sc.nextLine();
          System.out.println("Votre réponse est");
          System.out.println(input);

          if(input.equals(questions[e].response)) {
            System.out.println("Vous avez choisie la bonne réponse");
            score += 2;
          } else {
            System.out.println("Vous avez choisie la mauvaise réponse");
          }
          e+=1;
        }

        String template = "Merci d'avoir participé, votre score est de %s";
        String result = String.format(template, score);
        System.out.println(result);

  }

  private static class Question {
    String name;
    String[] choices;
    String response;


    public Question(String pName, String[] pChoices, String pResponse) {
        name = pName;
        choices = pChoices;
        response = pResponse;
    }
    
  }
  
}
