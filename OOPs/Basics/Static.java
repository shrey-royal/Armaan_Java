class Student {
    int rollno;
    String name;
    static String college = "Harvard";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println("\nRollNo: " + rollno + "\nName: " + name + "\nCollege: " + college);
    }
}


public class Static {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Armaan");
        Student s2 = new Student(9, "Amelia");

        // Student.college = "Stanford";
        // System.out.println(Student.college);

        s1.display();
        s2.display();
    }
}
