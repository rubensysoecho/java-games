package rpg_inDevelopment;

public abstract class Jugador {
	
	private int hp=0;
	private int maxHp=10;
	private int fuerza=0;
	private int destreza=0;
	private int defensa=0;
	private String arma="Desarmado";
	
	public int daño()	{
		return fuerza/2+destreza;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
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
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void character_stats() {
		System.out.println("Max HP-> "+this.maxHp+
				"\nFuerza-> "+this.fuerza+
				"\nDestreza-> "+this.destreza+
				"\nDefensa-> "+this.defensa);
	}
	
	@Override
	public String toString() {
		return "Jugador [hp=" + hp + ", arma=" + arma + "]";
	}
}
