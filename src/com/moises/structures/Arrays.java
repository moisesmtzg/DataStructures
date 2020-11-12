package com.moises.structures;

import java.util.Scanner;

/*
 * @Author moises martinez
 * @Date 12-11-20
 * 
 * Clase de ejercicios de arreglos
 */
public class Arrays {

	/*
	 * Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
	 * A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
	 */
	public void problema1 () {
		//llenado arreglo
		int[] arregloNums = llenadoArreglo(10);
		int pos = 0, neg = 0, ceros = 0;;
		
		for(int num : arregloNums) {
			if (num > 0) pos++;
			if (num < 0) neg++;
			if (num == 0) ceros++;
		}
		
		System.out.println("el arreglo tenia " + pos + " numeros positivos");
		System.out.println("el arreglo tenia " + neg + " numeros negativos");
		System.out.println("el arreglo tenia " + ceros + " ceros");
	}

	
	/*
	 * Programa Java que llene un array con 10 números enteros que se leen por teclado.
	 * A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
	 */
	public void problema2 () {
		//llenado de arreglo
		int[] arregloNums = llenadoArreglo(10);
		int pos = 0, sumPos = 0, neg = 0, sumNeg = 0;
		
		//saber si es negativo o positivo y se agrega al que corresponda
		for(int num : arregloNums) {
			if (num > 0) {
				pos++;
				sumPos+=num;
			} else {
				neg++;
				sumNeg+=num;
			}
		}
		
		System.out.println("Valor de la media de los positivos es " + sumPos/pos);
		System.out.println("Valor de la media de los negativos es " + sumNeg/neg);
	}
	

	/*
	 * Programa Java para leer la altura de N personas y calcular la altura media.
	 * Calcular cuántas personas tienen una altura superior a la media y 
	 * cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.
	 */
	public void problema3 () {
		//sacar el valor de N
		System.out.println("Escribe cuantas personas seran");
		Scanner scanner = new Scanner(System.in);
		int numPersonas = scanner.nextInt();
		
		double sumTotal = 0;
		int personasArribaMedia = 0;
		int personasAbajoMedia = 0;
		
		double[] alturaPersonas = llenadoPersonas(numPersonas);
		
		for(double alturaPersona : alturaPersonas) {
			sumTotal +=alturaPersona;
		}
		
		double mediaPersonas = sumTotal/numPersonas;
		
		for(double alturaPersona : alturaPersonas) {
			if(alturaPersona > mediaPersonas) { 
				personasArribaMedia+=1;
			} else {
				personasAbajoMedia+=1;
			}
		}
		
		System.out.println("Las personas arriba de la media son "  + personasArribaMedia);
		System.out.println("Las personas abajo de la media son "  + personasAbajoMedia);
		scanner.close();
	}


	/*
	 *  Leer el nombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del empleado que más gana.
	 */
	public void problema4 () {
		Scanner scanner = new Scanner(System.in);
		String[] nombreEmpleados = new String[20];
		double[] sueldoEmpleados = new double[20];
		int apuntadorMax = 0;
		//se asumira que ambos arreglos la posN representa al empleadoN
		for(int i = 0; i < 20; i++) {
			System.out.println("Ingresa el nombre del empleado "+ (i+1));
			nombreEmpleados[i] = scanner.next();
			System.out.println("Ingresa el salario del empleado "+ (i+1));
			sueldoEmpleados[i] = scanner.nextDouble();
			if(sueldoEmpleados[i] > sueldoEmpleados[apuntadorMax]) apuntadorMax = i;
		}
		System.out.println("el empleado " + nombreEmpleados[apuntadorMax] + " con el sueldo : " + sueldoEmpleados[apuntadorMax]+ " es el que gana mas");
	}

	/*
	 * Llenado de arreglos mediante Scanner
	 * 
	 * @tamanoArreglo es un int que representa el # de elementos que tendra el arreglo 
	 */
	private int[] llenadoArreglo (int tamanoArreglo) {
		System.out.println("Ingresa los elementos");
		Scanner scanner = new Scanner(System.in);
		int[] arregloNums = new int[tamanoArreglo];
		//llenado de arreglos
		for(int i = 0; i < arregloNums.length; i++) {
			System.out.println("Ingresa el elementos " + (i+1));
			arregloNums[i] = scanner.nextInt();
		}
		scanner.close();
		return arregloNums;
	}
	

	/*
	 * Llenado de arreglos mediante Scanner
	 * 
	 * @tamanoArreglo es un double que representa el # de elementos que tendra el arreglo 
	 */
	private double[] llenadoPersonas (int tamanoArreglo) {
		double[] arregloPersonas = new double[tamanoArreglo];
		
		System.out.println("Ingresa la altura de las personas");
		Scanner scanner = new Scanner(System.in);
		
		//llenado de arreglos
		for(int i = 0; i < arregloPersonas.length; i++) {
			System.out.println("Ingresa la altura de la persona " + (i+1));
			arregloPersonas[i] = scanner.nextDouble();
		}
		
		scanner.close();
		return arregloPersonas;
	}

}
