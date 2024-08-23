package org.functional.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Esta clase demuestra el uso de métodos de referencia en Java.
 * Los métodos de referencia son una forma más concisa de expresar expresiones lambda
 * que simplemente invocan un método existente.
 */
public class MethodReferencesExample {

    /**
     * Método principal que muestra varios ejemplos de métodos de referencia.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {

        /*
         * 1. Referencia a un método estático:
         *
         * Este método de referencia llama al método estático Integer::parseInt,
         * que convierte una cadena en un entero.
         *
         * Sintaxis: ClassName::staticMethodName
         */
        Function<String, Integer> convertir = Integer::parseInt;

        // Este método de referencia es equivalente a la lambda (s) -> Integer.parseInt(s).

        /*
         * 2. Referencia a un método de instancia de un objeto particular:
         *
         * Este método de referencia llama al método de instancia length() en un objeto particular
         * de la clase String, en este caso, la variable 'texto'.
         *
         * Sintaxis: instance::methodName
         */
        String texto = "Hola, Mundo";
        Supplier<Integer> longitud = texto::length;

        // Este método de referencia es equivalente a la lambda () -> texto.length().

        /*
         * 3. Referencia a un método de instancia de un objeto arbitrario de un tipo particular:
         *
         * Este método de referencia llama al método toUpperCase() en un objeto de la clase String.
         *
         * Sintaxis: ClassName::instanceMethodName
         */
        Function<String, String> aMayusculas = String::toUpperCase;

        // Este método de referencia es equivalente a la lambda (s) -> s.toUpperCase().

        /*
         * 4. Referencia a un constructor:
         *
         * Este método de referencia llama al constructor de la clase ArrayList
         * para crear una nueva instancia de ArrayList.
         *
         * Sintaxis: ClassName::new
         */
        Supplier<List<String>> proveedorLista = ArrayList::new;

        // Este método de referencia es equivalente a la lambda () -> new ArrayList<>().
    }
}