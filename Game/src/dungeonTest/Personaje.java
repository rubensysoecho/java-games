package dungeonTest;

import java.util.ArrayList;

public class Personaje {

	private Raza raza;
	private boolean vivo = true;
	
	private int hp_now;
	private int hp_max;
	private int mp_now;
	private int mp_max;
	private int str;
	private int spd;
	private int intel;
	
	private static ArrayList<Integer> inventario = new ArrayList<Integer>();
	
	public Personaje(Raza raza, boolean vivo, int hp_now, int hp_max, int mp_now, int mp_max, int str, int spd,
			int intel) {
		super();
		this.raza = raza;
		this.vivo = vivo;
		this.hp_now = hp_now;
		this.hp_max = hp_max;
		this.mp_now = mp_now;
		this.mp_max = mp_max;
		this.str = str;
		this.spd = spd;
		this.intel = intel;
	}
	
	public void ver_inventario() {
		System.out.println("Inventario:");
		for (Integer integer : inventario) {
			
		}
	}
}
