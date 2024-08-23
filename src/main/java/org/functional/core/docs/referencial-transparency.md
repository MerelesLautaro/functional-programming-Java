# ¿Qué es la transparencia referencial?
Una función se denomina transparente referencial si siempre devuelve el mismo valor de resultado cuando se llama con el mismo valor de argumento.

Para la transparencia referencial, necesitamos que nuestra función sea pura e inmutable.

Ejemplo: El método 'String.replace()' es referencial transparente porque si 'shaurav.replace('s','S')' siempre producirá el mismo resultado porque el método 'replace' devuelve el nuevo objeto en lugar de actualizar el objeto original.

Una función pura es una expresión referencialmente transparente y una función pura debe devolver un valor basado en los argumentos pasados y no debe afectar ni depender del estado global.

### Ejemplo: A continuación se muestra el ejemplo de función pura

public static int sum(int a, int b){
return a + b;
}

Por lo tanto, esta función también es referencialmente transparente.

La transparencia referencial hace que cada subprograma sea independiente, lo que es muy útil a la hora de implementar pruebas unitarias y refactorización. Además, los programas de transparencia referencial son más fáciles de leer y entender, lo que también es una de las razones por las que la transparencia referencial es necesaria en la programación de funciones.

### Ejemplo: de una Función No Referencialmente Transparente:

public int obtenerNumeroAleatorio() {
return new Random().nextInt();
}

Esta función no es referencialmente transparente porque cada vez que la llamas, produce un valor diferente. No puedes reemplazar una llamada a obtenerNumeroAleatorio() con un valor constante sin cambiar el comportamiento del programa.



más información: https://blog.knoldus.com/referential-transparency-in-java-programming/