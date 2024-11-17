package PrincipalCafeteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private String facebook;   // Atributo para Facebook
	private String instagram;  // Atributo para Instagram
	private int telefono;      // Atributo para Teléfono
	private List<Cafe> menu;

	// Constructor modificado
	public Cafeteria(String nombre, String direccion, String facebook, String instagram, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.facebook = facebook;
		this.instagram = instagram;
		this.telefono = telefono;
		this.menu = new ArrayList<>();
	}
	//Constructor vacio (Se necesita para el gestor de archivos)
	public Cafeteria() {
		this.menu = new ArrayList<>();
	}

	// Getters y setters para los nuevos atributos
	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// Getter y setter para 'nombre'
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter y setter para 'direccion'
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Cafe> getMenu() {
		return menu;
	}




	// Método para agregar cafés (sin cambios)
	public void agregarCafes(int gramosCafe, int mililitrosAgua, Tamaño tamanoCafe, IngredientesCafe ingrediente, String nombreCafe, int codigoIdentificador) {
		Cafe newCafe = new Cafe(gramosCafe, mililitrosAgua, tamanoCafe, ingrediente, nombreCafe, codigoIdentificador);
		menu.add(newCafe);
		System.out.println("Café agregado exitosamente, " + nombreCafe + " suena delicioso");
	}

	// Método para descontinuar un café por código (sin cambios)
	public void descontinuarCafeporCodigoIdentificador(int codigoCafe) {
		for (Cafe cafe : menu) {
			if (cafe.getCodigoIdentificador() == codigoCafe)
				menu.remove(cafe);
			break;
		}
	}

	// Método para listar cafés por tamaño (sin cambios)
	public void listaCafesPorTamaño(Tamaño tamano) {
		for (Cafe cafe : menu) {
			if (cafe.getTamanoCafe() == tamano) {
				System.out.println(cafe.toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Cafeteria{" +
				"nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				", facebook='" + facebook + '\'' +
				", instagram='" + instagram + '\'' +
				", telefono=" + telefono +
				", menu=" + menu +
				'}';
	}
}
