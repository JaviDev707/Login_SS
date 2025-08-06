package com.Login.Login.DTO;
/**
 * 	Recibe los datos del usuario al hacer login
 */
public record LoginRequest(

    String username,
    String password

) {}
