package outils;

public class While_9 {
  // La boucle while boucle sur le bout de code tant que la condition est vrai 
  while(condition) {
    // Ce code s'exécute 
  }

  // en général on l'utiise de cette façon 
  int i = 0;
  while (i < 5) {
    System.out.print("J'ai dit bonjour" + " " + i + " " + "fois");
    i++; /*
      ne pas oublier d'incrémenter la variable utiliser dans la condition si 
      l'on ne veut pas que le boucle tourne à l'infini
    */
  }


  // La boucle do while
  do {
    // Ce code s'exécute
  } while (condition);

  /*
    De mettre la condition après l'exécution du code veut dire qu'elle tournera au moins une fois
    Même si la condition est fausse

    Je vous avourai que je ne l'ai moi même jamais utiliser mais j'ai  un example à vous montrer
    Est-ce que vous pouvez imaginer un exemple ou il faudrai utiliser la boucle Do while ? 
  */

  Scanner scanner = new Scanner(System.in);
  String check = "Yvens";
  String input;
  do {
    System.out.println("Password ?");
    input = scanner.nextLine();
  } while (!input.equals(check));


  // EXO
  // Scanner sc = new Scanner(System.in);
  // print("Entrez votre text");
  
  // print("Entrez votre text est:");
  // String password = "pass";
  // String input;
  // do {
  //   print("Quel est votre mot de passe ?");
  //     input = sc.nextLine();
  //   if (!input.equals(password)) {
  //     print("Mauvais mot de passe, veuillez réessayer");
  //   } else {
  //     print("Bon mot de passe, vous allez être redirigé");
  //   }
  // } while (!input.equals(password));
  //   sc.close();
}
