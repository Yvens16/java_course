package src.part05_boucle;
import java.util.Scanner;

/* ----------------------------------------------------
Exercice 5.3
Ecrire un algorithme qui demande un nombre de d�part,
et qui ensuite affiche les dix nombres suivants.
Par exemple, si l'utilisateur entre le nombre 17,
le programme affichera les nombres de 18 � 27.
------------------------------------------------------*/
public class Exo5_3bis {
	public static void main(String[] args) {
		int nb, i;

		System.out.println("Veuillez entrer un nombre");
		Scanner sc = new Scanner(System.in);
		nb = sc.nextInt();
		sc.close();

		System.out.println("Les 10 nombres suivants sont :");
		for (i = nb + 1; i <= nb + 10; i++) {
			System.out.println(i);
		}
	}
}
