# Aplicativo Web para la Selección de Localidades

Aplicación web para seleccionar códigos de parroquia, cantón y provincia, desarrollada con **Java 8**, **Maven** y **PrimeFaces**, y ejecutada en un servidor **WildFly**.

## Arquitectura del Proyecto
- **Estructura Maven**: Proyecto llamado `localidades`, con:
  - Código fuente: `src/main/java`
  - Recursos: `src/main/resources` (incluye `provincias.json`)
- **Componentes**:
  - Clases: `Cantón.java`, `Parroquia.java`, `Provincia.java`
  - Controladores, Servicios y Managed Bean para gestionar lógica y datos.
- **Frontend**: Interfaz `.xhtml` con **PrimeFaces**, incluyendo un dropdown dinámico.

## Problemas y Estado Actual
- **Errores JSON**: Problemas de serialización debido a diferencias en la estructura de datos.
- **Limitaciones de hardware**: Equipo lento impactó el desarrollo y pruebas.
- **Estado**: Código básico funcional, pero con pruebas y depuración pendientes.

El proyecto está disponible como base inicial para futuros desarrollos.
