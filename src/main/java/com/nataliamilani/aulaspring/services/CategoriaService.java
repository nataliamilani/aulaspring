package com.nataliamilani.aulaspring.services;

import com.nataliamilani.aulaspring.domain.Categoria;
import com.nataliamilani.aulaspring.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    // esta anotacao é utilizada para ser automaticamente instanciada pelo spring (injecao de dependencia)
    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){

        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }

}
