package battle_game;

import java.util.Scanner;

public class main {	
	public static void main(String[] args) {
		intro();
		duelista tu = new duelista("Percival");
		duelista oponente = new duelista("Lancelot");
		batalla batalla1 = new batalla(tu, oponente);

		while (batalla1.isAcabado() == false) {
			tu.hp();
			tu.turno(entrada, oponente);
			oponente.hp();
			if (oponente.isDerrotado() == true)	{
				System.out.println("============");
				System.out.println("|¡VICTORIA!|");
				System.out.println("============");
				System.out.println("Combate terminado. Felicidades, has ganado el combate y obtenido la gloria.");
				batalla1.setAcabado(true);
				break;
			}
			oponente.turno(entrada, tu);
			if (tu.isDerrotado() == true) {
				System.out.println("===========");
				System.out.println("|¡DERROTA!|");
				System.out.println("===========");
				System.out.println("Combate terminado. Tu cuerpo inerte será un festin para los cuervos.");
				batalla1.setAcabado(true);
				break;
			}
		}
	}

	public final static Scanner entrada = new Scanner(System.in);

	public static void intro()	{
		System.out.println("<|><|><|><|><|><|><|><|>");
		System.out.println("<|>--BLOOD AND GLORY-<|>");
		System.out.println("<|><|><|><|><|><|><|><|>");
		System.out.println();
		System.out.println("Oponente-> Asi que tu eres el famoso espadachin, ja, no pareces gran cosa");
		System.out.println("Tu-> Bueno, ya sabes lo que dicen, nunca juzgues un libro por su portada, ¡En guardia canalla!");
		System.out.println();
		System.out.println("Juez-> Los dos, a vuestros puestos, ¡QUE COMIENCE EL COMBATE!");			
	}	
}
