package rpg_inDevelopment;

import java.util.Scanner;

public class programa {

	public static final Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {	
		Personaje main_character = new Personaje();
		menu_principal();
		creacion_personaje(main_character);
		tutorial(main_character);;
	}

	public static void menu_principal() {
		System.out.println("|----ADVENTURES IN KATARNIA----|");
		System.out.println("\n�Bienvenido a mi juego de rol personal!\n");
	}
	//------------------------------------//

	public static void creacion_personaje(Personaje personaje) {
		System.out.println("|::::CREADOR DE PERSONAJES::::|");

		//NOMBRE//
		boolean completado=false;
		while(!completado) {
			System.out.print("\n�Cual es tu nombre, aventurero? ");
			personaje.setNombre(entrada.next());

			System.out.println("\nAsi que te llamas "+personaje.getNombre()+", �es eso cierto? ");
			System.out.print("S/N: ");
			String cre_nombre_r=entrada.next().toLowerCase();

			if (cre_nombre_r.equals("s"))	{
				completado=true;
			}	
		}

		//EDAD//
		completado=false;
		while(!completado)	{
			System.out.println("\nCuantos a�os tienes "+personaje.getNombre()+"?");	
			System.out.println("==========================");

			System.out.println("A--> 19 a�os");
			System.out.println("B--> 40 a�os");
			System.out.println("C--> 70 a�os");
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
				System.out.println("ERROR-->Opci�n no v�lida");
			}

			System.out.println("\nAsi que tienes "+personaje.getEdad()+" a�os, �verdad?");
			System.out.print("S/N: ");
			String cre_edad_r=entrada.next().toLowerCase();

			if (cre_edad_r.equals("s"))	{
				completado=true;
			}	
		}
		System.out.println("\n�Bienvenido al mundo "+personaje.getNombre()+"!\n");
	}

	public static void tutorial(Personaje personaje) {		
		System.out.println("--------------------------------"
				+ "\nCapitulo 1: La aventura comienza"
				+ "\n--------------------------------\n");
		
		if (personaje.getEdad()==19)	{
			System.out.println("Tu padre, el herrero, te pide que vayas a junto el carbonero para recoger su pedido de carb�n,\npero, de camino ves un desconocido luchando con un monstruo, \ndespues de intercambiar un par de golpes, llevan el combate a una casa del camino.\n---------");
			System.out.println("A - Te llenas de valent�a y entras en la casa");
			System.out.println("B - El miedo te supera y huyes");
			System.out.println("===============================");
			String res_tut_19_1=entrada.next().toLowerCase();	

			if (res_tut_19_1.equals("a"))	{
				System.out.println("\nNada mas entrar escuchas el combate de forma un poco lejana, e intuyes que se est�n enfrentando en la puerta de en frente,\npero en el pasillo hay 2 puertas m�s, a la izquierda una puerta destrozada y a la derecha una puerta ruinosa, pero parece funcional.\n---------");	
				System.out.println("A - Siempre has querido tener aventuras, entras en la casa");
				System.out.println("B - Recuerdas que tienes mucho trabajo en la forja y huyes pavorosamente");
				System.out.println("===============================");
				String res_tut_19_2=entrada.next().toLowerCase();
			}
			if (res_tut_19_1.equals("b"))	{
				System.out.println("\nVuelves con tu familia y le cuentas lo ocurrido, vives una larga pero aburrida vida. MORS VENIT");
			}
		}
		
		if (personaje.getEdad()==40)	{
			System.out.println("Trabajas como herrero, al igual que tu padre, no es un trabajo muy lucrativo\nsobre todo despu�s de la guerra, afortunadamente tienes los pedidos\njustos para poder vivir de ello.\nDe camino del carbonero te encuentras con un soldado enfrent�ndose a un monstruo, \nparece que tiene problemas.\n---------");
			System.out.println("A - Siempre has querido tener aventuras, entras en la casa");
			System.out.println("B - Recuerdas que tienes mucho trabajo en la forja y huyes pavorosamente");
			System.out.println("===============================");
			String res_tut_40_1=entrada.next().toLowerCase();

			if (res_tut_40_1.equals("a"))	{
				System.out.println("40 A");
			}
			if (res_tut_40_1.equals("b"))	{
				System.out.println("40 B");
			}
		}
		if (personaje.getEdad()==70)	{
			System.out.println("EN DESARROLLO");
		}
	}
}