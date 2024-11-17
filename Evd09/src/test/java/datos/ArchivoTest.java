package datos;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import PrincipalCafeteria.Cafeteria;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;



class ArchivoTest {
    private static final ObjectMapper mapper = new ObjectMapper();

    //Eliminar los archivos para evitar conflictos.
    @BeforeEach
    void setUp() {
        new File("cafeteria.json").delete();
        new File("cafes.json").delete();
    }
    //Lo mismo pero luego de cada prueba
    @AfterEach
    void tearDown() {
        new File("cafeteria.json").delete();
        new File("cafes.json").delete();
    }

    @Test
    void testGuardarCafeteria() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria", "Calle 123", "aaa", "bbb", 123);
        Archivo.guardarCafeteria(cafeteria);
        assertTrue(new File("cafeteria.json").exists());
    }

    @Test
    void testCargarCafeteria() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria", "Calle 123", "aaa", "bbb", 123);
        Archivo.guardarCafeteria(cafeteria);
        Cafeteria cafeteriaCargada = Archivo.cargarCafeteria(Cafeteria.class);
        if(cafeteriaCargada != null){
            assertEquals(cafeteria.getNombre(), cafeteriaCargada.getNombre());
            assertEquals(cafeteria.getDireccion(), cafeteriaCargada.getDireccion());
            assertEquals(cafeteria.getFacebook(), cafeteriaCargada.getFacebook());
            assertEquals(cafeteria.getInstagram(), cafeteriaCargada.getInstagram());
            assertEquals(cafeteria.getTelefono(), cafeteriaCargada.getTelefono());
        }
    }

    @Test
    void testGuardarCafes() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria", "Calle 123", "aaa", "bbb", 123);
        cafeteria.agregarCafes(10, 200, PrincipalCafeteria.Tamaño.MEDIANO, PrincipalCafeteria.IngredientesCafe.CHOCOLATE, "Café Mocha", 1);
        cafeteria.agregarCafes(15, 250, PrincipalCafeteria.Tamaño.GRANDE, PrincipalCafeteria.IngredientesCafe.LECHE, "Café Latte", 2);
        cafeteria.agregarCafes(8, 150, PrincipalCafeteria.Tamaño.PEQUENO, PrincipalCafeteria.IngredientesCafe.CREMA, "Espresso", 3);
        cafeteria.agregarCafes(12, 220, PrincipalCafeteria.Tamaño.MEDIANO, PrincipalCafeteria.IngredientesCafe.LECHE, "Café Americano", 4);
        Archivo.guardarCafes(cafeteria.getMenu());
        assertTrue(new File("cafes.json").exists());
    }

    @Test
    void testCargarCafes() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria", "Calle 123", "aaa", "bbb", 123);
        cafeteria.agregarCafes(10, 200, PrincipalCafeteria.Tamaño.MEDIANO, PrincipalCafeteria.IngredientesCafe.CHOCOLATE, "Café Mocha", 1);
        cafeteria.agregarCafes(15, 250, PrincipalCafeteria.Tamaño.GRANDE, PrincipalCafeteria.IngredientesCafe.LECHE, "Café Latte", 2);
        cafeteria.agregarCafes(8, 150, PrincipalCafeteria.Tamaño.PEQUENO, PrincipalCafeteria.IngredientesCafe.CREMA, "Espresso", 3);
        cafeteria.agregarCafes(12, 220, PrincipalCafeteria.Tamaño.MEDIANO, PrincipalCafeteria.IngredientesCafe.LECHE, "Café Americano", 4);
        Archivo.guardarCafes(cafeteria.getMenu());
        assertEquals(4, Archivo.cargarCafes().size());
    }

    @Test
    void testCargarCafesVacio() {
        setUp(); //Para asegurarme que este borrado
        Cafeteria cafeteria = Archivo.cargarCafeteria(Cafeteria.class);
        assertNull(cafeteria, "No debería haber cafeteria");
    }

    @Test
    void testCargarCafeteriaVacio() {
        setUp(); //Para asegurarme que este borrado
        Cafeteria cafeteria = Archivo.cargarCafeteria(Cafeteria.class);
        assertNull(cafeteria, "No debería haber cafeteria");
    }
}