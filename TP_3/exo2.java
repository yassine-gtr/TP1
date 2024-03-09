package tp2;
import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
	java.util.Scanner sc=new Scanner (System.in);
	int[] tab=new int[10];
	System.out.println("entrer 10 entier :");
	int i=0;
	for(i=0;i<10;i++) {
		tab[i]=sc.nextInt();
	}
	System.out.println("voila le tableau : ");
	for(i=0;i<10;i++) {
		System.out.print(+tab[i]+"   ");
	}

	}

}
