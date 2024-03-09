package tp3;
import java.util.Scanner;

public class exo7 {
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

        // Calculer le plus grand écart dans le tableau
        int plusGrandEcart = calculerPlusGrandEcart(tableau);

        // Afficher le plus grand écart
        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);

        scanner.close();
    }

    // Méthode pour calculer le plus grand écart dans un tableau
    public static int calculerPlusGrandEcart(int[] tableau) {
        int plusGrandEcart = 0;
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                int ecart = Math.abs(tableau[i] - tableau[j]);
                if (ecart > plusGrandEcart) {
                    plusGrandEcart = ecart;
                }
            }
        }
        return plusGrandEcart;
    }
}
