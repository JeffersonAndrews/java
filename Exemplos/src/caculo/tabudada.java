package caculo;

import java.util.Locale;
import java.util.Scanner;

public class tabudada {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner qe = new Scanner(System.in);
		
		int i, num1, result;
		String c;
		char quest, s;
		
		System.out.println("Você deseja fazer a tabuada ? tecle S, não tecle N: ");
		
		c = qe.nextLine();
		
		if(c != "s") {

		System.out.println("Entre com o valor para fazer o cálculo da tabuada: ");
		num1 = sc.nextInt();
		System.out.println("será feito a tabudada com o valor: " + num1);
		
		for(i = 0; i < 1000000000; i++) {
			
			result = num1 * i;
			System.out.println("tabuada: " + num1 + " x " + i + " = " + result);
			
		}
		
	
	
		sc.close();

		}
	}
}
