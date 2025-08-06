package com.Login.Login.Service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Login.Login.DTO.AuthResponse;
import com.Login.Login.DTO.LoginRequest;
import com.Login.Login.DTO.RegisterRequest;
import com.Login.Login.Repository.UsuarioRepository;
import com.Login.Login.Usuario.Role;
import com.Login.Login.Usuario.Usuario;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
    
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    public AuthResponse register(RegisterRequest request) {
        // Valido si el usuario y el email ya existen
        if (usuarioRepository.existsByUsername(request.username())) {
            throw new RuntimeException("El nombre de usuario ya esta en uso.");
        }
        if (usuarioRepository.existsByEmail(request.email())) {
            throw new RuntimeException("El email ya esta en uso.");
        }
        // Creao el usuario
        Usuario usuario = new Usuario();
        usuario.setUsername(request.username());
        usuario.setEmail(request.email());
        usuario.setPassword(passwordEncoder.encode(request.password()));
        usuario.setRole(Role.USER);
        // Guardo el usuario en la base de datos
        usuarioRepository.save(usuario);
        // Genero un JWT
        String token = jwtUtil.generateToken(usuario);
        // Devuelvo AuthResponse
        return new AuthResponse(token);
    }

    public AuthResponse login (LoginRequest request){

        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.username(), request.password())
        );

        Usuario usuario = usuarioRepository.findByUsername(request.username());
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado.");
        }

        String token = jwtUtil.generateToken(usuario);
        return new AuthResponse(token);
    }
}
