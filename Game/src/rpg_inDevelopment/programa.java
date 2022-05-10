package rpg_inDevelopment;

import java.util.Random;
import java.util.Scanner;

public class programa {

	public static final Scanner entrada=new Scanner(System.in);
	public static final Random rand=new Random();
	
	public static void main(String[] args) {		
		inicio();
	}
	
	public static void inicio() {
		System.out.println("|----INICIO JUEGO----|");
		System.out.println("\n�Bienvenido a mi juego de rol personal!\n");

		System.out.println("|::::CREADOR DE PERSONAJES::::|");

		boolean completado=false;
		String cre_nombre=null;

		while(!completado) {
			System.out.print("Cual es tu nombre, aventurero? ");
			cre_nombre=entrada.nextLine();

			System.out.println("\nAsi que te llamas "+cre_nombre+", es eso cierto? \n");
			System.out.print("S/N: ");
			String cre_nombre_r=entrada.nextLine().toLowerCase();

			if (cre_nombre_r.equals("s"))	{
				completado=true;
			}	
		}

		completado=false;
		int cre_edad=0;
		while(!completado)	{
			System.out.println("\nCuantos a�os tienes "+cre_nombre+"?");	
			System.out.println("==========================");

			System.out.println("A--> 19 a�os");
			System.out.println("B--> 40 a�os");
			System.out.println("C--> 70 a�os");
			System.out.print("Opci�n: ");
			String respuesta=entrada.next().toLowerCase();

			switch(respuesta)	{
			case "a":
				cre_edad=19;
				break;
			case "b":
				cre_edad=40;
				break;
			case "c":
				cre_edad=70;
				break;
			default: 
				System.out.println("ERROR-->Opci�n no v�lida");
			}

			System.out.println("\nAsi que tienes "+cre_edad+" a�os, es eso cierto?");

			System.out.print("S/N: ");
			String cre_edad_r=entrada.next().toLowerCase();

			if (cre_edad_r.equals("s"))	{
				completado=true;
			}	
		}
		System.out.println("\n�Bienvenido al mundo "+cre_nombre+"!\n");
		Personaje personaje1=new Personaje(cre_nombre, cre_edad);
		
		System.out.println("--------------------------------"
				+ "\nCapitulo 1: La aventura comienza"
				+ "\n--------------------------------");
		if (personaje1.getEdad()==19)	{
			System.out.println("Tu padre, el herrero, te pide que vayas a junto el carbonero para recoger su pedido de carb�n,\npero, de camino ves un desconocido luchando con un monstruo, \ndespues de intercambiar un par de golpes, llevan el combate a una casa del camino\ntu espiritu aventurero supera a tu miedo y entras en la casa.");
		}
		if (personaje1.getEdad()==40)	{
			System.out.println("Trabajas como herrero, al igual que tu padre, no es un trabajo muy lucrativo\nsobre todo despu�s de que la guerra termin�, afortunadamente tienes los pedidos\njustos para poder vivir de ello. De camino del carbonero te encuentras con un soldado enfrent�ndose a un monstruo, \nparece que tiene problemas, asi que no te lo piensas 2 veces y te lanzas a dentro de la casa.");
		}
	}
	
	
	
		

		
}

	