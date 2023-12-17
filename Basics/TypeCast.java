public class TypeCast {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // implicit typecasting
        System.out.println(a);
        System.out.println(b);

        double c = 10.5;
        int d = (int) c; // explicit typecasting
        System.out.println(c);
        System.out.println(d);
    }
}
/*
Typecasting in java refers to process of converting a variable from one datatype to another. It's done when you want to treat a variable as a different type temporarily.

we have 2 types of typecasting:
1. Implicit typecasting (widening) -> done automatically by compiler ->converts smaller datatype to larger datatype

2. Explicit typecasting (narrowing) -> done manually by programmer -> converts larger datatype to smaller datatype

byte -> short -> int -> long -> float -> double : widening
double -> float -> long -> int -> short -> byte : narrowing

String password = "abcd";

char c = new char[password.length()];
c = password.tocharArray();

*/