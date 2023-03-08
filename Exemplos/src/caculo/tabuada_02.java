package caculo;

import java.util.Locale;
import java.util.Scanner;

public class tabuada_02 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma, x, y;
		
		System.out.println("Entre com o valor de x: ");
		
		x = sc.nextInt();
		
		System.out.println("Entre com o valor de y: ");
		
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("O valor da soma é: " + soma );
		
		System.out.println();
		
	
			while(soma >= 30) {
				
				System.out.println("Entre com o valor de x: ");
				
				x = sc.nextInt();
				
				System.out.println("Entre com o valor de y: ");
				
				y = sc.nextInt();
				
				soma = x + y;
				
				System.out.println("O valor é menor então o sistema para com: " + soma );
				
			} 
			
	}
	
	

}
