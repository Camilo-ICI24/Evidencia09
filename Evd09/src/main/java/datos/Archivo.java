package datos;

import java.io.File;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import PrincipalCafeteria.*;

public class Archivo {
	private static final ObjectMapper mapper = new ObjectMapper();

	//Metodo para guardar la Cafeteria
	public static void guardarCafeteria(Cafeteria cafeteria) {
		try {
			mapper.writeValue(new File("cafeteria.json"), cafeteria);
			System.out.println("Data guardada en: cafeteria.json");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage() + " al guardar la data en: cafeteria.json");
		}
	}
	//Cargar Cafeteria
	public static Cafeteria cargarCafeteria(Class<Cafeteria> cafeteriaClass) {
		try {
			Cafeteria cafeteria = mapper.readValue(new File("cafeteria.json"), cafeteriaClass);
			System.out.println("Data cargada de: cafeteria.json");
			return cafeteria;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage() + " al cargar la data de: cafeteria.json");
			return null;
		}
	}

	//CAFES

	//Guardar lista de Cafes
	public static void guardarCafes(List<Cafe> cafes) {
		try {
			mapper.writeValue(new File("cafes.json"), cafes);
			System.out.println("Data guardada en: cafes.json");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage() + " al guardar la data en: cafes.json");
		}
	}

	public static List<Cafe> cargarCafes() {
		try {
			return  mapper.readValue(new File("cafes.json"),
					mapper.getTypeFactory().constructCollectionType(List.class, Cafe.class));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage() + " al cargar la data de: cafes.json");
			return null;
		}
	}
}