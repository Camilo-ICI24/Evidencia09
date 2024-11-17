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

	public void agregarCafes(int gramosCafe, int mililitrosAgua, Tamaño tamanoCafe, IngredientesCafe ingrediente, String nombreCafe, int codigoIdentificador){
		Cafe newCafe = new Cafe(gramosCafe,mililitrosAgua,tamanoCafe, ingrediente, nombreCafe, codigoIdentificador);
		menu.add(newCafe);
		System.out.println("Cafe agregado exitosamente, "+nombreCafe+" suena delicioso");
	}



	public void descontinuarCafeporCodigoIdentificador(int codigoCafe){
		for (Cafe cafe : menu){
			if(cafe.getCodigoIdentificador() == codigoCafe)
				menu.remove(cafe);
			break;
		}
	}

	public void  listaCafesPorTamaño(Tamaño tamano){
		for(Cafe cafe : menu){
			if(cafe.getTamanoCafe()== tamano){
				System.out.println(cafe.toString());
			}
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
