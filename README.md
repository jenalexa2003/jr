# Aplicativo Web para la Selección de Códigos de Localidades

Este proyecto es un aplicativo web diseñado para la selección de códigos de parroquia, cantón y provincia, desarrollado con **Java 8**, **Maven** y **PrimeFaces**, y configurado para ejecutarse en un servidor **WildFly**.

## Arquitectura y Desarrollo

### Instalación y Configuración
- **Entorno de Desarrollo**: 
  - Instalación y configuración de Java 8 y Maven en el IDE **Eclipse**.
  - Configuración del servidor de aplicaciones **WildFly** para soportar la arquitectura requerida.
- **Estructura del Proyecto**:
  - Proyecto Maven llamado `localidades`, con la siguiente estructura:
    - Código fuente: `src/main/java`
    - Recursos y configuración: `src/main/resources`
  - Dependencias definidas en el archivo `pom.xml`.

### Desarrollo de Clases Java y Lógica de Negocio
En el directorio `src/main/java`, se implementaron las siguientes entidades y componentes:
- **Entidades de Negocio**:
  - `Cantón.java`
  - `Parroquia.java`
  - `Provincia.java`
- **Componentes**:
  - **Controladores**: Gestionan las peticiones del frontend al backend.
  - **Servicios**: Procesan y manejan los datos de las entidades.
  - **Managed Bean**: Facilita la interacción entre la vista y la lógica del servidor.

En el directorio `src/main/resources`, se incluyó el archivo `provincias.json`.

### Desarrollo del Frontend
El frontend fue desarrollado con **PrimeFaces**, utilizando archivos `.xhtml` para la interfaz de usuario, ubicada en el directorio `webapp`. La funcionalidad principal incluye un **dropdown dinámico** para la selección de información.


