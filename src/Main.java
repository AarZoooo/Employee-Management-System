import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner object
        Scanner scan = new Scanner(System.in);


        //File objects
        File managerData = new File("../data/manager.txt");
        File hrData = new File("../data/hr.txt");
        File designerData = new File("../data/designer.txt");
        File seniorDeveloperData = new File("../data/senior_developer.txt");
        File assistantDeveloperData = new File("../data/assistant-developer.txt");


        //GUI Code
        System.out.println("----------  EMPLOYEE MANAGEMENT SYSTEM  ----------");
        
        int choice;

        while (true) {
            System.out.println("1. View all Employee Data");
            System.out.println("2. Add Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit\n");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case value:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}