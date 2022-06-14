package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class Anial {

  static void print(Object param) { // Object agit comme un type (any: veut dire peu importe le type de param)
    System.out.println(param);
  }
  static Object[] tab = { "Yvens", 25, "Theodore", 22, "Bertrand", 40 };
  static Object put(Object Key, Object Value){
    for(int i = 0; i < tab.length; i+=2){
      if (Key == tab[i]){
      Object k = tab[i+1];
      tab[i+1] = Value;
      return k;
      }  
    } 
    Object[] nvpays = tab;
    Object [] tab = new Object[nvpays.length+2];
  //      print(Arrays.toString(tab));
    for (int i= 0; i < nvpays.length; i++){
      tab[i] = nvpays[i];
    }
    tab[nvpays.length] = Key;
    tab[nvpays.length+1] = Value; 
    print(Arrays.toString(tab));
    return null;
  }
  public static void main(String[] args) {
    print(Arrays.toString(tab));
    put("France", "Paris");
    print("After" + Arrays.toString(tab));
    // Object[] tab = { "Yvens", 25, "Theodore", 22, "Bertrand", 40 };
  }

  static void printTab(Object[] tab) {
    for (int c = 0; c < lengthCustom(tab) * 2; c = c + 2) {
      System.out.print("{" + tab[c] + ", " + tab[c + 1] + "}");
    }
    System.out.println();
  }

  static void printTabex(Object[] tab) {
    for (int c = 0; c < lengthCustom(tab) * 2; c++) {
      System.out.print(tab[c] + " ");
    }
    System.out.println();
  }

  static Object[] removeCustom(Object[] tab, Object cle) {
    int index = 0;
    for (int c = 0; c < lengthCustom(tab) * 2; c++) {
      if (tab[c] == cle) {
        index = c;
        break;
      }
    }
    Object[] tabStock = new Object[tab.length - 2];
    for (int c = index; c < tab.length - 2; c++) {
      tab[c] = tab[c + 2];

    }
    for (int c = 0; c < tabStock.length; c++) {
      tabStock[c] = tab[c];
    }
    return tabStock;
  }

  static int lengthCustom(Object[] tab) {
    int len = 0;
    try {
      while (tab[len] == tab[len]) {
        len++;
      }

    } catch (Exception e) {

    }
    return len / 2;
  }

  static Object[] putCustom(Object[] tab, Object cle, Object valeur) {
    boolean test = true;
    for (int c = 0; c < lengthCustom(tab); c = c + 2) {
      if (tab[c] == cle) {
        System.out.println("La clé existe déjà et corresponds à la valeur " + tab[c + 1]);
        test = false;
      }
    }
    if (test) {
      Object[] tabStock = new Object[lengthCustom(tab) * 2 + 2];
      for (int c = 0; c < lengthCustom(tab) * 2; c++) {
        tabStock[c] = tab[c];
      }
      tabStock[lengthCustom(tab) * 2] = cle;
      tabStock[lengthCustom(tab) * 2 + 1] = valeur;
      return tabStock;
    } else {
      return tab;
    }
  }

  static Object getCustom(Object[] tab, Object cle) {
    int index = 0;
    for (int c = 0; c < lengthCustom(tab) * 2; c++) {
      if (tab[c] == cle) {
        index = c;
        break;
      }
    }
    return (tab[index + 1]);
  }

  static Object[] clearCustom() {
    Object[] tabStock = new Object[0];
    return tabStock;
  }
}

// public class cartealt {
// public ArrayList<Object> MapCle = new ArrayList<Object>();
// public ArrayList<Object> MapVal = new ArrayList<Object>();

// Object Get(Object cible) {
// if (MapCle.contains(cible))
// return MapVal.get(MapCle.indexOf(cible));
// return null;
// }

// static void print(Object element) {
// System.out.println(element);
// }

// void put(Object entree, Object valeur) {
// print("appel");
// if (MapCle.contains(entree)) {
// MapVal.remove(MapCle.indexOf(entree));
// MapVal.add(MapCle.indexOf(entree), valeur);
// return;
// }
// MapCle.add(entree);
// MapVal.add(valeur);
// return;
// }

// public static void main(String[] args) {
// }

// }

public class cartealt {
  public ArrayList<Object> MapCle = new ArrayList<Object>();
  public ArrayList<Object> MapVal = new ArrayList<Object>();

  Object Get(Object cible) {
    if (MapCle.contains(cible))
      return MapVal.get(MapCle.indexOf(cible));
    return null;
  }

  static void print(Object element) {
    System.out.println(element);
  }

  Object put(Object entree, Object valeur) {
    print("appel");
    if (MapCle.contains(entree)) {
      Object buffer = MapVal.get(MapCle.indexOf(entree));
      MapVal.remove(MapCle.indexOf(entree));
      MapVal.add(MapCle.indexOf(entree), valeur);
      return buffer;
    }
    MapCle.add(entree);
    MapVal.add(valeur);
    return null;
  }

  void clear() {
    MapCle.clear();
    MapVal.clear();
  }

  int size() {
    return MapCle.size();
  }

  Object remove(Object entree) {
    if (MapCle.contains(entree)) {
      Object buffer = MapVal.get(MapCle.indexOf(entree));
      MapVal.remove(MapCle.indexOf(entree));
      MapCle.remove(entree);
      return buffer;
    }
    return null;
  }

}