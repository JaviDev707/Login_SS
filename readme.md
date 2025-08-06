# API de Autenticación con JWT en Spring Boot

## Descripción

Proyecto backend en Java que permite registro, login y acceso protegido mediante JWT.

## Tecnologías

- Java 17
- Spring Boot
- Spring Security
- JWT
- Maven
- MySQL
- Postman (para pruebas)

## Funcionalidades (V 1.0)

- Registro de usuarios
- Login y generación de JWT
- Validación de token
- Acceso protegido con roles
- Seguridad basada en Spring Security

## Ejecutar y probar el proyecto

- Clonar el proyecto y crear un archivo application-local.yml para los datos sensibles (credenciales de base de datos y el secreto de JWT).

- Registro de usuario:
- POST http://localhost:8080/api/auth/register

- Login (obtener JWT):
- POST http://localhost:8080/api/auth/login

- Endpoint protegido (requiere JWT en el header):
- GET http://localhost:8080/otro/test

## Desarrollado por JaviDev707