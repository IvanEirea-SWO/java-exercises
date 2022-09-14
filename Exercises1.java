import java.util.*;
import utils.*;

public class Exercises1 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.- Decalara e inicializa dos variables. Uno de tipo cadena de texto para un nombre y otra
		 * de tipo entero para una edad. 
		 * Crea una salida por consola con el texto "Los datos del empleado son " concatenado con el valor de dichas variables
		 */
		
		String name = "Ivan";
		int age = 28;
		
		System.out.println("Employee data: age " + age + ", name " + name);
		
		/*
		 * 2.- Crea una etructura condicional que evalúe si una edad introducida por consola es mayor o igual a 18, si es así, 
		 * imprimir por la consola: "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a number:");
		age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println(">18");
		} else {
			System.out.println("<18");
		}
		
		/*
		 * 3.- Crea un programa en java que pida dos datos por la consola al usuario: 
		 * nombre e email. Imprime el valor de estás variables por consola.
		 */
		
		System.out.println("Introduce yout name and then your email: ");
		String[] nameMail = new String [2]; 
		sc.nextLine();
		for (int i = 0; i < 2; i++)   
		{  	
			nameMail[i] = sc.nextLine();  
		}  
		for (String s : nameMail) {
			System.out.println(s);
		} 
		
		/*
		 * 4.- Crea un programa en java que pida introducir un número por consola. 
		 * El programa pedirá siempre un número mientras que éste no sea el 5 y cuando así sea imprimir "Fin del programa"
		 * terminando asi dicho programa
		 */
		
		System.out.println("Introduce a number: ");
		int numberInput = sc.nextInt();
		
		while (numberInput != 5) {
			System.out.println("Introduce another number");
			numberInput = sc.nextInt();
		}
		
		System.out.println("End of the program");
		
		/*
		 * 5.- Crea un programa que pida un número por consola entre el 1 y el 50.
		 *  
		 * Si el número está fuera de este rango imprimir "El número no es válido" y seguir pidiendo números hasta que 
		 * el número esté en ese rango. 
		 * 
		 * Si el número es válido crea la lógica para verificar si dicho número es par o impar. 
		 * Si es par imprimir por consola "Número par" y, si es impar, "Número impar".
		 * 
		 * La lógica para averiguar si el número es par o impar debe de estar fuera del archivo que contiene 
		 * el método main en una carpeta llamada "utils" y en una clase llamada EjercicioCinco 
		 * 
		 * Además esta lógica debe estar ejecutada a través de un método.
		 */
		
		System.out.println("Introduce a number between 1 and 50");
		numberInput = sc.nextInt();
		
		while (numberInput < 1 || numberInput > 50) {
			System.out.println("Introduce another number");
			numberInput = sc.nextInt();
		}
		
		EjercicioCinco.isEven(numberInput); 
		
		/*
		 * 6.- Crea un array de 5 elementos cuyos valores sean nombres de personas. 
		 * Imprime los elementos del array a través de un bucle for
		 */
		
		String[] peopleNames = {"Emma", "Ivan", "Zoilo", "Cesar", "Eli"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println(peopleNames[i]);
		}
		
		/*
		 * 7.- Repite el ejercicio anterior pero realiza la iteración e impresión de 
		 * los elementos del array a través de un bucel for mejorado.
		 */
		
		for (String s : peopleNames) {
			System.out.println(s);
		}
		
	}

}
