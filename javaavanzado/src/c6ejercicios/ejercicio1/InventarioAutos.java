package c6ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
    private List<T> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAInventario(T t) {
        inventario.add(t);
    }

    public List<T> buscarPorMarca(String parametro) {
        List<T> resultado = inventario.stream()
                .filter(d -> d.getMarca().equals(parametro))
                .toList();

        return resultado;
    }

    public List<T> buscarPorAnno(Integer parametro) {
        List<T> resultado = inventario.stream()
                .filter(d -> d.getAnno().equals(parametro))
                .toList();

        return resultado;
    }

    public Double valorTotal() {
        Double vt = inventario.stream()
                .mapToDouble(auto -> auto.getPrecio())
                .reduce((precio, total) -> precio + total)
                .orElse(0);

        return vt;
    }
}
