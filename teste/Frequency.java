package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
  static void print(Object param) { // Object agit comme un type (any: veut dire peu importe le type de param)
    System.out.println(param);
  }

  static void isSameFrequency(int num1, int num2) {
    String number1 = Integer.toString(num1);
    String number2 = Integer.toString(num2);

    if (number1.length() != number2.length()) {
      System.out.println("Inputs mismatch");
      return;
    }
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    // Put key: number and value: frequency in HashMap;
    for (int i = 0; i < number1.length(); i++) {
      Integer num = Character.getNumericValue(number1.charAt(i));
      if (!map.containsKey(num)) {
        map.put(num, 1);
      } else {
        Integer val = (Integer) map.get(num);
        map.put(num, val + 1);
      }
    }

    // Vider le frequencyCounter:map et voir ce qu'il reste comme fréquence
    for (int i = 0; i < number2.length(); i++) {
      Integer num = Character.getNumericValue(number2.charAt(i));
      Integer val = (Integer) map.get(num);
      if ((int) map.get(num) == 0) {
        System.out.println("Not same frequency of int");
        return;
      } else {
        print("TO CHECK " + num + "map.get(num) :" + map.get(num));
        map.put(num, val - 1);
      }
    }

    System.out.println("Same frequency");
  }

  static void isAnagram(String w1, String w2) {
    /**
     * Pour savoir si 2 mots sont un anagram, je dois savoir si ils possèdent
     * les même lettres le même nombre de fois
     * Donc si le nombre de lettre est différent je retourne false de base
     * Donc je crée deux compteur de fréquence
     * Et je vérifie si les fréquence des 2 compteurs sont équivalente
     * 
     */
    if (w1.length() != w2.length()) {
      print("Nest pas un anagram car les mots n'ont pas le même nombre de lettres");
      return;
    }

    HashMap<Character, Integer> counter1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> counter2 = new HashMap<Character, Integer>();

    for (int i = 0; i < w1.length(); i++) {
      Character ch1 = (Character) w1.charAt(i);
      if (!counter1.containsKey(ch1)) {
        counter1.put(ch1, 1);
      } else {
        Integer newVal = (Integer) counter1.get(ch1) + 1;
        counter1.put(ch1, newVal);
      }
    }

    for (int i = 0; i < w2.length(); i++) {
      Character ch2 = (Character) w2.charAt(i);
      if (!counter2.containsKey(ch2)) {
        counter2.put(ch2, 1);
      } else {
        Integer newVal = (Integer) (counter2.get(ch2) + 1);
        counter1.put(ch2, newVal);
      }
    }

    // for (int i = 0; i < w1.length(); i++) {
    // Character ch = (Character)w1.charAt(i);
    // print(counter1.get(ch) + " " + counter2.get(ch));
    // if (counter1.get(ch)!=(counter2.get(ch))) {
    // print("N'est pas un anagram pour diff de fréquence");
    // return;
    // }
    // }

    /**
     * OU ITÉRER SUR LES VALEURS DU HASHMAP
     */

    for (char letter : counter1.keySet()) {
      // Print value de counter2
      // Si counter2 ne contient pas la valeur actuelle de counter1
      if (!counter2.containsKey((Character) letter)) {
        print("N'est pas un anagram pour diff de fréquence");
        return;
      }
    }

    print("C'est un anagram");
  }

  public static void main(String[] args) {
    // isAnagram("azerty", "ytreza");
  }



  static Object AveragePair(int[] arr, double target) {
    /**
     * Dans le tableau donnée, trouver la paire de chiffre qui diviser par 2 soit
     * égale au nombre donner.
     * Écrire une méthode qui retourne si oui ou non, il y a une paire et si oui,
     * retourne la paire qui donne ce résultat
     */
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    for (int n : arr) {
      newArr.add(n);
    }
    int leftPointer = 0;
    int rightPointer = 1;
    boolean isThereAverage = false;
    int indexLastElement = newArr.size() - 1; // Do this line after we use the second newArr.size() - 1;
    int number1 = 0; // Ajouter ces 2 ligne à la fin de la résolution quand tu montre comment renvoyer la Map
    int number2 = 0;


    while (leftPointer < newArr.size() - 1) {
      if ((double)(newArr.get(leftPointer) + newArr.get(rightPointer)) / 2 != target) {
        if (rightPointer == newArr.size() - 1) {
          leftPointer += 1;
          rightPointer = leftPointer + 1;
        } else {
          rightPointer += 1;
        }
      } else {
        isThereAverage = true;
        number1 = newArr.get(leftPointer);
        number2 = newArr.get(rightPointer);
        leftPointer = newArr.size() - 1; // Pour arrêté la boucle
      }
    }
    return isThereAverage ? Map.of(
      "number1", number1,
      "number2", number2) : null;
  }
  static int minSubArrayLen(int[] arr, int num) {
    /** 2,3,1,2,4,3
     * Renvoyer le nombre minimum de chiffres se suivant dont l'addition est égal au nombre visé 
    */

    int minLengthToReturn = Integer.MAX_VALUE;
    int total = 0;
    int start = 0;
    int end = 0;
    while(start < arr.length) {
      if (total < num && end < arr.length) {
        // Si total less than num add an a numbre to window
        total += arr[end];
        end++;
      } else if (total >= num) {
        // lmove window to right by removing first element of window from the total
        minLengthToReturn = Math.min(minLengthToReturn, (end - start));
        total -= arr[start];
        start++;
      } else {
        break;
      }
    }
    return minLengthToReturn == Integer.MAX_VALUE ? 0 : minLengthToReturn;
  }
}
