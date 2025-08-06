package com.Login.Login.DTO;
/**
 *  Muestra información del perfil sin exponer la entidad Usuario
 */
public record UsuarioDTO(

    String username,
    String email,
    String role
    
) {}
