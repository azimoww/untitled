package untitled.first_lessons;
public class Operator {
    public static void main(String[] args) {
        int[] numbers = {5, 10, -3};
        int sum = numbers[0] + numbers[1] + numbers[2];
        String comparison;
        if (numbers[0] > numbers[1]) {
            comparison = "Первое число больше второго.";
        } else {
            comparison = "Первое число не больше второго.";
        }
        String isNegative;
        if (numbers[2] < 0) {
            isNegative = "Третье число является отрицательным.";
        } else {
            isNegative = "Третье число не является отрицательным.";
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println(comparison);
        System.out.println(isNegative);
    }
}



