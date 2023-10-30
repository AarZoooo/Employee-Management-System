/*
 * This class is the blueprint of every employee data stored in the system.
 * This class also provides methods to write data into storage and read data from storage.
 */

import java.io.File;
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
        try {
            File readerFile = new File("../data/employee.txt");
            Scanner reader = new Scanner(readerFile);
            int count = 1;

            while (reader.hasNextLine()) {

                String lineOfData = reader.nextLine();
                String[] dataArray = lineOfData.split(",");

                System.out.println("\nEmployee " + count + "\n-----------");
                System.out.println("Employee ID: " + dataArray[0]);
                System.out.println("Employee NAME: " + dataArray[1]);
                System.out.println("Employee DESIGNATION: " + dataArray[2]);
                System.out.println("Employee GENDER: " + dataArray[3]);
                System.out.println("Employee SALARY: " + dataArray[4]);
                System.out.println("Employee ADDRESS: " + dataArray[5]);
                System.out.println("Employee CONTACT NUMBER: " + dataArray[6]);

                count++;
            }

            System.out.println("-----------------------------\n");
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void searchData(int employeeID) {
        try {
            File readerFile = new File("../data/employee.txt");
            Scanner reader = new Scanner(readerFile);

            while (reader.hasNextLine()) {

                String lineOfData = reader.nextLine();
                String[] dataArray = lineOfData.split(",");

                if (dataArray[0] == Integer.toString(employeeID)) {
                    System.out.println("Employee found -----");
                    System.out.println("Employee ID: " + dataArray[0]);
                    System.out.println("Employee NAME: " + dataArray[1]);
                    System.out.println("Employee DESIGNATION: " + dataArray[2]);
                    System.out.println("Employee GENDER: " + dataArray[3]);
                    System.out.println("Employee SALARY: " + dataArray[4]);
                    System.out.println("Employee ADDRESS: " + dataArray[5]);
                    System.out.println("Employee CONTACT NUMBER: " + dataArray[6]);
                    System.out.println();
                }
                return;
            }

            System.out.println("Employee not found\n");

            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addData(Employee empObject) {

    }

    
}
