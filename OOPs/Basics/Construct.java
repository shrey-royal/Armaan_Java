class Animal {
    Animal() {
        System.out.println("Default Constructor");
    }
}

class Dog {
    Dog(String name) {
        System.out.println("Parameterized Constructor");
    }
}

public class Construct {
    public static void main(String[] args) {
        Animal a1;  //declaration of object
        Animal a = new Animal();
        Dog d = new Dog("Ragnar");
    }
}