package battle_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class duelista {

	Random rand = new Random();

	private String nombre;
	private int hp;
	private int fuerza;
	private int destreza;
	private int armadura;
	private static ArrayList<String> aciertos, fallos;

	static {
		aciertos = new ArrayList<String>(Arrays.asList("La estocada deja sorprendido al enemigo. ",
				"Despues de intercambiar unos cuantos golpes consigues acertar de lleno al enemigo. ",
				"El enemigo parec�a estar en una posici�n ventajosa, pero una buena estocada hace que no baje la guardia y una buena cicatriz al menos. "));
		fallos = new ArrayList<String>(Arrays.asList(
				"Pese a hacer varias estocadas bien ejecutadas, el oponente consigue desviarlas. ",
				"Tu destreza con la espada hace que te confies, y la estocada que ejecutas solo le profiere al oponente una peque�a sonrisa"));
	}

	public duelista(String nombre) {
		super();
		this.nombre = nombre;
		this.hp = rand.nextInt(20) + 15;
		this.fuerza = rand.nextInt(20) + 3;
		this.destreza = rand.nextInt(3);
		this.armadura = rand.nextInt(15) + 4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public void stats() {
		System.out.println("|---" + this.nombre + "---|");
		System.out.println("HP-> " + this.hp);
		System.out.println("Fuerza-> " + this.fuerza);
		System.out.println("Destreza-> " + this.destreza);
		System.out.println("Armadura-> " + this.armadura);
	}

	public void turno(Scanner e, duelista duelista) {
		System.out.println("=========================");
		System.out.println("| A - Estocada	        |");
		System.out.println("| B - Corte             |");
		System.out.println("| C - Defender          |");
		System.out.println("| D - En guardia        |");
		System.out.println("=========================");
		String accion = e.next().toLowerCase();

		switch (accion) {
		case "a":
			da�o_estocada(duelista);
		case "b":

		case "c":

		case "d":

		}
	}

	public void da�o_estocada(duelista duelista) {
		if (impacta_estocada(duelista) == true) {
			duelista.hp = fuerza + destreza + rand.nextInt(20);
			aciertos.get(rand.nextInt(3));
		} else {
			fallos.get(rand.nextInt(2));
		}
	}

	public boolean impacta_estocada(duelista duelista) {
		return rand.nextInt(10) > duelista.armadura;
	}

}
