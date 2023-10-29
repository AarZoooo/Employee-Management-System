/*
 * This class is the blueprint of every employee data stored in the system.
 * This class also provides methods to write data into storage and read data from storage.
 */

public class Employee {

    //Data variables
    int id;
    String name;
    Designation designation;
    char gender;
    double salary;
    String address;

    //Constructors
    public Employee(int id, String name, Designation designation, char gender, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
        this.address = address;
    }

    
}