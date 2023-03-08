package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os valores a, b, c para ser feito a soma x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
System.out.println("Digite os valores a, b, c para ser feito a soma y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double somax = x.soma();
		double somay = y.soma();
		
		System.out.println("O valor da soma é : " + somax);
		System.out.println("O valor da soma é : " + somay);

	}

}
