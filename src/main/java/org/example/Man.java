package org.example;

public class Man extends Person implements Displayable {
    PersonRole personRole;

    public static final String sex = "Male";

    Man(String name, int age, String job) throws PersonalDataException {
        super(name, age, job);
    }

    Man(String name, int age, String job, PersonRole personRole) throws PersonalDataException {
        this(name, age, job);
        this.personRole = personRole;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(", Стать: " + sex + " Професiя: " + personRole);

    }
    @Override
    public void abstract1() {
        System.out.println("abstract class");
    }
}
