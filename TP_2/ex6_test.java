package tp2;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer un nombre pour tester si premier ou non :");
		int x=sc.nextInt(),i=1,p=0;
		for(i=2;i<x;i++) {
		if(x%i==0) {
			p=1;
		}
		}
		if(p==0) {
			System.out.println("le nombre "+x+" est premier ");
		}
		else
			System.out.println("le nombre "+x+" n'est pas premier ");
		}

	}


