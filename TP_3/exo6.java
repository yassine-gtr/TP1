package tp3;
import java.util.Scanner;
import java.util.Arrays;

public class exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Créer un tableau avec la taille saisie par l'utilisateur
        int[] tableau = new int[taille];

        // Demander à l'utilisateur de remplir le tableau
        System.out.println("Remplissez le tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Calculer la somme des éléments du tableau
        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        System.out.println("La somme des éléments du tableau est : " + somme);

        // Calculer la moyenne des éléments du tableau
        double moyenne = (double) somme / taille;
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);

        // Copier le tableau dans un deuxième tableau T2
        int[] tableau2 = Arrays.copyOf(tableau, taille);

        // Afficher le deuxième tableau (T2)
        System.out.println("Le deuxième tableau (T2) est : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau2[i] + " ");
        }
        System.out.println();

        // Classer les éléments du tableau dans un ordre croissant
        Arrays.sort(tableau);
        System.out.println("Le tableau après le classement dans un ordre croissant est : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
