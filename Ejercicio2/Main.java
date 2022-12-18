package Ejercicio2;

import java.util.Scanner;

import Ejercicio1.Clientes;

public class Main {

	public static void main(String[] args) {
		
		int opcion;
		Scanner datos = new Scanner(System.in);
		
		
		do {
			
			System.out.println("\nElija una opcion: \n" + "\n1- Ingresar al parking \n" + "2- Retirar del parking \n" + "3- Consultar estado del parking \n" + "4- Salir \n");
			opcion = datos.nextInt();
					
				switch (opcion) {
			
			case 1:
				Vehiculo.ingresarVehiculo(null, null, null, null, 0);
				break;
				
			case 2:
				Vehiculo.retirarVehiculo();
				break;
				
			case 3:
				Vehiculo.consultarParking();
				break;				
				}
								
				} while (opcion !=4);

	}

}
