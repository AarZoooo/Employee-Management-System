/*
 * This class is the blueprint of every employee data stored in the system.
 * This class also provides methods to write data into storage and read data from storage.
 */

 import java.util.Scanner;

public class Employee {

    //Data variables

    int id;
    String name;
    String designation;
    char gender;
    double salary;
    String address;
    long contact;


    //Constructors

    public Employee() {
        
    }

    public Employee(int id, String name, String designation, char gender, double salary, String address, long contact) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
        this.address = address;
        this.contact = contact;
    }


    //Methods
    
    public static void printAllData() {
        Data.printAllData();
    }

    public static void addData() {
        Scanner sc = new Scanner(System.in);

        Employee newEmployee = new Employee();

        System.out.println("Enter New Employee details---");

        System.out.print("ID: ");
        newEmployee.id = sc.nextInt();
        sc.nextLine();

        System.out.print("NAME: ");
        newEmployee.name = sc.nextLine();

        System.out.print("DESIGNATION: ");
        newEmployee.designation = sc.nextLine();

        System.out.print("GENDER: ");
        newEmployee.gender = sc.next().charAt(0);

        System.out.print("SALARY: ");
        newEmployee.salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("ADDRESS: ");
        newEmployee.address = sc.nextLine();

        System.out.print("CONTACT: ");
        newEmployee.contact = sc.nextLong();
        sc.nextLine();
        
        Data.addData(newEmployee);

        System.out.println("\nEmployee data added.\n");

        sc.close();
    }

    public static void searchData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Data.searchData(id);

        sc.close();
    }

    public static void updateData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        if (Data.searchData(id)) {
            Employee newEmployee = new Employee();

            System.out.println("Enter New Employee details---");

            newEmployee.id = id;

            System.out.print("NAME: ");
            newEmployee.name = sc.nextLine();

            System.out.print("DESIGNATION: ");
            newEmployee.designation = sc.nextLine();

            System.out.print("GENDER: ");
            newEmployee.gender = sc.next().charAt(0);

            System.out.print("SALARY: ");
            newEmployee.salary = sc.nextDouble();

            System.out.print("ADDRESS: ");
            newEmployee.address = sc.nextLine();

            System.out.print("CONTACT: ");
            newEmployee.contact = sc.nextLong();
            
            Data.updateData(id, newEmployee);

            System.out.println("\nEmployee data updated.\n");
        }

        sc.close();
    }

    public static void deleteData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        if (Data.searchData(id)) {

            Data.deleteData(id);

            System.out.println("\nEmployee data deleted.\n");
        }

        sc.close();
    }
}
