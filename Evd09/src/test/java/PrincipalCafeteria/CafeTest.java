package PrincipalCafeteria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void agregarIngrediente() {
        Cafe cafe = new Cafe(40,200,Tamaño.GRANDE);
        assertTrue(cafe.agregarIngrediente(IngredientesCafe.LECHE));
        System.out.println(cafe.toString());
    }

    @Test
    void eliminarIngrediente() {
        Cafe cafe = new Cafe(40,200,Tamaño.GRANDE);
        assertTrue(cafe.agregarIngrediente(IngredientesCafe.LECHE));
        System.out.println(cafe.toString());
        assertTrue(cafe.eliminarIngrediente(IngredientesCafe.LECHE));
        System.out.println(cafe.toString());
        assertFalse(cafe.eliminarIngrediente(IngredientesCafe.LECHE));
    }
}