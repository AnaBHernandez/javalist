package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Javalist {
    private List<String> dias;

    public Javalist() {
        crearListaDias();
    }

    public void crearListaDias() {
        dias = new ArrayList<>();
        Collections.addAll(dias, "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
    }

    public List<String> obtenerDias() {
        return dias;
    }

    public int obtenerLargo() {
        return dias.size();
    }

    public boolean eliminarDia(String dia) {
        return dias.remove(dia);
    }

    public String obtenerDia(String dia) {
        return dias.contains(dia) ? dia : null;
    }

    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

    // Método para ordenar los días en el orden correcto
    public void ordenarDias() {
        List<String> diasCorrectos = List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
        Collections.sort(dias, Comparator.comparingInt(diasCorrectos::indexOf));
    }

    public void vaciarLista() {
        dias.clear();
    }
}
