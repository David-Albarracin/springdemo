![](https://raw.githubusercontent.com/David-Albarracin/README_MATERIALS/main/spring.png)



# Spring Boot CRUD - Rest and Controller

Este proyecto implementa una aplicación Spring Boot CRUD utilizando Arquitectura Hexagonal y Vertical Slicing.

## Estructura del Proyecto

El proyecto sigue un enfoque estructurado para separar las responsabilidades y asegurar la modularidad y mantenibilidad.

### Estructura de Carpetas

```
C:.
├───.mvn
│   └───wrapper
├───.vscode
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───campuslands
│   │   │           └───springdemo
│   │   │               ├───config
│   │   │               └───user
│   │   │                   ├───application
│   │   │                   ├───domain
│   │   │                   └───infrastructure
│   │   └───resources
│   │       ├───static
│   │       │   ├───css
│   │       │   └───js
│   │       └───templates
│   │           ├───customer
│   │           └───user
│   └───test
│       └───java
│           └───com
│               └───campuslands
│                   └───springdemo
└───target
    ├───classes
    │   ├───com
    │   │   └───campuslands
    │   │       └───springdemo
    │   │           ├───config
    │   │           └───user
    │   │               ├───application
    │   │               ├───domain
    │   │               └───infrastructure
    │   ├───static
    │   │   ├───css
    │   │   └───js
    │   └───templates
    │       └───customer
    └───test-classes
        └───com
            └───campuslands
                └───springdemo
```

### Descripción

Este proyecto utiliza Spring Boot junto con la Arquitectura Hexagonal y Vertical Slicing para organizar las diferentes capas de la aplicación de manera eficiente.

- **`config/`**: Contiene configuraciones generales de la aplicación.
- **`customer/`**:
  - **`application/`**: Contiene las clases de configuración y propiedades específicas de la aplicación.
  - **`domain/`**: Define las entidades del dominio del usuario.
  - **`infrastructure/`**: Capa de infraestructura que incluye implementaciones de repositorios y servicios.
- **`resources/`**:
  - **`static/`**: Archivos estáticos como CSS y JavaScript.
  - **`templates/`**: Plantillas para la interfaz de usuario.

### Configuración de Propiedades

El proyecto utiliza perfiles específicos para configurar las propiedades de la base de datos recuerda actualizar estos datos para hacer pruebas locales 
