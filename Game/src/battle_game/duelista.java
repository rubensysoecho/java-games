package battle_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class duelista {

	Random rand = new Random();

	private String nombre;
	private int hp;
	private int max_hp;
	private int fuerza;
	private int destreza;
	private int armadura;
	private boolean derrotado;
	private boolean defendido;
	private static ArrayList<String> aciertos_estocada, fallos_estocada, aciertos_corte, fallos_corte, defensas;

	static {
		aciertos_estocada = new ArrayList<String>(Arrays.asList("La estocada deja sorprendido al enemigo. ",
				"Despues de intercambiar unos cuantos golpes consigues acertar de lleno al enemigo. ",
				"El enemigo parecía estar en una posición ventajosa, pero una buena estocada hace que no baje la guardia y una buena cicatriz al menos. "));
		fallos_estocada = new ArrayList<String>(Arrays.asList(
				"Pese a hacer varias estocadas bien ejecutadas, el oponente consigue desviarlas. ",
				"Tu destreza con la espada hace que te confies, y la estocada que ejecutas solo le profiere al oponente una pequeña sonrisa"));
		aciertos_corte = new ArrayList<String>(Arrays.asList("Das una serie de ofensivas bien ejecutadas, lo que acaba por mermar la guardia del rival y te permite propiciarle un gran corte. ",
				"El enemigo está intentando invadir tu espacio, pero sabes medir la distancia de tu ataque y le haces un corte vertical perfecto mientras retrocedes. ",
				"Recuerdas movimientos escritos en tus libros de caballería preferidos, ves la oportunidad de realizarlos y haces una serie de cortes amplios para despues rematarlo con una pirueta y un corte. "));
		fallos_corte = new ArrayList<String>(Arrays.asList("Pese a creer que estabas a una buena distancia para dar un corte, calculas mal y no le das a nada. ",
				"Intercambiais una serie de ataques en las que vuestrar espadas hacen contacto como en los duelos fantásticos, pero su guardia es excelente y no tienes oportunidad de atacar. "));
		defensas = new ArrayList<String>(Arrays.asList("Alzas tu espada en la pose de pflug, tu defensa es inexpugnable. ",
				"Tu espada es como un muro de piedra, nada podrá atravesarlo. ",
				"Adoptas una pose defensiva que te permite desviar todos los ataques del rival. "));
	}

	public duelista(String nombre) {
		super();
		this.nombre = nombre;
		this.hp = rand.nextInt(100) + 30;
		this.max_hp = hp;
		this.fuerza = rand.nextInt(25) + 3;
		this.destreza = rand.nextInt(4);
		this.armadura = rand.nextInt(15) + 5;
	}

	public int getMax_hp() {
		return max_hp;
	}

	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
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
		if (hp<=0) {
			this.derrotado = true;
		}
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

	public boolean isDerrotado() {
		return derrotado;
	}

	public void setVencedor(boolean derrotado) {
		this.derrotado = derrotado;
	}

	public boolean isDefendido() {
		return defendido;
	}

	public void setDefendido(boolean defendido) {
		this.defendido = defendido;
	}

	public void stats() {
		System.out.println("\n|---" + this.nombre + "---|");
		System.out.println("HP-> " + this.hp);
		System.out.println("Fuerza-> " + this.fuerza);
		System.out.println("Destreza-> " + this.destreza);
		System.out.println("Armadura-> " + this.armadura);
	}
	
	public void hp()	{
		System.out.println("\n"+this.nombre+"--> "+this.hp+"/"+this.max_hp+" HP");
	}
	

	public void turno(Scanner e, duelista duelista) {
		System.out.println("\n#######|"+this.nombre+"|########");
		System.out.println("=========================");
		System.out.println("| A - Estocada	        |");
		System.out.println("| B - Corte             |");
		System.out.println("| C - Defender          |");
		System.out.println("| D - En guardia        |");
		System.out.println("=========================");
		String accion = e.next().toLowerCase();

		switch (accion) {
		case "a":
			daño_estocada(duelista);
			break;
		case "b":
			daño_corte(duelista);
			break;
		case "c":
			defensa();
			break;
		case "d":
			guardia();
		}
	}

	public void daño_estocada(duelista duelista) {
		if (impacta_estocada(duelista) == true) {
			if (duelista.isDefendido() == true) {
				System.out.println("!El oponente se defiende de tu estocada!");
			}
			else	{
				int daño = duelista.getHp();
				duelista.setHp(duelista.getHp()-(fuerza + destreza + rand.nextInt(20)));
				daño = daño - duelista.getHp();
				System.out.println(aciertos_estocada.get(rand.nextInt(aciertos_estocada.size()))+"\n!!IMPACTO!! Haces "+daño+" de daño");
			}
		} else {
			System.out.println(fallos_estocada.get(rand.nextInt(fallos_estocada.size())));
			System.out.println("!!FALLO!!");
		}
	}

	public boolean impacta_estocada(duelista duelista) {
		return rand.nextInt(20)+15 > duelista.armadura;
	}

	public void daño_corte(duelista duelista) {
		if (impacta_corte(duelista) == true) {
			if (duelista.isDefendido() == true) {
				System.out.println("!El oponente se defiende de tu corte!");
			}
			else	{
				int daño = duelista.getHp();
				duelista.setHp(duelista.getHp()-(fuerza + destreza + rand.nextInt(10)));
				daño = daño - duelista.getHp();
				System.out.println(aciertos_corte.get(rand.nextInt(aciertos_corte.size()))+"\n!!IMPACTO!! Haces "+daño+" de daño");
			}
		} else {
			System.out.println(fallos_corte.get(rand.nextInt(fallos_corte.size())));
			System.out.println("!!FALLO!!");
		}
	}
	
	public boolean impacta_corte(duelista duelista)	{
		return rand.nextInt(30)+20 > duelista.armadura;
	}

	public void defensa() {
		System.out.println(defensas.get(rand.nextInt(defensas.size())));
		this.setDefendido(true);
	}
	public void guardia()	{
		
	}
}
