## Ejercicios de Programación Funcional en Kotlin 🚀

Este repositorio contiene una serie de ejercicios para practicar programación funcional en Kotlin. Aquí encontrarás ejemplos y desafíos con lambdas, funciones anónimas y funciones de orden superior.

### Funciones Lambda
1. **Suma de tres números:** Declara una lambda que acepte tres parámetros de tipo `Int` y devuelva su suma. Llama a esta función con los números 3, 7 y 12, e imprime el resultado.
2. **Multiplicación de cadenas:** Crea una lambda que tome una cadena (String) y un número entero como entrada, y repita la cadena ese número de veces. Prueba tu lambda con la cadena "Kotlin" y el número 3.
3. **Invertir cadenas:** Escribe una lambda que tome una cadena como entrada y devuelva la cadena invertida. Prueba la lambda con las cadenas "Funcional" y "Lambda".
5. **Calcular el área de un triángulo:** Define una lambda que reciba la base y la altura de un triángulo, y devuelva su área. Prueba la lambda con una base de 4 y una altura de 6.

### Funciones Anónimas
1. **Determinar impar:** Crea una función anónima que tome un número entero y devuelva `true` si es impar, o `false` en caso contrario. Usa esta función para verificar el número 11.
2. **Cubo de un número:** Define una función anónima que reciba un número entero y devuelva su cubo. Llama a esta función con el número 3.
3. **Comprobar positivo:** Crea una función anónima que reciba un número entero y devuelva `true` si es positivo, o `false` en caso contrario. Usa la función con los números -3, 0, y 5.
4. **Saludo formal:** Define una función anónima que reciba un nombre y un título como cadenas y devuelva un saludo formal (por ejemplo, "Buenos días, Dr. Juan"). Prueba con "Dra." y "Ana".
5. **Producto de un array:** Escribe una función anónima que tome un array de enteros y devuelva el producto de todos sus elementos. Prueba con el array `[1, 2, 3, 4]`.

### Funciones de Orden Superior
1. **Aplicar función personalizada:** Escribe una función de orden superior llamada `aplicarFuncion` que acepte un número entero y una función como parámetros. Usa esta función para aplicar una operación de resta y una de división utilizando lambdas.
2. **Crear divisor:** Define una función de orden superior llamada `crearDivisor` que reciba un número entero y devuelva una función que divida cualquier número por el entero recibido. Prueba con divisores de 2 y 4.
3. **Transformar lista:** Escribe una función de orden superior llamada `transformarLista` que reciba una lista de enteros y una función para transformar cada elemento. Prueba con transformaciones como restar 1 a cada número o calcular su valor absoluto.
4. **Filtrar lista personalizada:** Crea una función de orden superior llamada `filtrarLista` que reciba una lista de enteros y una función de filtro. Prueba con filtros como eliminar los números negativos o conservar solo los pares.
5. **Aplicar múltiples funciones:** Define una función de orden superior llamada `aplicarMultiplesFunciones` que reciba un número entero y una lista de funciones. Aplica todas las funciones al número y devuelve el resultado final.

