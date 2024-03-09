package tp2;
import java.util.Scanner;
public class ex6_comptage {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entrer un entier pour compter les nombres premier de 1 jusqu'a ce entier : ");
		int x=sc.nextInt(),i=1,j=0,p=0;
		System.out.print("les nombres premiers de 1 jusqu'a "+x+" est : ");
		for(i=2;i<1+x;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					p=1;
				}
			}
			if(p==0) {
				System.out.print(+i+"   ");
		}
		}
	
		
	}

}
