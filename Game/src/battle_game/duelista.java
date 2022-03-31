package battle_game;

public class duelista {

	private String id;
	private int hp;
	private int fuerza;
	private int destreza;
	private int velocidad;
	private int defensa;
	private boolean derrotado=false;
	
	public duelista(String id, int hp, int fuerza, int destreza, int velocidad, int defensa) {
		super();
		this.id = id;
		this.hp = hp;
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.velocidad = velocidad;
		this.defensa = defensa;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public boolean isDerrotado() {
		return derrotado;
	}
	public void setDerrotado(boolean derrotado) {
		this.derrotado = derrotado;
	}

	public int dañobase() {
		return (fuerza/2)+destreza;
	}
	
	public int daño()	{
		 return dañobase()*((int)Math.sqrt(defensa)*50);
	}
	
	public void dañorecibido(int valor) {
		this.setHp(this.hp-valor);
	}
	
	public void atacar(duelista oponente) {
		oponente.dañorecibido(daño());
		System.out.println("Haces de daño a "+oponente.id+" y se queda a "+oponente.hp+" de vida\n");
	}
}
