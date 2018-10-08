package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjerciciosIF {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		//Pedir dos números y decir si son iguales o no
		System.out.println("Primer número :");
		double num1 = sc.nextDouble();
		System.out.println("Segundo número :");
		double num2 = sc.nextDouble();
		
		if (num1 == num2)
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);
		
		
		//Pedir un número e indicar si es positivo o negativo
		System.out.println("Número :");
		double num = sc.nextDouble();
		
		if (num < 0)
			System.out.println(num + " es negativo.");
		else
			System.out.println(num + " es positivo");
		
		
		//Pedir dos números y decir si uno es múltiplo del otro
		if (num1 % num2 == 0)
			System.out.println(num1 + " es múltiplo de " + num2);
		else if (num2 % num1 == 0) 
			System.out.println(num2 + " no es multiplo de " + num1);
		else 
			System.out.println("No son multiplos");
		
		
		//Pedir dos números e indicar cual es el mayor o si son iguales
		if (num1 > num2) 
			System.out.println(num1 + " es mayor que " + num2);
		else if (num2 > num1) 
			System.out.println(num2 + " es mayor que " + num1);
		else 
			System.out.println("Son iguales");
		
		
		//Pedir dos números y mostrarlos ordenados de mayor a menor
		if (num1 > num2)
			System.out.println(num1 + " , " + num2);
		else
			System.out.println(num2 + " , " + num1);
		
		//Pedir 3 numeros y mostrarlos ordenados
		System.out.println("Nº 3: ");
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num1 + " , " + num2 + " , " + num3);
			} else {
				System.out.println(num1 + " , " +  num3 +" , " +  num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + " , " +  num1 + " , " + num3);
			} else {
				System.out.println(num2 + " , " + num3 + " , " + num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num2 > num1) {
				System.out.println(num3 + " , " + num2 + " , " + num1);
			} else {
				System.out.println(num3 + " , " + num1 + " , " + num2);
			}
		} else {
			System.out.println("Los tres son iguales");
		}
		
		
		//Pedir nota de 0 a 10 y mostrarla como insuficiente, sufuciente, bien, notable y sobresaliente
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
		
		
		//Pedir al usuario día mes y año comprobar que la fecha es correcta
		System.out.println("Año :");
		int year = sc.nextInt();
		System.out.println("Mes :");
		int mes = sc.nextInt();
		System.out.println("Día :");
		int dia = sc.nextInt();
		boolean bisiesto = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		boolean fechaCorrecta = false;
		if(year > 0) {
			if (bisiesto && mes == 2) {
				bisiesto = true;
				if(mes > 0 && mes <= 12) {
					switch (mes) {
					case 2:
						if(dia >= 1 && dia <=29 && bisiesto)
							fechaCorrecta = true;
						else if(dia >=1 && dia <= 28 && !bisiesto)
							fechaCorrecta = true;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if(dia >= 1 && dia <= 31)
							fechaCorrecta = true;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if(dia >= 1 && dia <= 30)
							fechaCorrecta = true;
						break;
					}	
					
				}
			
			}
		}
		
		if(fechaCorrecta)
			System.out.println("fecha correcta: " + dia + "/" + mes + "/" + year);
		else
			System.out.println("fecha incorrecta: " + dia + "/" + mes + "/" + year);
		sc.close();
		
		*/
		//Pedir día, mes y año y mostrar la fecha del día siguiente. Suponer que todos los meses son de 30 días
		System.out.println("Día :");
		int dia1 = sc.nextInt();
		System.out.println("Mes :");
		int mes1 = sc.nextInt();
		System.out.println("Año :");
		int year1 = sc.nextInt();
		
		if(mes1 == 12 && dia1 == 30) {
			year1++;
			dia1 = 1;
			mes1 = 1;
		} else if (dia1 == 30) {
			dia1 = 1;
			mes1 = mes1 + 1;
		} else {
			dia1++;
		}
		System.out.println(dia1 + "/" + mes1 + "/" + year1);

	}

}
