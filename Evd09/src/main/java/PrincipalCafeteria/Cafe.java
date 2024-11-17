package PrincipalCafeteria;

public class Cafe {

	private Cafeteria cafeteria;
	private int gramosCafe;
	private int mililitrosAgua;
	private Tamaño tamanoCafe;
	private IngredientesCafe ingrediente;

	// Constructor para inicializar los atributos
	public Cafe(Cafeteria cafeteria, int gramosCafe, int mililitrosAgua, Tamaño tamanoCafe, IngredientesCafe ingrediente) {
		this.cafeteria = cafeteria;
		this.gramosCafe = gramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.tamanoCafe = tamanoCafe;
		this.ingrediente = ingrediente;
	}

	// Getter y setter para 'cafeteria'
	public Cafeteria getCafeteria() {
		return this.cafeteria;
	}

	public void setCafeteria(Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

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

	// Método toString para mostrar el estado del objeto
	@Override
	public String toString() {
		return "Cafe{" +
				"cafeteria=" + (cafeteria != null ? cafeteria.toString() : "null") +
				", gramosCafe=" + gramosCafe +
				", mililitrosAgua=" + mililitrosAgua +
				", tamanoCafe=" + (tamanoCafe != null ? tamanoCafe.toString() : "null") +
				", ingrediente=" + (ingrediente != null ? ingrediente.toString() : "null") +
				'}';
	}
}
