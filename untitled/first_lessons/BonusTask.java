package untitled.first_lessons;
import java.util.Scanner;
public class BonusTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        int[] grades = new int[3];

        System.out.print("Введите оценку 1: ");
        grades[0] = scanner.nextInt();

        System.out.print("Введите оценку 2: ");
        grades[1] = scanner.nextInt();

        System.out.print("Введите оценку 3: ");
        grades[2] = scanner.nextInt();

        double average = (grades[0] + grades[1] + grades[2]) / 3.0;

        String mark;
        if (average >= 90) {
            mark = "A";
        } else if (average >= 75) {
            mark = "B";
        } else if (average >= 60) {
            mark = "C";
        } else {
            mark = "F";
        }

        String comment;
        switch (mark) {
            case "A":
                comment = "Отлично!";
                break;
            case "B":
                comment = "Хорошо!";
                break;
            case "C":
                comment = "Удовлетворительно.";
                break;
            case "F":
                comment = "Нужно постараться.";
                break;
            default:
                comment = "Нет комментария.";
        }

        System.out.println("Привет, " + name + "! Твоя средняя оценка: " + average);
        System.out.println("Оценка: " + mark);
        System.out.println("Комментарий: " + comment);

        scanner.close();
    }
}