class Country {
    private String name;
    private String continent;
    private String capital;

    public Country(String name, String continent, String capital) {
        this.name = name;
        this.continent = continent;
        this.capital = capital;
    }

    public void display() {
        System.out.println("Country Name: " + this.name);
        System.out.println("Continent: " + this.continent);
        System.out.println("Capital: " + this.capital);
    }
}

class State extends Country {
    private String name;
    private String president;

    public State(String name, String countryName, String continent, String capital, String president) {
        //super keyword is used to call parent class' variables, constructors and methods
        super(countryName, continent, capital); //calling the parent class' constructor
        this.name = name;
        this.president = president;
    }

    public void display() {
        super.display();    //calling parent  class' display method
        System.out.println("State Name: " + this.name);
        System.out.println("President: " + this.president);
    }
}

public class Single {
    public static void main(String[] args) {
        State harrow = new State("Harrow", "England", "Europe", "London", "Rishi Sunak");

        harrow.display();
    }
}
