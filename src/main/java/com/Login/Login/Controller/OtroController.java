package com.Login.Login.Controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Login.Login.Repository.UsuarioRepository;
import com.Login.Login.Usuario.Usuario;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/otro")
public class OtroController {
    
    private final UsuarioRepository usuarioRepository;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        List<Usuario> lista = usuarioRepository.findAll();
        return ResponseEntity.ok("Acceso concedido \n" + lista.toString());
    }

}
