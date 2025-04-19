CATPIDOG - Proyecto Final Bootcamp Backend con Java y Spring

Descripción:

API REST para gestionar las operaciones necesarias para la adopción de mascotas, desarrollada en Java con Spring.    

Funcionalidades:

Autenticación (requiere usuario y contraseña).    

Operaciones GET para:

Mascotas.    
Tipos de mascotas.    
Usuarios.    
Adopciones.    
Operaciones POST para:

Mascotas.    
Usuarios.    
Operaciones PUT para:

Mascotas.    
Operaciones DELETE para:

Mascotas.    
Usuarios.    
Adopciones.    
Autenticación:

Usuario: usuario

Password: user12345z    

Estructura del Proyecto:

El código se organiza en los siguientes paquetes:

Config: Configuración de la aplicación.    

Models: Entidades del dominio.    

DTOs: Objetos de Transferencia de Datos.    

Repositories: Acceso a la base de datos.    

Services: Lógica de negocio.    

Controllers: Manejo de solicitudes web.    

Configuración de la Base de Datos:

Se utiliza una base de datos H2 en memoria.    

La configuración se encuentra en el archivo application.properties (src/main/resources).    

JPA está configurado para crear y eliminar tablas automáticamente.    

Endpoints:

La API define los siguientes endpoints para interactuar con los recursos:

/api/adopciones (POST, GET)    

/api/mascotas (POST, GET, PUT, DELETE)    

/api/tipos (GET)    

/api/usuarios (POST, GET, DELETE)    

