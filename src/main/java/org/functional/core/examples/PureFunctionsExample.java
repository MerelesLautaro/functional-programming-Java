package org.functional.core.examples;

import org.functional.immutable.Person;


/**
 * Ejemplos de funciones puras usando la clase {@link Person}.
 * Cada una de estas funciones cumple con las características de una función pura:
 * <ul>
 *     <li><strong>Determinística:</strong> El resultado es completamente determinado por los parámetros de entrada.</li>
 *     <li><strong>Sin efectos secundarios:</strong> No modifica ningún estado externo ni el estado del objeto {@link Person}.</li>
 * </ul>
 */
public class PureFunctionsExample {

    public static void main(String[] args) {
        // Objeto Inmutable
        Person person = new Person("Lautaro", 23);

        System.out.println(createGreeting(person));
    }

    public static String getNameInUpperCase(Person person) {
        return person.getName().toUpperCase();
    }

    public boolean isAdult(Person person) {
        return person.getAge() >= 18;
    }

    public static String createGreeting(Person person) {
        return "Hello, " + person.getName() + "!";
    }

    public boolean hasShortName(Person person) {
        return person.getName().length() < 5;
    }
}
