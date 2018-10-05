package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {

	//Pedir al usuario día mes y año comprobar que la fecha es correcta
	//Incluido bisiestos
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fecha % 4 == 0 && fecha % 100 != 0 || fecha % 400 == 0
		

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

	}

}
