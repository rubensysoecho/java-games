package rpg_inDevelopment;

import java.util.Random;

public class Personaje extends Jugador{

	Random rand = new Random();

	private String nombre;
	private int edad;
	private int vidas=3;

	public Personaje() {
		super();
		super.setMaxHp(20);
		super.setHp(super.getMaxHp());
		super.setFuerza(rand.nextInt(20));
		super.setDestreza(rand.nextInt(5));
		super.setDefensa(rand.nextInt(10));
	}

	public Personaje(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
		if (edad==19) {
			super.setFuerza(super.getFuerza()+3);
			super.setDestreza(super.getDestreza()+1);
			super.setDefensa(super.getDefensa()-1);
		}
		if	(edad==40)	{
			super.setFuerza(super.getFuerza()+4);
			super.setDestreza(super.getDestreza()+2);
			super.setDefensa(super.getDefensa()-3);
		}
		if	(edad==70)	{
			super.setFuerza(super.getFuerza()-5);
			super.setDestreza(super.getDestreza()-1);
			super.setDefensa(super.getDefensa()-4);
		}
		
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void character_menu()	{
		System.out.println("HP-> "+super.getHp());
		System.out.println("Arma equipada-> "+super.getArma());
	}

	@Override
	public String toString() {
		return "|---"+this.nombre.toUpperCase()+"---| \nVidas-> "+this.vidas+"\nHP-> "+super.getHp()+"\nEdad->"+this.edad+"\nArma equipada->"+super.getArma();
	}	
}