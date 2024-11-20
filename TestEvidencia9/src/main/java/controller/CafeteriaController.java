package controller;

import PrincipalCafeteria.Cafe;
import PrincipalCafeteria.Cafeteria;
import datos.Archivo;
import java.util.List;

public class CafeteriaController {
	private Cafeteria cafeteria;

	// Constructor para cargar la cafetería
	public CafeteriaController() {
		this.cafeteria = Archivo.cargarCafeteria(Cafeteria.class);
		if (this.cafeteria == null) {
			this.cafeteria = new Cafeteria(); // Crear una cafetería nueva si no existe
		}
	}

	public boolean agregarCafe(Cafe cafe) {
		if (cafe != null && cafeteria.getMenu().stream().noneMatch(c -> c.getCodigoIdentificador() == cafe.getCodigoIdentificador())) {
			cafeteria.getMenu().add(cafe);
			Archivo.guardarCafeteria(cafeteria);
			return true;
		}
		return false; // Retorna false si ya existe un café con el mismo código
	}


	public int obtenerCantidadCafes() {
		return cafeteria.getMenu().size();
	}

	public List<Cafe> obtenerCafePorTamano(String tamano) {
		return cafeteria.getMenu().stream()
				.filter(cafe -> cafe.getTamanoCafe().toString().equalsIgnoreCase(tamano))
				.toList();
	}

	public boolean descontinuarCafe(int codigo) {
		List<Cafe> menu = cafeteria.getMenu();
		for (Cafe cafe : menu) {
			if (cafe.getCodigoIdentificador() == codigo) {
				menu.remove(cafe);
				Archivo.guardarCafeteria(cafeteria); // Guardar cambios
				return true;
			}
		}
		return false;
	}

	public boolean modificarCafeteria(String nombre, String direccion, String facebook, String instagram, int telefono) {
		if (cafeteria != null) {
			cafeteria.setNombre(nombre);
			cafeteria.setDireccion(direccion);
			cafeteria.setFacebook(facebook);
			cafeteria.setInstagram(instagram);
			cafeteria.setTelefono(telefono);

			Archivo.guardarCafeteria(cafeteria);
			return true;
		}
		return false;
	}

}
