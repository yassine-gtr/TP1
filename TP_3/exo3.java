import java.util.Scanner;
public class exo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=0,i=0;
		System.out.println("entrer un entier entre 10 et 50 : ");
		N=sc.nextInt();
		while((N<10) & (N>50)) {
			System.out.println("entrer un entier entre 10 et 50 : ");
			N=sc.nextInt();
		}
		int []tab =new int[N];
		for(i=0;i<N;i++) {
			tab[i]=sc.nextInt();
		}
		System.out.println("voila le tableau : ");
		for(i=0;i<N;i++) {
			System.out.print(+tab[i]+"   ");
		}
		
	}

}
