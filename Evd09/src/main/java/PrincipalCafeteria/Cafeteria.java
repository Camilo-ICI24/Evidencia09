package PrincipalCafeteria;

import java.util.*;

public class Cafeteria {

	private Collection<Cafe> cafes;
	private String nombre;
	private String direccion;
	private List<String> redesSociales;
	private List<Cafe> menu;

	// Constructor para inicializar los atributos
	public Cafeteria(Collection<Cafe> cafes, String nombre, String direccion, List<String> redesSociales, List<Cafe> menu) {
		this.cafes = cafes;
		this.nombre = nombre;
		this.direccion = direccion;
		this.redesSociales = redesSociales;
		this.menu = menu;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 *
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 *
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<String> getRedesSociales() {
		return this.redesSociales;
	}

	/**
	 *
	 * @param redesSociales
	 */
	public void setRedesSociales(List<String> redesSociales) {
		this.redesSociales = redesSociales;
	}

	public List<Cafe> getMenu() {
		return this.menu;
	}

	/**
	 *
	 * @param menu
	 */
	public void setMenu(List<Cafe> menu) {
		this.menu = menu;
	}

	/**
	 *
	 * @param cafe
	 */
	public boolean agregarCafe(Cafe cafe) {
		// TODO - implement Cafeteria.agregarCafe
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param medida
	 */
	public Cafe obtenerCafePorTamano(String medida) {
		// TODO - implement Cafeteria.obtenerCafePorTamano
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param cafe
	 */
	public boolean descontinuarCafe(Cafe cafe) {
		// TODO - implement Cafeteria.descontinuarCafe
		throw new UnsupportedOperationException();
	}

	public boolean modificarInformacion() {
		// TODO - implement Cafeteria.modificarInformacion
		throw new UnsupportedOperationException();
	}

	// Método toString para representar el estado del objeto
	@Override
	public String toString() {
		return "Cafeteria{" +
				"nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				", redesSociales=" + (redesSociales != null ? redesSociales : "[]") +
				", menu=" + (menu != null ? menu : "[]") +
				", cafes=" + (cafes != null ? cafes : "[]") +
				'}';
	}

	public void descontinuarCafe()
}
