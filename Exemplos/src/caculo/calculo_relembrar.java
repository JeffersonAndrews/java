package caculo;

import java.util.Scanner;

public class calculo_relembrar {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);

		float num1, num2,soma,sub,mult,div;
		
		
		System.out.println("Entre com o primeiro númmero inteiro: ");
		num1 = sc.nextFloat();
		System.out.println("Entre com o segundo númmero inteiro: ");
		num2 = sc.nextFloat();
		
		soma = num1 + num2;
		sub =  num1 - num2;
		mult = num1 * num2;
		div =  num1 / num2;
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
	}

}
