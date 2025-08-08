# API de Autenticación con Spring Security (JWT) en Spring Boot

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

## Funcionalidades (V 1.1)

- Registro de usuarios (V 1.0)
- Login y generación de JWT (V 1.0)
- Validación de token (V 1.0)
- Acceso protegido con roles (V 1.0)
- Seguridad basada en Spring Security (V 1.0)

- Roles ADMIN y USER (V 1.1)

## Ejecutar y probar el proyecto

- Clonar el proyecto y crear un archivo application-local.yml para los datos sensibles (credenciales de base de datos y el secreto de JWT).

- Registro de usuario (Genera un JWT): \
POST http://localhost:8080/api/auth/register

- Login (obtener JWT): \
POST http://localhost:8080/api/auth/login

- Endpoint protegido (requiere JWT en el header): \
GET http://localhost:8080/otro/test

- Endpoint protegido (requiere JWT de ADMIN en el header): \
GET http://localhost:8080/api/admin/todos
![Acceso exitoso al endpoint como ADMIN](img/endpoint_ADMIN.png)

## Proximas mejoras

- Usar este proyecto como base para crear un gestor CRM.
- Desarrollar un Frontend sencillo.

## Desarrollado por JaviDev707