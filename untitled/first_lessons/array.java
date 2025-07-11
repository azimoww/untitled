package untitled.first_lessons;

import java.util.Scanner;

public class array {
    class mein {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();
            System.out.print("Введите рост в метрах: ");
            double height = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Есть ли скидочная карта (да/нет)? ");
            boolean discountCard = scanner.nextLine().equalsIgnoreCase("да");
            System.out.print("Введите любимую букву алфавита: ");
            char favoriteLetter = scanner.nextLine().charAt(0);
            System.out.print("Введите количество покупок (1-3): ");
            int numPurchases = scanner.nextInt();
            double[] purchases = new double[3];
            double sum = 0;
            for (int i = 0; i < numPurchases; i++) {
                System.out.print("Введите стоимость покупки " + (i + 1) + ": ");
                purchases[i] = scanner.nextDouble();
                sum += purchases[i];
            }


            double finalSum = sum;
            if (discountCard) {
                finalSum *= 0.9;
            }

            String ageStatus;
            if (age < 12) {
                ageStatus = "Ребенок";
            } else if (age >= 12 && age <= 17) {
                ageStatus = "Подросток";
            } else if (age >= 18 && age <= 59) {
                ageStatus = "Взрослый";
            } else {
                ageStatus = "Пенсионер";
            }
            System.out.println("\nРезультат:");
            System.out.println("Приветствие: " + favoriteLetter);
            System.out.println("Имя: " + name);
            System.out.println("Возраст: " + age + " (" + ageStatus + ")");
            System.out.println("Рост: " + height + " м");
            System.out.println("Сумма покупок: " + sum);
            System.out.println("Финальная сумма со скидкой: " + finalSum);

            scanner.close();
        }
    }
}