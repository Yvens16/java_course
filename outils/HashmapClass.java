package outils;
import java.util.HashMap;

/**
 * Un Hashmap stock des élément par paire de clé:valeur
 * On peut accéder à chaque élément en utilisant une clé
 * on import la class Hashmap de java util
 */
public class HashmapClass {
  // Syntax to initialize a Hashmap
  HashMap<String, String> map = new HashMap<String, String>();

  {
    "clé": "valeur",
    "Damien": "sympa",
    1: 123,
    "Yvens": 25,
    'a' : true,
  }

  // Méthodes
  map.get(); // Prend en paramètre qui prend un objet(Integer, String, Boolean)
          // et qui retourne la valeur de la clé dans la paire clé:valeur
  map.put(clé, valeur) // pour ajouter, mettre à jour un paire clé:valeur
  map.remove() // Prend en entré un clé pour retirer  un paire
  map.clear() // Remove all items, ne prend pas de paramètre
  map.size() // renvoie le nombre d'éléments dans la map

  /**
   * POUR AFFICHER LES CLÉ DU HASHMAP
   */
  for (String i : capitalCities.keySet()) {
    System.out.println(i);
  }
  
  /**
   * POUR AFFICHER LES VALEURS DU HASHMAP
   */
  for (String i : capitalCities.values()) {
    System.out.println(i);
  }
  /**
   * POUR AFFICHER LES LÉ ET LES VALEURS   * 
   */
  for (String i : capitalCities.keySet()) {
    System.out.println("key: " + i + " value: " + capitalCities.get(i));
  }
}
