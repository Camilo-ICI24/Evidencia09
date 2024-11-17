package PrincipalCafeteria;

public class Cafe {
	private Cafeteria cafeteria;
	private int gramosCafe;
	private int mililitrosAgua;
	private Tamaño tamanoCafe;
	private IngredientesCafe ingrediente;
	private String nombreCafe;
	private int codigoIdentificador;

	public Cafe(Cafeteria cafeteria, int gramosCafe, int mililitrosAgua, Tamaño tamanoCafe,
				IngredientesCafe ingrediente, String nombreCafe, int codigoIdentificador) {
		this.cafeteria = cafeteria;
		this.gramosCafe = gramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.tamanoCafe = tamanoCafe;
		this.ingrediente = ingrediente;
		this.nombreCafe = nombreCafe;
		this.codigoIdentificador = codigoIdentificador;
	}

	// Getters y setters (sin cambios)

	@Override
	public String toString() {
		return "Cafe{" +
				"nombreCafe='" + nombreCafe + '\'' +
				", codigoIdentificador=" + codigoIdentificador +
				", tamanoCafe=" + tamanoCafe +
				", gramosCafe=" + gramosCafe +
				", mililitrosAgua=" + mililitrosAgua +
				", ingrediente=" + ingrediente +
				'}';
	}
}
