import java.util.Scanner;

class Car {
    private String make, model, color;

    Car() {
        this.make = null;
        this.model = null;
        this.color = null;
    }

    void scanCars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter make: ");
        this.make = sc.nextLine();
        System.out.print("\nEnter model: ");
        this.model = sc.nextLine();
        System.out.print("\nEnter color: ");
        this.color = sc.nextLine();

        sc.close();
    }

    void display() {
        System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nColor: " + this.color);
    }

}

public class ThisKW {
    public static void main(String[] args) {
        Car c = new Car();
        c.scanCars();
        c.display();
    }
}

/*
This Keyword: It is used to refer current class' instance variable
*/