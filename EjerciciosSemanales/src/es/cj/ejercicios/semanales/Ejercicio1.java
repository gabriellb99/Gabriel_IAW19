package es.cj.ejercicios.semanales;

import java.util.Scanner;

public class Ejercicio1 {
	
	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un entero positivo: ");
		int num1 = sc.nextInt();
		
		if(num1 > 0 && num1 < 10) {
			System.out.println("El numero es de una cifra");
		} else if(num1 >= 10 && num1 < 100) {
			System.out.println("El numero es de dos cifras");
		} else if(num1 >= 100 && num1 < 1000) {
			System.out.println("El numero es de tres cifras");
		} else if(num1 >= 1000 && num1 < 10000) {
			System.out.println("El numero es de cuatro cifras");
		} else if (num1 >= 10000) {
			System.out.println("El numero es de más de cuatro cifras");
		} else {
			System.out.println("El numero es negativo");
		}

	}

}
