Respuestas a las preguntas del deber
1. ¿En qué parte del ejercicio se aplica IoC y en cuál DI?
IoC se aplica en que nunca se usa `new` para crear `VentaService`, `DescuentoRegular`, `DescuentoVIP` ni `Auditoria`: el contenedor ArC de Quarkus los crea, los administra y decide cuándo destruirlos.
DI se aplica en `VentaService`, donde el contenedor entrega sus dependencias

2. ¿Qué función cumplen los Qualifiers y por qué son necesarios?
Un Qualifier permite al contenedor distinguir entre varias implementaciones del mismo tipo.

3. ¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?
`@ApplicationScoped` crea una única instancia para toda la aplicación, que se comparte entre todos los puntos de inyección (se accede mediante un proxy). `@Dependent` no comparte nada: cada punto de inyección recibe una instancia nueva, cuyo ciclo de vida depende del objeto que la recibe.

4. ¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?
Porque el contenedor mantiene una sola instancia durante toda la ejecución de la aplicación.

5. ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?
Habría dos beans candidatos (`DescuentoRegular` y `DescuentoVIP`) para el mismo tipo y el contenedor no podría decidir cuál inyectar. 