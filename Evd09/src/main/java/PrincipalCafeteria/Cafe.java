package PrincipalCafeteria;

public class Cafe {

	private Cafeteria cafeteria;
	private int gramosCafe;
	private int mililitrosAgua;
	private Tamaño tamanoCafe;
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

	public Tamaño getTamanoCafe() {
		return this.tamanoCafe;
	}

	public void setTamanoCafe(Tamaño tamanoCafe) {
		this.tamanoCafe = tamanoCafe;
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