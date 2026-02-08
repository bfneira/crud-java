# CRUD Java

Aplicación **CRUD** en **Java 17** construida con **Spring Boot**, **Spring MVC** y **Spring Data JPA**. Incluye configuración por `application.properties`, logging con **Logback** y soporte para **Actuator** (si está habilitado).

## Requisitos

- Java 17 (JDK)
- Maven o Maven Wrapper (incluido en el proyecto)
- (Opcional) IntelliJ IDEA

## Stack / Tecnologías

- Java 17
- Spring Boot
- Spring MVC (REST)
- Spring Data JPA
- Jakarta EE (`jakarta.*`)
- Lombok
- Logback (`src/main/resources/logback.xml`)
- Actuator (monitoreo)

## Configuración

Archivo principal:

- `src/main/resources/application.properties`

Ahí normalmente se configura:

- Base de datos: `spring.datasource.url`, `spring.datasource.username`, `spring.datasource.password`
- JPA: `spring.jpa.*` (por ejemplo `spring.jpa.hibernate.ddl-auto`, `spring.jpa.show-sql`)
- Puerto (opcional): `server.port`

> Recomendación: no subas credenciales reales al repositorio. Usa placeholders o variables de entorno.

## Ejecutar la aplicación

### Usando Maven Wrapper (recomendado)

**Windows:**