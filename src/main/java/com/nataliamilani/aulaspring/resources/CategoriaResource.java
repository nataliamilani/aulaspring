package com.nataliamilani.aulaspring.resources;

import com.nataliamilani.aulaspring.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List listar(){

        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2,"Escritório");

        List <Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }


}
