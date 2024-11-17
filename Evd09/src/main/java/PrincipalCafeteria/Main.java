package PrincipalCafeteria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de redes sociales
        ArrayList<String> redesSociales = new ArrayList<>();
        redesSociales.add("Instagram");
        redesSociales.add("Facebook");

        // Crear una cafetería
        Cafeteria cafeteria = new Cafeteria("Cafetería Central", "Av. Principal #123", redesSociales);

        // Agregar cafés al menú
        cafeteria.agregarCafes(10, 200, Tamaño.MEDIANO, IngredientesCafe.CHOCOLATE, "Café Mocha", 1);
        cafeteria.agregarCafes(15, 250, Tamaño.GRANDE, IngredientesCafe.LECHE, "Café Latte", 2);
        cafeteria.agregarCafes(8, 150, Tamaño.PEQUENO, IngredientesCafe.CREMA, "Espresso", 3);
        cafeteria.agregarCafes(12, 220, Tamaño.MEDIANO, IngredientesCafe.LECHE, "Café Americano", 4);

        // Listar cafés por tamaño MEDIANO
        System.out.println("\nCafés de tamaño MEDIANO:");
        cafeteria.listaCafesPorTamaño(Tamaño.MEDIANO);

        // Descontinuar un café por código
        System.out.println("\nDescontinuando café con código 2...");
        cafeteria.descontinuarCafeporCodigoIdentificador(2);

        // Listar el menú completo después de la descontinuación
        System.out.println("\nMenú actualizado:");
        System.out.println(cafeteria);

        // Intentar descontinuar un café no existente
        System.out.println("\nIntentando descontinuar café con código 5...");
        cafeteria.descontinuarCafeporCodigoIdentificador(5);
    }
}
