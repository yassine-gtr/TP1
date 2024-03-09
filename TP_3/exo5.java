package tp3;
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int N = scanner.nextInt();

        // Déclarer et initialiser le tableau
        int[] T = new int[N];
        int[] TP = new int[N]; // Tableau pour les valeurs positives
        int[] TN = new int[N]; // Tableau pour les valeurs négatives
        int indexTP = 0;
        int indexTN = 0;

        // Remplir le tableau par des valeurs entrées au clavier
        System.out.println("Entrez les valeurs du tableau : ");
        for (int i = 0; i < N; i++) {
            T[i] = scanner.nextInt();
            if (T[i] > 0) {
                TP[indexTP++] = T[i];
            } else if (T[i] < 0) {
                TN[indexTN++] = T[i];
            }
        }

        // Afficher le tableau initial
        System.out.println("Tableau initial :");
        afficherTableau(T);

        // Afficher le tableau TP
        System.out.println("Tableau TP (valeurs positives) :");
        afficherTableau(TP, indexTP);

        // Afficher le tableau TN
        System.out.println("Tableau TN (valeurs négatives) :");
        afficherTableau(TN, indexTN);

        scanner.close();
    }

    // Méthode pour afficher un tableau avec une taille spécifiée
    public static void afficherTableau(int[] tableau, int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }

    // Méthode pour afficher un tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }
}
