import java.util.Scanner;

class Animal {
    //instance variables
    private String name;
    static String color;

    Animal() {
        color = "white";
    }

    //method
    String getName() {
        return (name+"\nColor: "+color);
    }

    void setName(String name) {
        this.name = name;
    }
}

public class Obejct_Class {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.setName("kangaroo");
        // System.out.println(animal.getName());

        Animal animal[] = new Animal[3];
        // System.out.println(animal.length);

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<animal.length; i++) {
            animal[i] = new Animal();
            System.out.print("Enter the name of any animal: ");
            animal[i].setName(sc.next());
        }

        for (Animal a : animal) System.out.println(a.getName());

        System.out.println("\n-> " + Animal.color);
    }
}


/*

There are 4 access modifiers:

1. public: accessible anywhere.
2. private: accessible only in the class.
3. protected: accessible in the class as well as the child classes.
4. default: package level access (folders)

Tasks:

1. Write a Java program to find the maximum and minimum value of an array.

2. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456
Expected Output :

All numbers are different

3. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order


*/