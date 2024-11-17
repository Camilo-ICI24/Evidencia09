package PrincipalCafeteria;

import java.util.*;

public class Cafeteria {

	private Collection<Cafe> cafes;
	private String nombre;
	private String direccion;
	private List<String> redesSociales;
	private List<Cafe> menu;

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
	public Cafe obtenerCafePorTamaño(String medida) {
		// TODO - implement Cafeteria.obtenerCafePorTamaño
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

}