Proyecto de Peluquería - Java Swing + MySQL

Descripción:
Este es un proyecto de escritorio desarrollado en Java con Maven y Swing, que permite la gestión de clientes y turnos en una peluquería. El sistema incluye autenticación de usuario, registro y la posibilidad de administrar citas.

![Sin título](https://github.com/user-attachments/assets/fa6be193-26d6-40cd-bb68-10d27dd6ee9d)
![2](https://github.com/user-attachments/assets/103eac11-48c4-4a8b-a961-3f1c8f1a7d06)
![3](https://github.com/user-attachments/assets/e73fc1c9-50b4-49be-9ace-2bbe8e6d26b2)

Tecnologías utilizadas:
- Java (JDK 8 o superior)
- Maven (gestor de dependencias)
- Swing (interfaz gráfica)
- MySQL (base de datos)
- JDBC (conexión con la base de datos)

Funcionalidades implementadas:
✅ Conexión con MySQL: Clase ConexionBD.java para manejar la conexión.
✅ Pantalla de Registro: Formulario para que el administrador pueda registrarse en el sistema.
✅ Inserción de usuario en la base de datos: Se guarda el email y la contraseña en MySQL.
✅ Redirección a otra ventana: Luego del registro, se cierra la ventana y se abre otra.
✅ Inicio de sesión: Validar usuario y redirigirlo al sistema.

Funcionalidades en desarrollo:
🛠 Gestión de turnos: Permitir al administrador agendar citas para clientes.
🛠 Gestión de inventario.
🛠 Interfaz mejorada: Optimizar diseño de ventanas con Swing.

Configuración de la Base de Datos:
Crear una base de datos en MySQL:
CREATE DATABASE peluqueria;

Crear la tabla usuario:
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE clientes(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    telefono VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
)

Instalación y Ejecución:

Clonar el repositorio o descargar el código.
Importar el proyecto en NetBeans o cualquier IDE compatible con Maven.
Verificar que el driver de MySQL esté en las dependencias pom.xml:

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
Ejecutar el main en Peluqueriamama.java.

Probar la conexión en ConexionBD.java.
