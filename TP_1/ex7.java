import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner les valeurs a , "
				+ "b et c les paramettre de l'equation ax^2+bx+c=0");
		float a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat(),delta,x1,x2,x0;
		delta=(float)((b*b)-4*a*c);
		if(delta <0) {
			System.out.println("pas de solution");
		}
		 else if(delta==0) {
			x0=(float)(-b/(2*a));
			System.out.println("la solution de l'equation " +a+"x^2+"+b+"x+"+c+" est:" +x0);
		}
		else {
			x1=(float)((-b-Math.sqrt(delta))/(2*a));
			x2=(float)((-b+Math.sqrt(delta))/(2*a));
			System.out.println("les solution de l'equation "+a+"x^2+"+b+"x+"+c+" sont:" +x1+"et"+x2);
	}
//System.out.println("les solution de l'equation " +a+"x^2+"+b+"x+"+c+" sont:" );
}
}