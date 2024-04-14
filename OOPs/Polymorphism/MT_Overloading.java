class Adder {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static String add(String a, String b) {
        return a+b;
    }

    public static double add(double a, double b) {
        return a+b;
    }
}


public class MT_Overloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(2, 5));
        System.out.println(Adder.add(2, 5, 3));
        System.out.println(Adder.add("Armaan", "Ruby"));
        System.out.println(Adder.add(2.3, 6.7));

        // int a = 56;
        // System.out.println(((Object)a).getClass().getSimpleName());
    }
}

/*
Overloading is done in 2 different ways: 
1. by changing the number of parameters
2. by changing the datatype of parameters

Tasks:

Scenario 1: Calculator
In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.

Scenario 2: Messaging App
In a messaging application, implement method overloading for sending messages. Create different methods with different parameter combinations, such as sending a text message, sending an image message, and sending a video message.

Scenario 3: Payment Processing System
In a payment processing system, implement method overloading for processing payments. Create different methods with different parameter combinations, such as processing a credit card payment, processing a bank transfer, and processing a cash payment.

Scenario 4: Social Media Analytics
In a social media analytics system, implement method overloading for analyzing user engagement. Create different methods with different parameter types, such as analyzing engagement based on likes, analyzing engagement based on comments, and analyzing engagement based on shares.


*/