package controller;

import PrincipalCafeteria.Cafe;
import PrincipalCafeteria.IngredientesCafe;
import PrincipalCafeteria.Tamaño;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class CafeteriaControllerTest {

    @org.junit.jupiter.api.Test
    void agregarCafe() {
        Cafe cafe = new Cafe(40,400, Tamaño.PEQUENO, IngredientesCafe.CREMA,"Buenisssimo",1234567893);
        CafeteriaController control = new CafeteriaController();
        assertFalse(control.agregarCafe(cafe));
        assertFalse(control.agregarCafe(cafe));
    }

    @org.junit.jupiter.api.Test
    void obtenerCantidadCafes() {
        CafeteriaController control = new CafeteriaController();
        assertEquals(3,control.obtenerCantidadCafes());
    }

    @org.junit.jupiter.api.Test
    void obtenerCafePorTamano() {
        Cafe cafe = new Cafe(40,400, Tamaño.MEDIANO, IngredientesCafe.CREMA,"Buenisssimo",1234567890);
        List<Cafe> cafesRecibidos;
        CafeteriaController control = new CafeteriaController();
        control.agregarCafe(cafe);
        cafesRecibidos = control.obtenerCafePorTamano("MEDIANO");
        assertEquals(cafe.toString(), cafesRecibidos.get(0).toString());
    }

    @org.junit.jupiter.api.Test
    void descontinuarCafe() {
        Cafe cafe = new Cafe(40,400, Tamaño.MEDIANO, IngredientesCafe.CREMA,"Buenisssimo",1234567890);
        Cafe cafe2 = new Cafe(40,400, Tamaño.GRANDE, IngredientesCafe.CREMA,"Buenisssimo",1234567891);
        CafeteriaController control = new CafeteriaController();
        control.agregarCafe(cafe);
        control.agregarCafe(cafe2);
        assertTrue(control.descontinuarCafe(1234567891));
        assertFalse(control.descontinuarCafe(1234567891));

    }

    @org.junit.jupiter.api.Test
    void modificarCafeteria() {
        Cafe cafe = new Cafe(40,400, Tamaño.MEDIANO, IngredientesCafe.CREMA,"Buenisssimo",1234567890);
        CafeteriaController control = new CafeteriaController();
        control.agregarCafe(cafe);
        assertTrue(control.modificarCafeteria("cafesWenos","Simon Bolivar 200,Temuco","@cafesWenos1","@cafesWenoss",978654321));
    }
}
