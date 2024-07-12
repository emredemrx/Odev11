package org.example;

public class Main {
    public static void main(String[] args) {
        SingletonDatabase singletonDatabase = SingletonDatabase.getInstance();
        singletonDatabase.showMessage("Database'e bağlanıldı");

        Person person = Person.PersonBuilder.aPerson()
                .withPersonİd(46546)
                .withIsim("emre")
                .withSoyIsim("veli")
                .withMaas(45555.0).build();
        System.out.println(person.toString());

    }
}