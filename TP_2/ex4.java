package tp2;
import java.util.Scanner; 
public class ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entrer le nombres des etoiles a atteindre :");
		int N=sc.nextInt(),i=1,j=0;
		for(i=1;i<N+1;i++) {
		for(j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println("");
		}
		}
		

	}


