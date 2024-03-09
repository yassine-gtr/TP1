import java.util.Scanner;

public class exo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=0,i=0,j=0,p=0;
		System.out.println("entrer la taille du tableau : ");
		N=sc.nextInt();
		int []T =new int[N];
		for(i=0;i<N;i++) {
			T[i]=sc.nextInt();
		}
		System.out.println("voila le tableau initial : ");
		for(i=0;i<N;i++) {
			System.out.print(+T[i]+"   ");
		}
		for(i=0;i<N;i++) {
			for(j=0;j<i;j++) {
				p=T[i];
				T[i]=T[j];
				T[j]=p;
			}	
		}
		System.out.println("\nvoila le tableau inverse : ");
		for(i=0;i<N;i++) {
			System.out.print(+T[i]+"   ");
		}
		

	}

}
