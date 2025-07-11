package untitled.first_lessons;

public class MainMain {
    public static void main(String[] args) {
        MathUnits mu = new MathUnits();

        int result = mu.add(5, 7);
        System.out.println("Sum: " + result);

        mu.mulpl(3, 4);
        printMyNumber(42);
    }

    static void printMyNumber(int my_number) {
        System.out.println(my_number);
        System.out.println(my_number);
        System.out.println(my_number);
    }
}

class MathUnits {
    int add(int a, int b) {
        return a + b;
    }

    void mulpl(int x, int y) {
        int product = x * y;
        System.out.println("Product: " + product);
    }
}

