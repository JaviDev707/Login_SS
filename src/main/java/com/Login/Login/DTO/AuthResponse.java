package com.Login.Login.DTO;
/**
 * Devuelve el token JWT y otros datos del usuario tras login o registro
 */
public record AuthResponse (

    String token

){}
