/*
 * This class has static methods usable for dealing with the storage file.
 * These methods take Employee objects and perform instructions like adding, searching, deleting etc.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    //Static Methods
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

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean searchData(int employeeID) {
        try {
            File readerFile = new File("../data/employee.txt");
            Scanner reader = new Scanner(readerFile);

            while (reader.hasNextLine()) {

                String lineOfData = reader.nextLine();
                String[] dataArray = lineOfData.split(",");

                if (Integer.parseInt(dataArray[0]) == employeeID) {
                    System.out.println("Employee found -----");
                    System.out.println("Employee ID: " + dataArray[0]);
                    System.out.println("Employee NAME: " + dataArray[1]);
                    System.out.println("Employee DESIGNATION: " + dataArray[2]);
                    System.out.println("Employee GENDER: " + dataArray[3]);
                    System.out.println("Employee SALARY: " + dataArray[4]);
                    System.out.println("Employee ADDRESS: " + dataArray[5]);
                    System.out.println("Employee CONTACT NUMBER: " + dataArray[6]);

                    System.out.println();
                    reader.close();
                    return true;
                }
            }

            System.out.println("Employee not found\n");

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    //These are for manipulating data. They do not do any type of printing to the GUI
    
    public static void addData(Employee empObject) {
        try {
            String newDataLine = empObject.id + "," + empObject.name + "," + empObject.designation + "," + empObject.gender + "," + empObject.salary + "," + empObject.address + "," + empObject.contact;

            File storagFile = new File("../data/employee.txt");
            FileOutputStream fos = new FileOutputStream(storagFile, true);

            byte[] bytesToWrite = newDataLine.getBytes();

            fos.write(bytesToWrite);
            fos.write(System.lineSeparator().getBytes());

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateData(int id, Employee empObject) {
        try {
            File dataFile = new File("../data/employee.txt");
            Scanner sc = new Scanner(dataFile);

            ArrayList<String> readData = new ArrayList<>();

            while (sc.hasNextLine()) {
                readData.add(sc.nextLine());
            }

            for (int line = 0; line < readData.size(); line++) {
                String[] lineArray = readData.get(line).split(",");

                if (Integer.parseInt(lineArray[0]) == id) {
                    lineArray[1] = "" + empObject.name;
                    lineArray[2] = "" + empObject.designation;
                    lineArray[3] = "" + empObject.gender;
                    lineArray[4] = "" + empObject.salary;
                    lineArray[5] = "" + empObject.address;
                    lineArray[6] = "" + empObject.contact;

                    readData.remove(line);

                    String newLine = "";

                    for (int i = 1; i < 7; i++) {
                        newLine += (lineArray[i] + ",");
                    }

                    readData.add(newLine);

                    break;
                }
            }

            FileOutputStream fos = new FileOutputStream(dataFile);

            for (String line : readData) {
                byte[] dataBytes = line.getBytes();

                fos.write(dataBytes);
                fos.write(System.lineSeparator().getBytes());
            }

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteData(int id) {
        try {
            File dataFile = new File("../data/employee.txt");
            Scanner sc = new Scanner(dataFile);

            ArrayList<String> readData = new ArrayList<>();

            while (sc.hasNextLine()) {
                readData.add(sc.nextLine());
            }

            for (int i = 0; i < readData.size(); i++) {
                String[] lineArray = readData.get(i).split(",");

                if (Integer.parseInt(lineArray[0]) == id) {
                    
                    readData.remove(i);

                    break;
                }
            }

            FileOutputStream fos = new FileOutputStream(dataFile);

            for (String line : readData) {
                byte[] dataBytes = line.getBytes();

                fos.write(dataBytes);
                fos.write(System.lineSeparator().getBytes());
            }

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
