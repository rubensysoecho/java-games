package battle_game;

import java.util.Scanner;

public class main {	
	public static void intro()	{
		System.out.println("<|><|><|><|><|><|><|><|>");
		System.out.println("<|>--BLOOD AND GLORY-<|>");
		System.out.println("<|><|><|><|><|><|><|><|>");
		System.out.println();
		System.out.println("Oponente-> Asi que tu eres el famoso espadachin, ja, no pareces gran cosa");
		System.out.println("Tu-> Bueno, ya sabes lo que dicen, nunca juzgues un libro por su portada, ¡En guardia canalla!");
		System.out.println();
		System.out.println("Juez-> Los dos, a sus puestos, ¡QUE COMIENCE EL COMBATE!\n");			
	}
	public static void batalla(duelista d1, duelista d2) {
		while(d1.isDerrotado()==false && d2.isDerrotado()==false)	{
			d1.atacar(d2);
			if(d1.getHp()<=0)	{
				d1.setDerrotado(true);
			}
			if(d2.getHp()<=0)	{
				d2.setDerrotado(true);
			}
		}

		if (d2.isDerrotado()==true)	{
			System.out.println("============");
			System.out.println("|¡VICTORIA!|");
			System.out.println("============");
			System.out.println("Combate terminado. Felicidades, has ganado el combate y obtenido la gloria.");
		}
		else	{
			System.out.println("===========");
			System.out.println("|¡DERROTA!|");
			System.out.println("===========");
			System.out.println("Combate terminado. Tu cuerpo inerte será un festin para los cuervos.");
		}
	}

	public static void main(String[] args) {
		intro();
		duelista tu = new duelista("Duelista 1", 100, 20, 10, 5, 10);
		duelista oponente = new duelista("Duelista 2", 50, 10, 2, 2, 15);
		batalla(tu, oponente);
	}

}
