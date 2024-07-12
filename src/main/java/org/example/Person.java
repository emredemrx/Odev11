package org.example;

public class Person {
    private int personİd;
    private String isim;
    private String soyIsim;
    private double maas;

    public Person() {}

    static  class PersonBuilder{
        private int personİd;
        private String isim;
        private String soyIsim;
        private double maas;

        public PersonBuilder() {}

        public static PersonBuilder aPerson(){
            return new PersonBuilder();
        }

        public PersonBuilder withPersonİd(int personİd) {
            this.personİd = personİd;
            return this;
        }

        public PersonBuilder withIsim(String isim) {
            this.isim = isim;
            return this;
        }

        public PersonBuilder withSoyIsim(String soyIsim) {
            this.soyIsim = soyIsim;
            return this;
        }

        public PersonBuilder withMaas(double maas) {
            this.maas = maas;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.personİd = this.personİd;
            person.isim = this.isim;
            person.soyIsim = this.soyIsim;
            person.maas = this.maas;
            return person;
        }
    }
    @Override
    public String toString() {
        return "Personel " + "ismi= " + isim + " " + soyIsim + " maası= " + maas;
    }
}
