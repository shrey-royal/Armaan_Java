class Address {
    private String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void display() {
        System.out.println("City: " + city + "\nState: " + state + "\nCountry: " + country);
    }
}

class Employee {
    private int id;
    private String name;
    private float salary;
    private Address address;    //object

    public Employee(int id, String name, float salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void display() {
        System.out.println("Id: " + id + "\nName: " + name + "\nSalary: " + salary);
        address.display();
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address add = new Address("Gandhinagar", "Gujarat", "India");
        Employee e = new Employee(1, "Armaan", 500000, add);
        e.display();
    }
}

/*
When you pass another class' object as a parameter into the current class then it is called aggregation.
Employee - Address

Aggregation TASKS:
Scenario 1: Library Catalog System
Design a library catalog system where a library has multiple books. The library class contains a list of book objects, representing an aggregation relationship.

Scenario 2: University Department Management
Create a university department management system where a department consists of multiple faculty members. The department class contains a list of faculty objects, representing an aggregation relationship.

Scenario 3: Employee Payroll System
Develop an employee payroll system where an organization has multiple employees. The organization class contains a list of employee objects, representing an aggregation relationship.

Scenario 4: Online Shopping Cart
Design an online shopping cart system where a shopping cart contains multiple items. The shopping cart class contains a list of item objects, representing an aggregation relationship.

Scenario 5: School Course Enrollment
Create a school course enrollment system where a student can enroll in multiple courses. The student class contains a list of course objects, representing an aggregation relationship.

Scenario 6: Music Playlist Creation
Develop a music playlist system where a playlist consists of multiple songs. The playlist class contains a list of song objects, representing an aggregation relationship.

Scenario 7: Social Media User Connections
Design a social media system where a user can have multiple connections or friends. The user class contains a list of user objects, representing an aggregation relationship.

Scenario 8: Travel Itinerary Planner
Create a travel itinerary planning system where a trip consists of multiple destinations. The trip class contains a list of destination objects, representing an aggregation relationship.

Scenario 9: Movie Streaming Service
Develop a movie streaming service where a user can have multiple favorite movies. The user class contains a list of movie objects, representing an aggregation relationship.

Scenario 10: Bank Customer Account Management
Design a bank account management system where a customer can have multiple bank accounts. The customer class contains a list of account objects, representing an aggregation relationship.

*/