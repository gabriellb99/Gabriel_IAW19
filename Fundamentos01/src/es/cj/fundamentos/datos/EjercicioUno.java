package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioUno {
	
	//Programa que realize la conversión de grados Celsius a Fahrenheit.
	//Los grados Celsius debe introducirlos el usuario.

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double grados = sc.nextDouble();
		double fahrenheit = (grados * 1.8) + 32;
		System.out.println(grados + " grados celsius son " + fahrenheit + " grados fahrenheit");
	}
}
