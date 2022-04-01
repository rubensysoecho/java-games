package battle_game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class duelista {

	Random rand = new Random();
	
	private String nombre;
	private int hp;
	private int fuerza;
	private int destreza;
	private int armadura;
	private ArrayList<String> aciertos = new ArrayList<String>();
	private ArrayList<String> fallos = new ArrayList<String>();
	
	public duelista(String nombre) {
		super();
		this.nombre = nombre;
		this.hp = rand.nextInt(20)+15;
		this.fuerza = rand.nextInt(20)+3;
		this.destreza = rand.nextInt(3);
		this.armadura = rand.nextInt(15)+4;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHp(){
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
		System.out.println("|---"+this.nombre+"---|");
		System.out.println("HP-> "+this.hp);
		System.out.println("Fuerza-> "+this.fuerza);
		System.out.println("Destreza-> "+this.destreza);
		System.out.println("Armadura-> "+this.armadura);
	}
	
	public void turno(Scanner e, duelista duelista)	{
		System.out.println("=========================");
		System.out.println("| A - Estocada	        |");
		System.out.println("| B - Corte             |");
		System.out.println("| C - Defender          |");
		System.out.println("| D - En guardia        |");
		System.out.println("=========================");
		String accion = e.next().toLowerCase();
		
		switch (accion)	{
		case "a":
			daño_estocada(duelista);
		case "b":
			
		case "c":
			
			
		case "d":
			
		}
	}
	
	public void daño_estocada(duelista duelista)	{
		aciertos();
		fallos();
			if (impacta_estocada(duelista)==true)	{
				duelista.hp = fuerza + destreza + rand.nextInt(20);
				aciertos.get(rand.nextInt(3));
			}
			else	{
				fallos.get(rand.nextInt(2));
			}
	}
	
	public boolean impacta_estocada(duelista duelista) {
		int random = rand.nextInt(10);
		if (random > duelista.armadura)	{
			return true;
		}
		else	{
			return false;
		}
	}
	
	public void aciertos() {
		String acierto1 = "La estocada deja sorprendido al enemigo. ";
			aciertos.add(acierto1);
		String acierto2 = "Despues de intercambiar unos cuantos golpes consigues acertar de lleno al enemigo. ";
			aciertos.add(acierto2);
		String acierto3 = "El enemigo parecía estar en una posición ventajosa, pero una buena estocada hace que no baje la guardia y una buena cicatriz al menos. ";
			aciertos.add(acierto3);
	}
	
	public void fallos()	{
		String fallo1 = "Pese a hacer varias estocadas bien ejecutadas, el oponente consigue desviarlas. ";
			fallos.add(fallo1);
		String fallo2 = "Tu destreza con la espada hace que te confies, y la estocada que ejecutas solo le profiere al oponente una pequeña sonrisa";
			fallos.add(fallo2);
	}
	
}
	
