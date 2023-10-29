/*
 * This class is the blueprint of every employee data stored in the system.
 * This class also provides methods to write data into storage and read data from storage.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
            File outputFile = new File("../data/employee.txt");
            FileInputStream fis = new FileInputStream(outputFile);
            int c;
            String input = "";
            int count = 1;

            while (true) {

                System.out.println("\nEmployee " + count + "\n-----------");
                System.out.print("Employee ID: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";

                System.out.print("Employee NAME: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";
            
                System.out.print("Employee DESIGNATION: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";
            
                System.out.print("Employee GENDER: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";

                System.out.print("Employee SALARY: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";
            
                System.out.print("Employee ADDRESS: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";
            
                System.out.print("Employee CONTACT NUMBER: ");

                while (true) {
                    c = fis.read();

                    if (c == -1 || (char) c == ',') {
                        break;
                    } else {
                        input += (char) c;
                    }
                }

                System.out.println(input);
                input = "";

                if (c == -1) {
                    break;
                }
            
                count++;
            }
            System.out.println("-----------------------------\n");
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
