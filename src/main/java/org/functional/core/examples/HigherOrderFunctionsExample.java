package org.functional.core.examples;

import org.functional.immutable.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Ejemplos de funciones de orden superior usando la clase {@link Person}.
 * <p> En estos ejemplos se utilizan Lambdas y Stream se recomienda leer acerca de esto antes de continuar.</p>
 */

public class HigherOrderFunctionsExample {

    public static void main(String[] args){
       // Objeto inmutable
        List<Person> people = List.of(
                new Person("Lautaro", 23),
                new Person("Ana", 17),
                new Person("Luis", 20)
        );

        // Filtrar personas mayores de 18 años
        List<Person> adults = filterPeople(people, person -> person.getAge() >= 18);
        adults.forEach(System.out::println); // Output: Person{name='Lautaro', age=23} Person{name='Luis', age=20}

        Function<Person, String> getName = Person::getName;
        Function<String, String> toUpperCase = String::toUpperCase;

        // Componer funciones para obtener el nombre en mayúsculas
        Function<Person, String> getNameInUpperCase = composeFunctions(getName, toUpperCase);

        Person person = new Person("Lucas",33);
        System.out.println(getNameInUpperCase.apply(person)); // Output: LUCAS

        // Aplicar una función que convierte el nombre a mayúsculas
        String upperCaseName = applyFunctionToName(person, String::toUpperCase);
        System.out.println(upperCaseName); // Output: LUCAS

        // Aplicar una función que crea un saludo
        String greeting = applyFunctionToName(person, name -> "Hello, " + name + "!");
        System.out.println(greeting); // Output: Hello, Lucas!

        /*
        List<Person> people = List.of(
                new Person("Lautaro", 23),
                new Person("Ana", 17)
        );

        // Aplicar una función que incrementa la edad de cada persona
        List<Person> olderPeople = mapPeople(people, person -> new Person(person.getName(), person.getAge() + 1));
        olderPeople.forEach(System.out::println); // Output: Person{name='Lautaro', age=24} Person{name='Ana', age=18}
        */
    }

    /**
     * Aplica una función al nombre de la persona.
     *
     * @param person El objeto {@link Person} cuyo nombre se va a modificar.
     * @param function Una función que toma un {@code String} y devuelve un {@code String}.
     * @return El resultado de aplicar la función al nombre de la persona.
     *
     */
    public static String applyFunctionToName(Person person, Function<String, String> function) {
        return function.apply(person.getName());
    }

    /**
     * Filtra una lista de personas usando un predicado.
     *
     * @param people La lista de objetos {@link Person} a filtrar.
     * @param predicate Un predicado que toma un {@link Person} y devuelve un {@code boolean}.
     * @return Una lista de personas que cumplen con el predicado.
     */
    public static List<Person> filterPeople(List<Person> people, Predicate<Person> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    /**
     * Aplica una función a cada persona en una lista.
     *
     * @param people La lista de objetos {@link Person} a modificar.
     * @param function Una función que toma un {@link Person} y devuelve otro {@link Person}.
     * @return Una lista de personas modificadas por la función.
     */
    public static List<Person> mapPeople(List<Person> people, Function<Person, Person> function) {
        return people.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    /**
     * Compone dos funciones.
     *
     * @param <T> El tipo de entrada para la primera función.
     * @param <R> El tipo de salida de la segunda función.
     * @param first La primera función.
     * @param second La segunda función.
     * @return Una nueva función que es la composición de {@code first} y {@code second}.
     */
    public static <T, R> Function<T, R> composeFunctions(Function<T, ? extends R> first, Function<? super R, ? extends R> second) {
        return first.andThen(second);
    }
}
