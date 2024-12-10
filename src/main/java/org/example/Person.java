package org.example;

public abstract class Person implements Displayable {
    private String name;
    private int age;
    private String job;


    Person(String name, int age, String job) throws PersonalDataException {

        this.setName(name);
        this.setAge(age);
        this.job = job;
    }

    void setName(String name) throws PersonalDataException {
        if(name == null || name.isBlank()) throw new PersonalDataException("Name field is empty");
        this.name = name;
    }

    void setAge(int age) throws PersonalDataException {
        if(age<0) throw new PersonalDataException("Age is negative");
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
    public abstract void abstract1();
}
