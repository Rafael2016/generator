package com.exemplo.generator.api.controller;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.generator.api.controller.domain.model.Usuario;

@RestController
@RequestMapping(value = "/usuario/v1")
public class UsuarioController {

    @GetMapping("/ping")
    public String ping() {
        return "APIRest Gerador de Orçamento Spring Boot 3.0.4 - Versão do Java "
                + ManagementFactory.getRuntimeMXBean().getVmVersion();
    }

    @GetMapping("/list")
    public List<Usuario> listUser() {

        var user = new Usuario();
        user.setEmail("rafa@tecnologo");
        user.setLogin("rafa");
        user.setTelefone("(31)3434-33-00");

        var user1 = new Usuario();
        user1.setEmail("rafa@tecnologo1");
        user1.setLogin("rafa1");
        user1.setTelefone("(31)3434-33-001");

        return Arrays.asList(user, user1);

    }

}
