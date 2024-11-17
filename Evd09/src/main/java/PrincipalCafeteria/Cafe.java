package PrincipalCafeteria;

public class Cafe {


	private int gramosCafe;
	private int mililitrosAgua;
	private Tamaño tamanoCafe;
	private IngredientesCafe ingrediente;
	private String nombreCafe; // Nuevo atributo
	private int codigoIdentificador; // Nuevo atributo

	// Constructor para inicializar todos los atributos
	public Cafe( int gramosCafe, int mililitrosAgua, Tamaño tamanoCafe,
				IngredientesCafe ingrediente, String nombreCafe, int codigoIdentificador) {

		this.gramosCafe = gramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.tamanoCafe = tamanoCafe;
		this.ingrediente = ingrediente;
		this.nombreCafe = nombreCafe;
		this.codigoIdentificador = codigoIdentificador;
	}

	//Constructor vacio (Se necesita para el gestor de archivos)
	public Cafe() {
	}

	// Getter y setter para 'cafeteria'


	// Getter y setter para 'gramosCafe'
	public int getGramosCafe() {
		return this.gramosCafe;
	}

	public void setGramosCafe(int gramosCafe) {
		this.gramosCafe = gramosCafe;
	}

	// Getter y setter para 'mililitrosAgua'
	public int getMililitrosAgua() {
		return this.mililitrosAgua;
	}

	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	// Getter y setter para 'tamanoCafe'
	public Tamaño getTamanoCafe() {
		return this.tamanoCafe;
	}

	public void setTamanoCafe(Tamaño tamanoCafe) {
		this.tamanoCafe = tamanoCafe;
	}

	// Getter y setter para 'ingrediente'
	public IngredientesCafe getIngrediente() {
		return this.ingrediente;
	}

	public void setIngrediente(IngredientesCafe ingrediente) {
		this.ingrediente = ingrediente;
	}

	// Getter y setter para 'nombreCafe'
	public String getNombreCafe() {
		return this.nombreCafe;
	}

	public void setNombreCafe(String nombreCafe) {
		this.nombreCafe = nombreCafe;
	}

	// Getter y setter para 'codigoIdentificador'
	public int getCodigoIdentificador() {
		return this.codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	// Método toString para mostrar el estado del objeto
	@Override
	public String toString() {
		return "Cafe{" +
				", gramosCafe=" + gramosCafe +
				", mililitrosAgua=" + mililitrosAgua +
				", tamanoCafe=" + (tamanoCafe != null ? tamanoCafe.toString() : "null") +
				", ingrediente=" + (ingrediente != null ? ingrediente.toString() : "null") +
				", nombreCafe='" + nombreCafe + '\'' +
				", codigoIdentificador=" + codigoIdentificador +
				'}';
	}
}
