package com.Login.Login.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Login.Login.Repository.UsuarioRepository;
import com.Login.Login.Usuario.Usuario;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
public class AminController {
    
    private final UsuarioRepository usuarioRepository;

    @GetMapping("/todos")
    public List<Usuario> listarTodos(){
        System.out.println("Acceso ADMIN concedido.");
        return usuarioRepository.findAll();
    }

}
