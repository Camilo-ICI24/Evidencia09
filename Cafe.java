package PrincipalCafeteria;

public class Cafe {

	private Cafeteria cafeteria;
	private int gramosCafe;
	private int mililitrosAgua;
	private Tamaņo tamaņoCafe;
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

	public Tamaņo getTamaņoCafe() {
		return this.tamaņoCafe;
	}

	/**
	 * 
	 * @param tamaņoCafe
	 */
	public void setTamaņoCafe(Tamaņo tamaņoCafe) {
		this.tamaņoCafe = tamaņoCafe;
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