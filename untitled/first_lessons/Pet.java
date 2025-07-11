package untitled.first_lessons;
public class Pet {
    int id;
    String name;
    String type;
    double price;
    int ageRestriction;


    public Pet(int id, String name, String type, double price, int ageRestriction) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.ageRestriction = ageRestriction;
    }


    public void showPetInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Age Restriction: " + ageRestriction + "+");
        System.out.println("--------------------------");
    }


    public boolean checkAgeRestriction(int customerAge) {
        return customerAge >= ageRestriction;
    }


    public boolean isAffordable(double budget) {
        return budget >= price;
    }
}
