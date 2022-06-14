package outils;

public class Tableau_11 {
  // Les tableaux sont utiliser pour stocker différentes valeurs
  // Pour déclarer un tableau, il faut définir le type des elements contenu avec des paranthèses
  // la taille d'un tableau est fixe, on ne peut la modifier à moint de créer un nouveau tableau

  String[] names = {"Yvens", "Tim", "Maud"};
  names = new String[10];
  // puis remplir chaque position avec une valeur
  names[0] = "Bla";
  int[] ages = {25, 32, 26};

  // Vous le verrez plus tard mais toute chose est un objet en java et 
  //chaque objet provient d'une classe appeler Object
  // donc si vous voulez créer un tableau avec des élément de type différents il faut leur donner le type Object
  Object[] arr = {23, "Yvens"};


  // Vous pouvez soit afficher les élement du tableau selon leur index
  System.out.println(arr[0]);
  System.out.println(arr[1]);

  // Ou utiliser la for-each loop qui va boucler sur le tableau et vous afficher chacun de ces éléments

  for (type varable: tableau) {

  }

  for (Object el: arr) {
    System.out.print(el);
  }

  /**The difference between a built-in array and an ArrayList in Java, is that the size 
   * of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 
   * While elements can be added and removed from an ArrayList whenever you want. 
   * The syntax is also slightly different: */

   /**
    * Un arrayList utilise des tableau basic sous le capot, si le tableau n'est pas assez grand il va en créer un nouveau et effacer précédent
    */

  import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
cars.add("Element");
cars.get(0); // To access an element
cars.set(0, "Opel"); // To change the value of an element
cars.remove(0); // to remove an element
cars.clear(); // to clear the array
cars.size(); // To get the length of the array

arraylist.forEach(item->{
  if("D".equals(item)){
     System.out.println(item);
  }
});
/**
 * WRAPPER CLASS TO REPLACE PRIMITIVE 
 * Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
 */
// byte	Byte
// short	Short
// int	Integer
// long	Long               
// float	Float
// double	Double
// boolean	Boolean
// char	Character
// Ce sera tous ce que l'on verra pour l'instant
}

// Node express sql; // faire un cours sur une api rest JS
// Cours de 20 min, digérable par des non tech et montrer un peu de code si possible.
// 10 min de questions
// Mercredi 16 à 17h15
// Faire une API rest;
// Rester assez général sans devenir trop technique, pure mysql ? 
// pure mysql, pour passer le titre
