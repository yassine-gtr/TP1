import java.util.Scanner;
public class exo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entrer les des deux nombres pour calculer leur PGCD :");
		int x=sc.nextInt(),y=sc.nextInt(),i=1,PGCD=1;
		for (i=x+y;i>0;i--) {
			if(x%i==0 && y%i==0) {
			 PGCD=i;
			 break;
			}
			
	}
		System.out.println("le PGCD des nombres "+x+" et "+y+" est :"+PGCD);
	}
}


