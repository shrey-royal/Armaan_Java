class Animal {
    String name, color;
    int age;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void PetDetails() {
        System.out.print("My animal's name is " + name + " and he's " + color + " in color. ");
    }
}

class Dog extends Animal {

    Dog(String name, String color, int age) {
        //super class' constructor will be called first in the child class' constructor
        super(name, color);
        super.age = age;
    }

    void ShowDog() {
        //invokes super class' method
        super.PetDetails();
        System.out.println(name + " is " + age + " years old.");
    }
}

public class SuperKW {
    public static void main(String[] args) {
        Dog d = new Dog("Toto", "white", 5);
        d.ShowDog();
    }
}

/*
Super Keyword is used to refer immediate parent class.

-> instance variable
-> method
-> constructor

Tasks:

> Polymorphism and super keyword: Create an array of Animal objects containing instances of Dog and Cat. Use a loop to call a method makeSound() for each object. Inside the overridden makeSound() method, use super to call the makeSound() method of the Animal class.

> Basic Inheritance: Create a Vehicle class with properties like make, model, and year. Extend this class to a Car class using the super keyword to inherit these properties and add specific features like numDoors and isConvertible.

> Constructor Chaining: Implement a Person class with properties name and age. Create a subclass Employee with properties like employeeId and department. Use super in the Employee constructor to invoke the Person constructor and initialize name and age.

Example:

Problem Statement: Employee Information System

Create a system to manage employee information using Java classes and inheritance. Implement a `Person` class that stores basic personal details and an `Emp` class that extends the `Person` class to include salary information.

The `Person` class contains:
- Properties: `id` (integer), `name` (String)
- Constructor: Initializes `id` and `name`

The `Emp` class inherits from `Person` and adds:
- Property: `salary` (float)
- Constructor: Initializes `id`, `name`, and `salary`

Implement the `display()` method in the `Emp` class to print the employee's information: ID, name, and salary.

In the `TestSuper5` class:
- Create an instance of `Emp` with ID `1`, name `"ankit"`, and a salary of `45000`.
- Display the details of this employee using the `display()` method.


*/