package controller;


import model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import service.ProductoService;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;


    @GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> productos() {
        return productoService.catalogo();
    }

    @GetMapping(value="productos/{categoria}")
    public List<Producto> productosCategoria(@PathVariable("categoria") String categoria) {
        return productoService.productosCategoria(categoria);
    }

    @GetMapping(value="producto")
    public Producto productoCodigo(@RequestParam("cod") int cod){
        return productoService.productoCodigo(cod);
    }


    @PostMapping(value="alta", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaProducto(@RequestBody Producto producto){
        productoService.altaProducto(producto);
    }

    @DeleteMapping(value="eliminar")
    public Producto eliminarProducto(@RequestParam("cod") int cod){
        return productoService.eliminarProducto(cod);
    }

    @PutMapping(value="actualizar")
    public Producto actualizarProducto(@RequestParam("cod") int cod, @RequestParam("precio") double precio){
        return productoService.actualizarPrecio(cod, precio);
    }

}
