package caculo;

import java.util.Locale;
import java.util.Scanner;

public class calculo_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0;
		
		while(num1 <= 1000) {
		
		System.out.println("Digite um valor com mais de 2 casas decimais e aperecera só duas: ");
		
		num1 = sc.nextFloat();
		
		System.out.printf("Reultado : %.2f%n", num1);
		
		}
		sc.close();

	}

}
