package service.impl;

import model.Producto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import service.ProductoService;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


@Service
public class ProductoServiceImpl implements ProductoService {

    private static List<Producto> productos=new ArrayList<>(List.of(new Producto(100,"Azucar","Alimentación",1.10,20),
            new Producto(101,"Leche","Alimentación",1.20,15),
            new Producto(102,"Jabón","Limpieza",0.89,30),
            new Producto(103,"Mesa","Hogar",125,4),
            new Producto(104,"Televisión","Hogar",650,10),
            new Producto(105,"Huevos","Alimentación",2.20,30),
            new Producto(106,"Fregona","Limpieza",3.40,6),
            new Producto(107,"Detergente","Limpieza",8.7,12)));


    @Override
    public Flux<Producto> catalogo() {
        //Contiene un Flux con el catalogo de productos
        return Flux.fromIterable(productos)
                .delayElements(Duration.ofSeconds(2));
    }

    @Override
    public Flux<Producto> productosCategoria(String categoria) {
        return null;
    }

    @Override
    public Mono<Producto> productoCodigo(int cod) {
        return null;
    }

    @Override
    public Mono<Void> altaProducto(Producto producto) {
        return null;
    }

    @Override
    public Mono<Producto> eliminarProducto(int cod) {
        return null;
    }

    @Override
    public Mono<Producto> actualizarPrecio(int cod, double precio) {
        return null;
    }
}
