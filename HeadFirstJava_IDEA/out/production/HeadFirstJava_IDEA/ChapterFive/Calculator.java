package ChapterFive;

public class Calculator {
    int add(int x, int y){
        int sum = x + y;
        System.out.println("Sum: " + sum);
        return sum;

    }
    int subtract(int x, int y){
        int diff = x - y;
        System.out.println("Difference: " + diff);
        return diff;
    }
    int multiply(int x, int y) {
        int product = x * y;
        System.out.println("Product: " + product);
        return product;
    }
    int divide(int x, int y){
        int quotient = x / y;
        int remainder = x % y;
        if (remainder > 0){
            System.out.print("Quotient: " + quotient);
            System.out.println(", Remainder: " + remainder);
            return remainder;

        }
        System.out.println("Quotient: " + quotient);
        return quotient;

    }
}
