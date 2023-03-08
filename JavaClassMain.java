package java_proyect_package;

import java.util.Scanner; // Necesario para utilizar la entrada de teclado del system.

public class JavaClassMain {

	public static void main(String[] args) {
		//Ejercicio 1-a
		//a
		System.out.println("INICIO -> EJERCICIO 1-a");
		int numeroInicio = 5;
		int numeroFinal = 14;
		
		while(numeroInicio <= numeroFinal) {
			System.out.print("\t" + numeroInicio);
			numeroInicio++;
		}
		System.out.println(" \n FIN DE EJERCICIO 1-a");
		System.out.println("---------------------------------------------------------------------------------------");
		
		//Ejercicio 1-b
		
		System.out.println("INICIO -> EJERCICIO 1-b");
		numeroInicio = 5;
		
		while(numeroInicio <= numeroFinal) {
			if(numeroInicio %2 == 0) {
				System.out.print("\t" + numeroInicio);
			}
			numeroInicio++;
		}
		System.out.println(" \n FIN DE EJERCICIO 1-b");
		System.out.println("---------------------------------------------------------------------------------------");

		//Ejercicio 1-c
		
		System.out.println("INICIO -> EJERCICIO 1-c");
		
		Scanner leer = new Scanner(System.in);
		numeroInicio = 5;
		
		int eleccionDelUsuario = 0;
		
		do {
			System.out.println("1 --> Mostrar numeros pares entre: " + numeroInicio + " y " + numeroFinal + ".");
			System.out.println("2 --> Mostrar numeros impares entre: " + numeroInicio + " y " + numeroFinal + ".");
			 eleccionDelUsuario = leer.nextInt();
		}
		while(eleccionDelUsuario != 1 && eleccionDelUsuario != 2);
		
		
		
		if(eleccionDelUsuario == 1) {
			System.out.println("Imprimiendo numeros pares:");
			while(numeroInicio <= numeroFinal) {
				if(numeroInicio %2 == 0) {
					System.out.print("\t" + numeroInicio);
				}
				numeroInicio++;
			}
		}
		
		if(eleccionDelUsuario == 2) {
			System.out.println("Imprimiendo numeros impares:");
			while(numeroInicio <= numeroFinal) {
				if(numeroInicio %2 != 0) {
					System.out.print("\t" + numeroInicio);
				}
				numeroInicio++;
			}
		}

		
		System.out.println(" \n FIN DE EJERCICIO 1-c");
		System.out.println("---------------------------------------------------------------------------------------");
		
		//Ejercicio 1-d
				//a
				System.out.println("INICIO -> EJERCICIO 1-d");
				
				for(numeroInicio = 5; numeroFinal > numeroInicio; numeroFinal --) {
					if(numeroFinal %2 == 0) {
						System.out.print("\t" + numeroFinal);
					}
				}
				
				System.out.println(" \n FIN DE EJERCICIO 1-d");
				System.out.println("---------------------------------------------------------------------------------------");
	}

}
