package outils;

public class ForLoop_10 {
  /** 
   * la Boucle for est à utiliser lorsque vous savez exactement combien de fois vous voulez que votre 
   * block de code s'exécute
   * */

  for (i = 0; i < 5; i++) {
    // Le premier initialise une variable avant le début de la loop
    // Le second sera votre condition d'exécution
    // Le 3ème sera incrémente votre variable condition après l'exécution du code;
    // Souvenez vous que i++ équivaut à i = i + 1; donc cela pourrait être i = i+2; par example
    System.out.print(i);
    // Cette boucle est très utile et est souvent utilisé
  }

  for (type varable: tableau) {

  }


  arraylist.forEach(item->System.out.println(item));
  


  // Vous pouvez utiliser break pour arrêter la boucle qaund vous le souhaiter ou continue
  int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
  // Vous pouvez utiliser continue pour la continuer selon une condition
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

  // La boucle for-each que nous allons voir mais d'abors jetons un oeil aux tableau
}
