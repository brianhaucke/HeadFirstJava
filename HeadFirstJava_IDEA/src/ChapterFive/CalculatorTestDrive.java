package ChapterFive;


import java.util.Arrays;

public class CalculatorTestDrive {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(7,5);
        calc.subtract(17, 9);
        calc.multiply(5, 4);
        calc.divide(40, 8);
        System.out.println(Arrays.toString(calc.divideWithRemainder(17, 3)));
        calc.divideAgain(17, 3);
        calc.divide(17, -3);
        calc.add(6, 35);


    }
}
