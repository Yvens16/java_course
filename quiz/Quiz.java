package quiz;

public class Quiz {
  public static void main(String[] args) {
    String[] c1 = {"Molotov", "Lénine", "Staline", "Trotski"};
    String[] c2 = {"France", "Italie", "Espagne", "Portugal"};
    String[] c3 = {"The Beattles", "Bob Marley", "Jim Morisson", "Eric Clapton"};
    String[] c4 = {"La France", "L'allemagne", "l'Italie", "l'Espagne"};
    String[] c5 = {"Rome", "Milan", "Venise", "Vérone"};
    
    Question q1 = new Question("Quel célèbre dictateur dirigea l’URSS du milieu des années 1920 à 1953 ?", c1, "Staline");
    Question q2 = new Question("Dans quel pays peut-on trouver la Catalogne, l’Andalousie et la Castille ?", c2, "Espagne");
    Question q3 = new Question("À qui doit-on la chanson « I Shot the Sheriff » ?", c3, "Eric Clapton");
    Question q4 = new Question("Quel pays a remporté la coupe du monde de football en 2014 ?", c4, "L'allemagne");
    Question q5 = new Question("Dans quelle ville italienne l’action de la pièce de Shakespeare « Roméo et Juliette » se situe-t-elle ?", c5, "Vérone");
  }

  private static class Question {
    String name; 
    String[] choices = new String[]{};   
    String response;

    public Question(String pName, String pChoices[], String pResponse) {
      name = pName;
      choices = pChoices;
      response = pResponse;
    }
  }
  
}



