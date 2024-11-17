package PrincipalCafeteria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una cafetería
        Cafeteria cafeteria = new Cafeteria("Cafetería Central", "Av. Principal #123", new ArrayList<>());

        // Crear y agregar cafés
        Cafe cafe1 = new Cafe(cafeteria, 10, 200, Tamaño.MEDIANO, IngredientesCafe.CHOCOLATE, "Café Mocha", 1);
        Cafe cafe2 = new Cafe(cafeteria, 15, 250, Tamaño.GRANDE, IngredientesCafe.LECHE, "Café Latte", 2);
        Cafe cafe3 = new Cafe(cafeteria, 8, 150, Tamaño.PEQUENO, IngredientesCafe.CREMA, "Espresso", 3);

        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        cafeteria.agregarCafe(cafe3);

        // Listar cafés por tamaño
        System.out.println("\nCafés tamaño MEDIANO:");
        cafeteria.listaCafesPorTamaño(Tamaño.MEDIANO);

        // Descontinuar un café
        System.out.println("\nEliminando el café con código 2...");
        cafeteria.descontinuarCafeporCodigoIdentificador(2);

        // Listar el menú completo
        System.out.println("\nMenú actualizado:");
        System.out.println(cafeteria);
    }
}
