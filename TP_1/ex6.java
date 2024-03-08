import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner les valeurs a et b ,les paramettre de l'equation ax+b=0");
		float a=sc.nextFloat(),b=sc.nextFloat(),y;
		if(a==0) {
			System.out.println("pas de solutions");
		}
		else {
			y=(float)-(b/a);
			System.out.println("la solution est :"+y);
		}

	}

}
