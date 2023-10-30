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
            
            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nShowing all Employee Data---");
                    Employee.printAllData();
                    break;
            
                case 2:
                    System.out.println("Adding Employee Data---");
                    Employee.addData();
                    break;

                case 3:
                    System.out.println("Searching Employee Data---");
                    Employee.searchData();
                    break;
            
                case 4:
                    System.out.println("Updating Employee Data---");
                    Employee.updateData();
                    break;
            
                case 5:
                    System.out.println("Deleting Employee Data---");
                    Employee.deleteData();
                    break;
            
                case 6:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
            
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }
}