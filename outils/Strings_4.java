package outils;

public class Strings_4 {
  // Les string et leur méthodes, c'est du texte entouré de double quotes

  String name = "yvens";
  String name2 = "JEAN"
  // voyojs voir les opérations que l'on peut faire sur les strings
  System.out.println(name.toUpperCase()); // permet de mettre en majuscule toute les lettres
  System.out.println(name2.toLowerCase());// permet de mettre en minuscule toute les lettres


  String phrase = "Bonjour tous le monde";
  System.out.println(phrase.indecOf("tous")); // donne l'index de la 1ere occurence du mot recercher
  // Qu'est qu'un index ? explain

  System.out.print(name + " " + name2) // This called concatenation, faire attention à l'espace créer dans le string vide
  System.out.println(name.concat(name2)); //on peut aussi utiliserla méthode concat

  String text = "Bonjour à tous, je m'appelle Yvens et je suis un "très bon" dev"; // need to add backslash to escape
  String text2 = "Bonjour à tous, je m'appelle Yvens et je suis un \"très bon\" dev";

  String text3 = "Ce charactère \\ est un backslash"; // Cela permet aussi d'insérer un backslash
}
