// Person class
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor to initialize Person data members
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class inheriting Person class
class Employee extends Person {
    int empid;
    String companyName;
    String qualification;
    double salary;

    // Constructor to initialize Employee data members
    public Employee(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary) {
        super(name, gender, address, age);  // Calling Person constructor
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class inheriting Employee class
class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    // Constructor to initialize Teacher data members
    public Teacher(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empid, companyName, qualification, salary);  // Calling Employee constructor
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display teacher details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Empid: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("-----------------------------------");
    }
}

// TeacherDetails class to test the system
public class TeacherDetails {
    public static void main(String[] args) {
        // Creating an array of Teacher objects
        Teacher[] teachers = new Teacher[2];

        // Initializing Teacher objects
        teachers[0] = new Teacher("Joy", "Male", "Joy Home,Tvm", 42, 431, "HSS Kollam", "MCA", 72000, "Computer", "Science", 201);
        teachers[1] = new Teacher("Riya", "Female", "Riyas Home", 30, 672, "Public School", "M.Tech", 90000, "Math", "Science", 978);

        // Displaying details of each teacher
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}
