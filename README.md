# xcaleChallenge


### Base de datos

- Para la BBDD se utilizo una H2 embedida. Esta se puede consultar de manera local mediante la url `http://localhost:8080/h2-console/`.
- Las credenciales son
```
user: sa
passoword: password
```
- la BBDD cuenta con un archivo `import.sql` el cual inserta datos iniciales para su uso

### Documentacion
- La documentacion de la API se hizo con `swagger`, el cual se puede acceder mediante la url `http://localhost:8080/swagger-ui.html`
- En el swagger se pueden probar los endpoints.
- Algunas secciones del codigo que se consideran relevante incluyen `javadoc`
- Teniendo en cuenta la BBDD embebida, la data inicial y el swagger se puede usar la aplicacion solamente clonando el repositorio y con JDK 11.
- El challenge esta desarrollado con java 11.

### Testing

- el proyecto cuenta con test unitario con `junit5` y `mockito`

### API
- La API cuenta con un `manejador de excepciones` (controller advice) para cuando se quieren lanzar por validacion de datos.
- el mapeo objeto-relacional (ORM) se hizo con `hibernate`
- Se manejan `DTO` para los `request` y `response` que manejan los controladores y un `mapper` manual para su conversion a entidad y viceversa
  - en este caso se podria haber utilizado liberias como `mapstruct` o `modelmapper` para su facilitacion
- Se utilizo Spring boot 2.5.2 como framework global
