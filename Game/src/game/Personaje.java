package game;

public class Personaje extends Jugador{

	private String nombre;
	private int edad;
	private int vidas=3;
	
	public Personaje(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		switch(edad)	{
		case 19: 
			super.setFuerza(super.getFuerza()+2);
			super.setDestreza(super.getDestreza()+3);
			super.setVelocidad(super.getVelocidad()+2);;
			break;
		case 40:
			super.setFuerza(super.getFuerza()-1);
			super.setDestreza(super.getDestreza()+4);
			super.setVelocidad(super.getVelocidad()-1);
			break;
		case 70:
			super.setFuerza(super.getFuerza()-2);
			super.setDestreza(super.getDestreza()-2);
			super.setVelocidad(super.getVelocidad()-4);
			break;
		}
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
		return "|---"+this.nombre.toUpperCase()+"---| \nEdad-> "+this.edad+"\nVidas-> "+this.vidas+"\nHP->"+super.getHp()+"\nFuerza->"+super.getFuerza()+"\nDestreza->"+super.getDestreza()+"\nVelocidad->"+super.getVelocidad();
	}

	
	
	

	
	
}