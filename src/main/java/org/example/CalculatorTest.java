
package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @Test(description = "Перевірка додавання двох чисел", priority = 1)
    public void testAddition() {
        double result = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);
        Assert.assertEquals(result, 8.0, "Результат додавання некоректний!");
    }

    @Test(description = "Перевірка віднімання двох чисел", priority = 2)
    public void testSubtraction() {
        double result = calculator.subtract(5, 3);
        System.out.println("5 - 3 = " + result);
        Assert.assertEquals(result, 2.0, "Результат віднімання некоректний!");
    }

    @Test(description = "Перевірка множення двох чисел", priority = 3)
    public void testMultiplication() {
        double result = calculator.multiply(5, 3);
        System.out.println("5 * 3 = " + result);
        Assert.assertEquals(result, 15.0, "Результат множення некоректний!");
    }

    @Test(description = "Перевірка ділення двох чисел", priority = 4)
    public void testDivision() {
        double result = calculator.divide(6, 3);
        System.out.println("6 / 3 = " + result);
        Assert.assertEquals(result, 2.0, "Результат ділення некоректний!");
    }

    @Test(description = "Перевірка ділення на нуль", expectedExceptions = ArithmeticException.class, priority = 5)
    public void testDivisionByZero() {
        calculator.divide(5, 0);
    }
}
