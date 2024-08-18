package org.principal.functionalprogramming.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class sandbox {

    public static void main(String[] args){
        // Objeto Inmutable
        List<Person> people = Arrays.asList(
                new Person("Lautaro",23),
                new Person("Clauida",25),
                new Person("Jose",33),
                new Person("Milei",45)
        );

        // Lambda ("->") // Función pura.
        Predicate<Person> isOver25 = person -> person.getAge() > 25;

        // Función de orden superior
        List<Person> over25 = filterPeople(people,isOver25);
        over25.forEach(person -> System.out.println(person.toString()));

        List<Person> personImmutable = Collections.unmodifiableList(people);

        try {
            personImmutable.add(new Person("Luis",55));
        } catch (Exception ex){
            System.out.println("Error class Person is immutable "+ex);
        }

    }

    private static List<Person> filterPeople(List<Person> people, Predicate<Person> isOver25){
        return people.stream()
                .filter(isOver25).collect(Collectors.toList());
    }
}
