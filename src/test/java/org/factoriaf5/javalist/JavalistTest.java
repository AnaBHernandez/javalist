package org.factoriaf5.javalist;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class JavalistTest {
    private final Javalist javalist = new Javalist();

    @Test
    void testCrearListaDias() {
        assertEquals(7, javalist.obtenerLargo());
    }

    @Test
    void testEliminarDia() {
        assertTrue(javalist.eliminarDia("Lunes"));
        assertEquals(6, javalist.obtenerLargo());
    }

    @Test
    void testObtenerDia() {
        assertEquals("Martes", javalist.obtenerDia("Martes"));
        assertNull(javalist.obtenerDia("NoExiste"));
    }

    @Test
    void testExisteDia() {
        assertTrue(javalist.existeDia("Miércoles"));
        assertFalse(javalist.existeDia("NoExiste"));
    }

    @Test
    void testOrdenarDias() {
        javalist.ordenarDias();  // Llama a ordenar después de crear la lista
        List<String> diasOrdenados = javalist.obtenerDias();
        List<String> diasEsperados = List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
        assertEquals(diasEsperados, diasOrdenados);
    }

    @Test
    void testVaciarLista() {
        javalist.vaciarLista();
        assertEquals(0, javalist.obtenerLargo());
    }
}
