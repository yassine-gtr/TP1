import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la valeur de la variable a meetre a la puissance n:");
		double x=sc.nextDouble(),y;
		int n,i;y=1;
		System.out.println("donner la valeur de  la puissance n");
		n=sc.nextInt();
		   for(i=0;i<n;i++) {
             y=y*x;
	        }
        System.out.println("la valeur de x^n=" +y);
	}
}
