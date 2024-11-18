package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Iнженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лiкар");

        person1.printPerson();
        person2.printPerson();
        person3.printPerson();

        person3.changeJob("Alice", 28, "Дизайнер");

    }
}