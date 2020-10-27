package cn.apprendre.one;

/**
 * @author JayHoo
 */
public class Person {
    private String gender;

    private Person() {}

    private static Person person = new Person();

    public Person getPerson() {
        return person;
    }
}
