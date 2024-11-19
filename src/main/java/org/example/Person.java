package org.example;

public class Person implements Displayable {
    String name;
    int age;
    String job;


    Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setJob(String job) {
        this.job = job;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getJob() {
        return job;
    }

    public void printPerson() {
        System.out.println("Iм'я: " + name + ", Вik: " + age + ", Професiя: " + job);
    }

    public void changeJob(String job) {
        this.job = job;
        System.out.println("Пiсля оновлення професії");
        System.out.println("Iм'я: " + this.name + ", Вik: " + this.age + ", Професiя: " + this.job);
    }


    @Override
    public void displayInformation() {
        System.out.print("Iм'я: " + name + ", Вik: " + age + ", Професiя: " + job);
    }
}
