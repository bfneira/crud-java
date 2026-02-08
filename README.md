# CRUD Java

Aplicación **CRUD** desarrollada en **Java 17** utilizando **Spring Boot**, **Spring MVC** y **Spring Data JPA**.  
El proyecto expone una **API REST** con operaciones básicas de creación, lectura, actualización y eliminación de registros.

Incluye configuración mediante `application.properties`, logging con **Logback** y soporte para **Spring Boot Actuator**.

---

## Requisitos

- ☕ **Java 17 (JDK)**
- 📦 **Maven** o **Maven Wrapper** (incluido en el proyecto)
- 💻 (Opcional) IntelliJ IDEA / Eclipse / VS Code

---

## Stack / Tecnologías

- Java 17
- Spring Boot
- Spring MVC (REST)
- Spring Data JPA
- Jakarta EE (`jakarta.*`)
- Lombok
- Logback (`src/main/resources/logback.xml`)
- Spring Boot Actuator
- Maven

---

## Configuración

Archivo principal de configuración:

```
src/main/resources/application.properties
```

Parámetros comunes:

- **Base de datos**
    - `spring.datasource.url`
    - `spring.datasource.username`
    - `spring.datasource.password`
- **JPA / Hibernate**
    - `spring.jpa.hibernate.ddl-auto`
    - `spring.jpa.show-sql`
- **Servidor**
    - `server.port` (opcional)
- **Logging**
    - `logging.file.name`

> ⚠️ Recomendación:  
> No subas credenciales reales al repositorio.  
> Usa variables de entorno o valores de ejemplo.

---

## Ejecutar la aplicación

### Usando Maven Wrapper (recomendado)

#### Linux / macOS
```bash
./mvnw clean spring-boot:run
```

#### Windows
```bash
mvnw.cmd clean spring-boot:run
```

La aplicación quedará disponible por defecto en:

```
http://localhost:8080
```

---

## Endpoints (plantilla)

Sustituye `<recurso>` por el nombre real  
(ejemplo: `autores`, `clientes`, `productos`):

- `GET    /api/<recurso>` — listar
- `GET    /api/<recurso>/{id}` — obtener por id
- `POST   /api/<recurso>` — crear
- `PUT    /api/<recurso>/{id}` — actualizar
- `DELETE /api/<recurso>/{id}` — eliminar

---

## Actuator

Si Actuator está habilitado y expuesto en configuración:

- `GET /actuator/health` — estado de la aplicación
- `GET /actuator/info` — información general
- `GET /actuator/logfile` — archivo de logs (si está configurado)

> En ambientes productivos se recomienda restringir el acceso a estos endpoints.

---

## Logging

El proyecto utiliza **Logback**.

Archivo de configuración:

```
src/main/resources/logback.xml
```

Archivo de logs (si está configurado):

```
logs/app.log
```

---

## Tests

Para ejecutar las pruebas:

```bash
./mvnw test
```

Las pruebas se encuentran en:

```
src/test/java
```

---

## Estructura del proyecto

```
src/
 ├─ main/
 │   ├─ java/          # Código fuente
 │   └─ resources/     # Configuración (properties, logback, etc.)
 └─ test/              # Pruebas automatizadas

pom.xml                # Dependencias y configuración Maven
```

---

## Control de versiones

El proyecto incluye:

- `.gitignore`
- `.gitattributes`
- Maven Wrapper (`.mvn`, `mvnw`, `mvnw.cmd`)

Esto asegura builds reproducibles en cualquier entorno.

---

## Licencia

Uso interno / educativo.
