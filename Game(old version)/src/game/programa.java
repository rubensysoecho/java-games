package game;

import java.util.Scanner;

public class programa {

	public static final Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {	
		Personaje main_character = new Personaje();
		
		inicio(main_character);
	}
	
	//------------------------------------//
	
	public static void inicio(Personaje personaje) {
		System.out.println("|----INICIO JUEGO----|");
		System.out.println("\n¡Bienvenido a mi juego de rol personal!\n");
		System.out.println("|::::CREADOR DE PERSONAJES::::|");

		//NOMBRE//
		boolean completado=false;
		while(!completado) {
			System.out.print("Cual es tu nombre, aventurero? ");
			personaje.setNombre(entrada.next());

			System.out.println("\nAsi que te llamas "+personaje.getNombre()+", es eso cierto? ");
			System.out.print("S/N: ");
			String cre_nombre_r=entrada.next().toLowerCase();

			if (cre_nombre_r.equals("s"))	{
				completado=true;
			}	
		}
		
		//EDAD//
		completado=false;
		while(!completado)	{
			System.out.println("\nCuantos años tienes "+personaje.getNombre()+"?");	
			System.out.println("==========================");

			System.out.println("A--> 19 años");
			System.out.println("B--> 40 años");
			System.out.println("C--> 70 años");
			System.out.println("==========================");
			String respuesta=entrada.next().toLowerCase();

			switch(respuesta)	{
			case "a":
				personaje.setEdad(19);
				break;
			case "b":
				personaje.setEdad(40);
				break;
			case "c":
				personaje.setEdad(70);
				break;
			default: 
				System.out.println("ERROR-->Opción no válida");
			}

			System.out.println("\nAsi que tienes "+personaje.getEdad()+" años, es eso cierto?");
			System.out.print("S/N: ");
			String cre_edad_r=entrada.next().toLowerCase();

			if (cre_edad_r.equals("s"))	{
				completado=true;
			}	
		}
		System.out.println("\n¡Bienvenido al mundo "+personaje.getNombre()+"!\n");
		personaje.character_stats();
	}

	public static void tutorial(Personaje personaje) {		
		System.out.println("--------------------------------"
				+ "\nCapitulo 1: La aventura comienza"
				+ "\n--------------------------------");
		if (personaje.getEdad()==19)	{
			System.out.println("Tu padre, el herrero, te pide que vayas a junto el carbonero para recoger su pedido de carbón,\npero, de camino ves un desconocido luchando con un monstruo, \ndespues de intercambiar un par de golpes, llevan el combate a una casa del camino.\nQue haces?\n---------");
			System.out.println("A - Entras en la casa");
			System.out.println("B - Corres de vuelta a casa");
			System.out.println("===============================");
			String res_tut_1=entrada.next();	
		}
		if (personaje.getEdad()==40)	{
			System.out.println("Trabajas como herrero, al igual que tu padre, no es un trabajo muy lucrativo\nsobre todo después de la guerra, afortunadamente tienes los pedidos\njustos para poder vivir de ello.\n De camino del carbonero te encuentras con un soldado enfrentándose a un monstruo, \nparece que tiene problemas, asi que no te lo piensas 2 veces y te lanzas a dentro de la casa.");
		}
		if (personaje.getEdad()==70)	{
			System.out.println("EN DESARROLLO");
		}
	}
			
}

	