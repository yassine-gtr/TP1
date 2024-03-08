import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner le rayon du cercle:");
		float R=sc.nextFloat();
		float pi,s,p;
		pi=(float)3.14;
		s=R*pi*pi;
		p=2*R*pi;
		System.out.println("le peremettre du cercle est :"+p+"\nla surface du cercle est:"+s);
	}

}
