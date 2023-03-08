package caculo;

import java.util.Locale;
import java.util.Scanner;

public class aritmetica {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("");
		System.out.println("Entre com o segundo número: ");
		num2 = sc.nextInt();
		
		
		
		int som = num1 + num2;
		int sub = num1 - num2;
		int mult= num1 * num2;
		int div = num1 / num2;
		int soma = som + sub + mult + div;
		
		System.out.println("a soma deu: " + som);
		System.out.println("a subtração deu: " + sub);
		System.out.println("a multiplicação deu: " + mult);
		System.out.println("a divisão deu: " + div);
		System.out.println("Soma total dessa bagunça deu: " + soma);
		System.out.println("");
		
		if (soma < 1000) {
		
		System.out.println("Menor que 1000, então digite outra soma: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		som = num1 + num2;
		System.out.println(som);
		
		}else 
			System.out.println("Maior que 1000");
	}

}
