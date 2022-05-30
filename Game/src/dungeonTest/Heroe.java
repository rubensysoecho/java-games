package dungeonTest;

import java.util.ArrayList;

public class Heroe extends Personaje{

	private String nombre;
	private static ArrayList<Integer> inventario = new ArrayList<Integer>();
	
	public Heroe(Raza raza, boolean vivo, int hp_now, int hp_max, int mp_now, int mp_max, int str, int spd, int intel,
			String nombre) {
		super(raza, vivo, hp_now, hp_max, mp_now, mp_max, str, spd, intel);
		this.nombre = nombre;
	}
}
