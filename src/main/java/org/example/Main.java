
    package org.example;

    public class Main {
        public static void main (String[] args) {
            Homework5_1 homework5_1 = new Homework5_1();
            homework5_1.checkAge(9);
            homework5_1.checkAge(10);
            homework5_1.checkAge(0);
            homework5_1.checkAge(99);
            homework5_1.checkAge(35);
            homework5_1.checkAge(25);

            System.out.println("Homework.isPerfectSquare (25): "+homework5_1.isPerfectSquare(25));
            System.out.println("Homework.isPerfectSquare (24): "+homework5_1.isPerfectSquare(24));

            Homework5_1.getGrade(5);
            Homework5_1.getGrade(1);
            Homework5_1.getGrade(-3);

        }
}
