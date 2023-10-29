import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner object
        Scanner scan = new Scanner(System.in);


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
                case 1:
                System.out.println("\nShowing all Employee Data---");
                    Employee.printAllData();
                    break;
            
                case 2:
                    System.out.println("Searching Employee Data---");

                    System.out.print("Enter Employee ID: ");
                    int employeeID = scan.nextInt();

                    Employee.searchData(employeeID);
                    
                    break;

                case 3:
                    
                    break;
            
                case 4:
                    
                    break;
            
                case 5:
                    
                    break;
            
                case 6:
                    
                    return;
            
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }
}