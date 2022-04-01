package battle_game;

public class batalla {
	
	private duelista duelista1;
	private duelista duelista2;
	private boolean acabado=false;
	
	public batalla(duelista duelista1, duelista duelista2) {
		super();
		this.duelista1 = duelista1;
		this.duelista2 = duelista2;
	}
	
	public boolean isAcabado() {
		return acabado;
	}
	public void setAcabado(boolean acabado) {
		this.acabado = acabado;
	}
	
	
	
}
