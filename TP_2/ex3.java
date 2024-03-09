import java.util.Scanner;
public class ex3_tp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entrer le nombre pour calculer la somme de la serie harmonique: ");
		int N=sc.nextInt();
	    float s=0,i=0;
	    for(i=1;i<N+1;i++) {
	    	s=(float)(s+(1/i));
	    }
	    System.out.println("la somme de la serie harmonique est :"+s);
	}

}
