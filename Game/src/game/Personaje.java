package game;

public class Personaje extends Jugador{

	private String nombre;
	private int edad;
	private int vidas=3;
	
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
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	
	
	@Override
	public String toString() {
		return "|---"+this.nombre.toUpperCase()+"---| \nEdad-> "+this.edad+"\nVidas-> "+this.vidas+"\nHP->"+super.getHp();
	}

	
	
	

	
	
}
