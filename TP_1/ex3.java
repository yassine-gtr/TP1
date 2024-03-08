import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println(" donner la valeur de a=");
		int a=Sc.nextInt();
		System.out.println(" donner la valeur de b=");
		int b=Sc.nextInt(),p;
		System.out.println("les valeurs avant permutation a="+a+" b="+b);
		p=a;
		a=b;
		b=p;
		System.out.println("les valeurs apres permutation a="+a+" b="+b);
		

		

	}

}
