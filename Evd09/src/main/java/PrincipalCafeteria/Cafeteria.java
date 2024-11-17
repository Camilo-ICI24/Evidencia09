package PrincipalCafeteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private List<String> redesSociales;
	private List<Cafe> menu;

	public Cafeteria(String nombre, String direccion, List<String> redesSociales) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.redesSociales = redesSociales;
		this.menu = new ArrayList<>();
	}

	// Getters y setters (sin cambios)

	public boolean agregarCafe(Cafe cafe) {
		if (menu.add(cafe)) {
			System.out.println("Café agregado exitosamente: " + cafe.toString());
			return true;
		}
		return false;
	}

	public void descontinuarCafeporCodigoIdentificador(int codigoCafe) {
		Iterator<Cafe> iterator = menu.iterator();
		while (iterator.hasNext()) {
			Cafe cafe = iterator.next();
			if (cafe.getCodigoIdentificador()== codigoCafe) {
				iterator.remove();
				System.out.println("Café eliminado: " + cafe.getNombreCafe());
				return;
			}
		}
		System.out.println("Café no encontrado con el código: " + codigoCafe);
	}

	public void listaCafesPorTamaño(Tamaño tamano) {
		boolean encontrado = false;
		for (Cafe cafe : menu) {
			if (cafe.getTamanoCafe() == tamano) {
				System.out.println(cafe);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No hay cafés de tamaño: " + tamano);
		}
	}

	@Override
	public String toString() {
		return "Cafeteria{" +
				"nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				", redesSociales=" + redesSociales +
				", menu=" + menu +
				'}';
	}
}
