package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;



public class Vehiculo {

	public static ArrayList<Vehiculo> parking = new ArrayList<>();
	
	
	private String placa;
	private String marca;
	private String nombre;
	private String apellido;
	private int numero;
	
	
	public Vehiculo(String placa, String marca, String nombre, String apellido, int numero) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
public static String ingresarVehiculo (String placa, String marca, String nombre, String apellido, int numero) {
        
		Scanner datos = new Scanner (System.in);
		System.out.println("Ingrese placa del vehiculo: ");
        placa = datos.nextLine();
        System.out.println("Ingrese marca del vehiculo: ");
        marca = datos.nextLine();
        System.out.println("Ingrese nombre del cliente: ");
        nombre = datos.nextLine();
        System.out.println("Ingrese apellido del cliente: ");
        apellido = datos.nextLine();
        System.out.println("Ingrese numero del cliente: ");
        numero = datos.nextInt();
        
        
        
        if (parking.size() <5) {
            Vehiculo vehiculo = new Vehiculo(placa, marca, nombre, apellido, numero);
            parking.add(vehiculo);
            System.out.println ( "Se ingresó el vehiculo correctamente");
            return null;
        } else {
        	System.out.println ("Lo sentimos, nuestras plazas estas completas.");
        	return null;       				             
    }
}

public static String retirarVehiculo () {
	
	Scanner datos = new Scanner (System.in);
	String placa2;
	System.out.println("Ingrese placa del vehiculo");
	placa2=datos.nextLine();
	Vehiculo n;

	
	for (int i = 0; i < parking.size(); i++) {
		
		 n= parking.get(i);
		int opcion;
		
		   if (parking == null) {
			System.out.println ("Vehiculo no encontrado");
		}
		 
		   if (placa2.equals(n.getPlaca())) {
			
			      System.out.println("Placa: " + n.placa + " Marca:  " + n.marca + "." + " ¿Desea retirar este Vehiculo? \n"
	        		+" 1- Si \n"				
					+ "2- No");
			      opcion=datos.nextInt();
			  
			       if (opcion == 1) {
				     parking.remove(i);
				     System.out.println("Vehiculo retirado");	
              } 
		    }
	}
	return null;
	
   }

public static String consultarParking () {
	
	Scanner datos = new Scanner (System.in);
	String placa2;
	System.out.println("Ingrese placa del vehiculo");
	placa2=datos.nextLine();
	Vehiculo n;
	
	for (int i = 0; i < parking.size(); i++) {
		
		 n= parking.get(i);
		int opcion;
		
		      if (placa2.equals(n.getPlaca())) {
			
			      System.out.println("El vehiculo se encuentra en el parking"); }

		           else System.out.println("El vehiculo no se encuentra en el parking");
              

	}
	return null;



}
}
	
	

