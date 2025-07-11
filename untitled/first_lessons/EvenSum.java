package untitled.first_lessons;
public class EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            if (i % 2 == 0) {
                sum += i; // добавляем к сумме только чётные числа
            }
            i++;
        } while(i <= 100);

        System.out.println("Сумма чётных чисел от 1 до 100: " + sum);
    }
}



















