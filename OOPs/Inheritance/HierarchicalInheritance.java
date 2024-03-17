class Drink {
    public void getDrinkName() {
        System.out.println("Generic Drink");
    }
}

class Coke extends Drink{
    public void getDrinkName() {
        System.out.println("Coke Drink");
    }
}

class Pepsi extends Drink {
    public void getDrinkName() {
        System.out.println("Pepsi Drink");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Drink d = new Drink();
        d.getDrinkName();
        Coke c = new Coke();
        c.getDrinkName();
        Pepsi p = new Pepsi();
        p.getDrinkName();
    }
}