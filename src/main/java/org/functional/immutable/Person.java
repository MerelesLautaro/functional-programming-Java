package org.functional.immutable;

public class Person {
    /**
     * La clase {@code Person} es un ejemplo de una clase inmutable en Java.
     *
     * <p>¿Qué es la inmutabilidad?</p>
     * En el contexto de la programación, una variable es inmutable cuando su valor no se puede modificar.
     * Un objeto es inmutable cuando su estado no puede ser actualizado después de su creación.
     *
     * <p>¿Para qué se usan las clases inmutables?</p>
     * Las clases inmutables son útiles en varios contextos, tales como:
     * <ul>
     *     <li>Garantizar que el objeto no pueda ser modificado después de su creación.</li>
     *     <li>Prevenir problemas relacionados con la herencia y la modificación inesperada del estado.</li>
     *     <li>Crear objetos seguros en entornos concurrentes sin necesidad de sincronización adicional.</li>
     * </ul>
     *
     * <p>¿Cómo crear una clase inmutable?</p>
     * Para que una clase sea inmutable en Java, debe seguir estos principios:
     * <ul>
     *     <li>Declarar la clase como {@code final} para evitar la herencia.</li>
     *     <li>Declarar todos los campos como {@code private} y {@code final}.</li>
     *     <li>No proporcionar métodos que modifiquen el estado del objeto.</li>
     *     <li>Inicializar todos los campos a través del constructor y solo permitir el acceso a través de métodos de lectura.</li>
     * </ul>
     *
     * <p>Ejemplo:</p>
     * <pre>
     * {@code
     * Person person = new Person("John Doe", 30);
     * System.out.println(person.getName()); // Output: John Doe
     * System.out.println(person.getAge());  // Output: 30
     * }
     * </pre>
     *
     * <p>Fuentes:</p>
     *  <ul>
     *      <li><a href="https://www.genbeta.com/desarrollo/entendiendo-la-inmutabilidad-que-es-para-que-sirve-y-como-usarla">Entendiendo la inmutabilidad</a></li>
     *       <li><a href="https://www.codigohabil.com/posts/mutabilidad-e-inmutabilidad-en-java">Mutabilidad e inmutabilidad en Java</a></li>
     *  </ul>
     *
     * @since 1.0
     */
    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
