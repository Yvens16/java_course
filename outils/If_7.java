package outils;

public class If_7 {
  // les block de condition
  if (condition) {
    // faire mon action
  } else {
    faire autre action
  }  // parler de else if aussi

  if (20 > 18) {
    System.out.println("20 is greater than 18");
  }

  // il en est de même pour les variables 
  int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}

// Example else if
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

// utilisant du code plus concis une operation ternaire
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);


// Faites moi un petit programme
/**
 * Entrées de valeur numérique avec les valeurs que vous voulez
 * Si val1 n'est pas plus grand que val2 afficher je suis un dev
 */
}
