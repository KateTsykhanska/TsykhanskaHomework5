package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            Person person1 = new Man("John", 30, "Iнженер", PersonRole.ENGINEER);
            Person person2 = new Woman("Mary", 25, "Вчитель", PersonRole.TEACHER);
            Person person3 = new Man("", -35, "Лiкар", PersonRole.DOCTOR);

            person1.printPerson();
            person2.printPerson();
            person3.printPerson();


            person2.displayInformation();
            person3.displayInformation();

            person2.setAge(-10);
        } catch (PersonalDataException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}