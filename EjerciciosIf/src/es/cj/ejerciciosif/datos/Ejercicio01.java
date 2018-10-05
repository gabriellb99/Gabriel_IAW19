package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio01 {
	
	//Pedir nota de 0 a 10 y mostrarla como insuficiente, sufuciente, bien, notable y sobresaliente
	private static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce tu nota: ");
		double nota = sc.nextDouble();
		
		if(nota >= 0 && nota < 5) {
			System.out.println("Tu nota es insuficiente");
		} else if (nota >= 5 && nota < 6){
			System.out.println("Tu nota es suficiente");
		} else if (nota >= 6 && nota < 7){
			System.out.println("Tu nota es bien");
		} else if (nota >= 7 && nota < 9){
			System.out.println("Tu nota es notable");
		} else if (nota >= 9 && nota <= 10){
			System.out.println("Tu nota es sobresaliente");
		} else {
			System.out.println("No es evaluable");
		}
		
		switch ((int)nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default: System.out.println("Valor incorrecto");
			break;
		}
		
		sc.close();

	}

}
