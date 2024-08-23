Fuente de los siguientes conceptos:
https://aprenderjava.net/base/guia-de-expresiones-lambda-en-java-8-todo-lo-que-necesitas-saber/

Se recomienda leer el blog para mayor información, todos los creditos al autor.

# ¿Qué es una expresión lambda?
Una expresión lambda es una función anónima que se puede utilizar para implementar 
una interfaz funcional con un solo método abstracto. En otras palabras, 
una expresión lambda es una forma compacta de representar una función, 
sin necesidad de escribir una clase anónima completa.

# Características de las expresiones lambda en Java 8

Son funciones anónimas: no tienen un nombre específico.
Son funciones de una sola línea: se pueden escribir en una sola línea de código.
Se pueden utilizar en contextos donde se requiere una interfaz funcional.
Pueden capturar variables locales y de instancia de manera implícita.

# Sintaxis de las expresiones lambda

La sintaxis básica de una expresión lambda consta de tres partes:

Lista de parámetros de entrada entre paréntesis.
Una flecha “->” que separa los parámetros de entrada del cuerpo de la función.
El cuerpo de la función, que puede ser una expresión o un bloque de código.

# Lambdas y Scope
Las expresiones lambda en Java tienen reglas específicas sobre el alcance (scope)
de las variables que pueden acceder dentro de su cuerpo. Estas reglas determinan qué variables están disponibles 
para su uso en la lambda y cómo pueden ser manipuladas.
0
#### Mirar el archivo lambdas/ScopeLambdasExample.Java para ejemplos.

# Métodos de Referencia (Method References)
Los métodos de referencia en Java son una forma más concisa de expresar una expresión lambda que llama a un método existente. 
En lugar de escribir una lambda que simplemente invoca un método, puedes referenciar ese método directamente 
usando la sintaxis Class::method.

# Ventajas de los Métodos de Referencia:
Legibilidad: Los métodos de referencia son más concisos y legibles que las lambdas cuando solo se necesita invocar un método existente.
Reutilización de código: Permiten reutilizar métodos existentes sin la necesidad de envolverlos en una lambda.

#### Mirar el archivo lambdas/MethodReferencesExample.Java para ejemplos.