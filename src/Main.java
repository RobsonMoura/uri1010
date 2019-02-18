import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qt1, qt2;
		double p1, p2, t;
		
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		p1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		p2 = sc.nextDouble();
				
		t = qt1 * p1 + qt2 * p2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", t);
		
		
		sc.close();
		
	}

}
