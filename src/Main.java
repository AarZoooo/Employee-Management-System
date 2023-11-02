import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----------  EMPLOYEE MANAGEMENT SYSTEM  ----------");
        
        int choice = 0;

        while (true) {
            System.out.println("1. View all Employee Data");
            System.out.println("2. Add Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit\n");

            
            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input. Try again.\n");
            }

            switch (choice) {
                case 1:
                    System.out.println("\nShowing all Employee Data---");
                    Employee.printAllData();
                    break;
            
                case 2:
                    System.out.println("\nAdding Employee Data---");
                    Employee.addData();
                    break;

                case 3:
                    System.out.println("\nSearching Employee Data---");
                    Employee.searchData();
                    break;
            
                case 4:
                    System.out.println("\nUpdating Employee Data---");
                    Employee.updateData();
                    break;
            
                case 5:
                    System.out.println("\nDeleting Employee Data---");
                    Employee.deleteData();
                    break;
            
                case 6:
                    System.out.println("\nExiting...");
                    return;
            
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }
}
