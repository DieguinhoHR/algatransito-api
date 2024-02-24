package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Diego");
        proprietario1.setEmail("diego@algaworks.com");
        proprietario1.setTelefone("91780789");

        var proprietario2 = new Proprietario();
        proprietario2.setId(1L);
        proprietario2.setNome("jolão");
        proprietario2.setEmail("joaodascouves@algaworks.com");
        proprietario2.setTelefone("34 99999-1111");

        return Arrays.asList(proprietario1, proprietario2);
    }
}
