package PrincipalCafeteria;

public class Cafe {

	private Cafeteria cafeteria;
	private int gramosCafe;
	private int mililitrosAgua;
	private Tama�o tama�oCafe;
	private IngredientesCafe ingrediente;

	public int getGramosCafe() {
		return this.gramosCafe;
	}

	/**
	 * 
	 * @param gramosCafe
	 */
	public void setGramosCafe(int gramosCafe) {
		this.gramosCafe = gramosCafe;
	}

	public int getMililitrosAgua() {
		return this.mililitrosAgua;
	}

	/**
	 * 
	 * @param mililitrosAgua
	 */
	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public Tama�o getTama�oCafe() {
		return this.tama�oCafe;
	}

	/**
	 * 
	 * @param tama�oCafe
	 */
	public void setTama�oCafe(Tama�o tama�oCafe) {
		this.tama�oCafe = tama�oCafe;
	}

	public IngredientesCafe getIngrediente() {
		return this.ingrediente;
	}

	/**
	 * 
	 * @param ingrediente
	 */
	public void setIngrediente(IngredientesCafe ingrediente) {
		this.ingrediente = ingrediente;
	}

	public boolean modificarCafe() {
		// TODO - implement Cafe.modificarCafe
		throw new UnsupportedOperationException();
	}

}