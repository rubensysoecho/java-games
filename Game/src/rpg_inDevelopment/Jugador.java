package rpg_inDevelopment;

public class Jugador {
	
	private int hp=5;
	private String arma="Desarmado";
	
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
	
	@Override
	public String toString() {
		return "Jugador [hp=" + hp + ", arma=" + arma + "]";
	}
}
