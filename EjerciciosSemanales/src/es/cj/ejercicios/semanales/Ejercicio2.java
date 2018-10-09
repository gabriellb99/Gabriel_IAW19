package es.cj.ejercicios.semanales;

import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce las horas trabajadas: ");
		int horas = sc.nextInt();		
		int diferencia;
		int salario;
		
		if(horas <= 40) {
			horas = horas * 16;
			System.out.println("El salario es: " + horas);
		} else if(horas > 40){
			diferencia = horas - 40;
			diferencia = diferencia * 20;
			salario = diferencia + (40 * 16);
			System.out.println("El salario es: " + salario);	
		} else {
			System.out.println("El numero no es positivo");	
		}
		
	}

}
