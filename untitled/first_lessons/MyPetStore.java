package untitled.first_lessons;
import java.util.Scanner;

public class MyPetStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pet pet1 = new Pet(1, "Rex", "Dog", 100.0, 12);
        Pet pet2 = new Pet(2, "Mimi", "Cat", 70.0, 10);
        Pet pet3 = new Pet(3, "Bubbles", "Fish", 20.0, 5);


        Pet[] pets = {pet1, pet2, pet3};

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your budget: ");
        double budget = input.nextDouble();

        System.out.println("\n--- Pet List ---\n");

        for (Pet pet : pets) {
            pet.showPetInfo();

            if (pet.checkAgeRestriction(age)) {
                System.out.println("You are allowed to buy this pet.");
            } else {
                System.out.println("You are too young for this pet.");
            }

            if (pet.isAffordable(budget)) {
                System.out.println("You can afford this pet.");
            } else {
                System.out.println("Not enough money for this pet.");
            }

            System.out.println();
        }

        input.close();
    }
}