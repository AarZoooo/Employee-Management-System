/*
 * This class has static methods usable for dealing with the storage file.
 * These methods take Employee objects and perform instructions like adding, searching, deleting etc.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Data {

    //Methods
    //These methods are for directly printing data to GUI
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
                    return;
                }
            }

            System.out.println("Employee not found\n");

            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //These methods are for manipulating data. They do not do any type of printing to the GUI
    public static void addData(Employee empObject) {
        try {
            String newDataLine = "\n" + empObject.id + "," + empObject.name + "," + empObject.designation + "," + empObject.gender + "," + empObject.salary + "," + empObject.address + "," + empObject.contact;

            File storagFile = new File("../data/employee.txt");
            FileOutputStream fos = new FileOutputStream(storagFile, true);

            byte[] bytesToWrite = newDataLine.getBytes();

            fos.write(bytesToWrite);

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateData(int id, Employee empObject) {
        
    }
}
