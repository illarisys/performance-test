Recomendaciones.

1. Eliminar variables que no son usadas en el desarrollo. Por ejemplo, private boolean initialized;.
2. Para la conexión a la base de datos no se especificó el uso del driver. Para esta prueba se ha realizado la conexión al motor Maria DB.
3. Falta de manejo de excepciones en los métodos.
4. El código no es de fácil escalabilidad y un poco dificultoso de entender.
5. La variable l en String l = null, no tiene uso.
6. Se ha manejado una clase para los atributos de la conexión a la BD.
7. Se ha creado una clase específica para realizar la lógica de conexión a la BD.
8. Se eliminó la variable local t (int t = 0;), y se ha realizado el uso de la clase especial Enum, donde se declara los tipos de mensajes.
9. Se ha realizado el uso de la libreria de java commons utils (StringUtils) para validar que el parámetro message tenga valor alguno y se reduzca el código.
10. Se ha creado clases independientes por cada tipo de salida del mensaje con la finalidad de hacerlo más escalable.
11. Se ha creado métodos independientes por cada tipo de mensaje con la finalidad de evitar la sobre carga de constructores en las clases.

Recomendaciones.
