package teste;

public class Matrice {
  static void print(Object params) {
    System.out.println(params);
  }
  static void diagonalDiff() {
    /**
     * Calculer la différence des diagonales de sorte à toujours avoir un nombre positifs
     */
    int[][] matrice = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    int diag1 =0;
    int diag2 =0;
    for(int i = 0; i < matrice.length; i++) {
      diag1 += matrice[i][i];
      diag2 += matrice[i][matrice.length -1 - i];
    }
    print(diag1 - diag2);
  }
    /**
   * Un bus fait son chemin à travers la ville. Il s'arrête à plusieurs arrêts
   * pour laisser monter et descendre des passagers.
   * Il vous est donné un tableau de tableaux, comportant en premier élément le
   * nombre de personnes montant dans le bus
   * et en second élément le nombre de personnes descendant du bus.
   * 
   * Au dernier arrêt retournez le nombre de passagers à devoir descendre au
   * terminus
   * 
   * @param args
   */
  // int[][] busStops = {{5,3}, {3,4}, {6,2}};
  // print(busStops[0][1]);
  public static int countPassengers(int[][] stops) {
    // Code here!
    int result = 0;
    for (int i = 0; i < stops.length; i++) {
      result += stops[i][0];
      result -= stops[i][1];
    }
    return result;
  }
}
