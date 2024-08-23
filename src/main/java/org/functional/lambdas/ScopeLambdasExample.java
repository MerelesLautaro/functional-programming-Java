package org.functional.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Clase que demuestra el alcance de las variables en lambdas en Java.
 * Incluye ejemplos de acceso a variables locales, de instancia, estáticas,
 * y casos de sombreado de variables.
 */
public class ScopeLambdasExample {

    /**
     * Método principal que ejecuta los ejemplos de alcance de variables en lambdas.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        /*
         * Alcance de las Variables en Lambdas:
         * 1. Variables locales:
         *
         * Las lambdas pueden acceder a variables locales de su entorno de definición,
         * pero con una restricción: las variables deben ser efectivamente finales o marcadas explícitamente como final.
         * Esto significa que una vez que la variable ha sido asignada, no se puede cambiar su valor.
         *
         * Ejemplo:
         */

        int factor = 2;
        Function<Integer, Integer> multiplicar = (n) -> n * factor;

        // factor = 3; // Esto causará un error de compilación.

        /*
         * En este ejemplo, factor es una variable local accesible dentro de la lambda. Sin embargo, si intentas modificar
         * factor después de haber definido la lambda, el compilador generará un error.
         */
        crearLambda();

        /*
         * Sombras de variables:
         *
         * Las lambdas no pueden declarar parámetros o variables locales que tengan el mismo nombre que una variable en su
         * entorno envolvente. Este fenómeno se conoce como shadowing (sombreado).
         *
         * Ejemplo:
         */

        int valor = 10;
        // Consumer<Integer> consumidor = (valor) -> System.out.println(valor); // Error: sombra de la variable `valor`

        // Este código causaría un error porque `valor` dentro de la lambda intenta sombrear la variable `valor` externa.
    }

    /**
     * Variable estática que actúa como un multiplicador.
     */
    private static int multiplicador = 3;

    /**
     * Crea una lambda que multiplica un número por un multiplicador estático.
     *
     * @return Una función que toma un entero y lo multiplica por el valor de la variable estática multiplicador.
     */
    public static Function<Integer, Integer> crearLambda() {
        return (n) -> n * multiplicador;
    }
}