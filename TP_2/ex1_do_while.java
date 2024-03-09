import java.util.Scanner;
public class ex1_tp2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("entrer le nombres des entiers a entrer en clavier :");
			int n=sc.nextInt(),i=0;
			double somme=0,produit=1,moyenne=0;
			int[] Tab=new int[n];
			do {
				Tab[i]=sc.nextInt();
				somme+=Tab[i];
				produit*=Tab[i];
				i++;
			}while(i<n);
			moyenne=(double)somme/n;
			System.out.println("la somme= "+somme+"le produit ="+produit+"la moyenne ="+moyenne);

	}

}
