package tp2;

import java.util.Scanner;

public class ex5{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner le nombre a mettre en factoriel :");
		int x=sc.nextInt(),i=1;
		long y=1;
		if(x==0 || x==1) 
			i=1;
			else {
		while (i<=x) {
			y=(long)y*i;
			i++;
		}
		
	}
		System.out.println("le factoriel est :"+y);
		}

}
