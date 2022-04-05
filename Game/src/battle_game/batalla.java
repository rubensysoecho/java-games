package battle_game;

public class batalla {

	private duelista duelista1;
	private duelista duelista2;
	private boolean esAcabado;

	public batalla(duelista duelista1, duelista duelista2) {
		super();
		this.duelista1 = duelista1;
		this.duelista2 = duelista2;
	}

	public boolean getEsAcabado() {
		return esAcabado;
	}

	public void setEsAcabado(boolean esAcabado) {
		this.esAcabado = esAcabado;
	}

}
