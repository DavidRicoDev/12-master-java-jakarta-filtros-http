package es.davidrico.jakarta.filtroshttp.servicios;

import es.davidrico.jakarta.filtroshttp.modelos.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> porId(Long id);
}
