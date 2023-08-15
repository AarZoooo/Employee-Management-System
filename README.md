# Employee-Management-System
## Introduction
This is a mini-project where an Employee Management System is made using java. As this is a mini-project to be based on java and DSA, we have implemented ArrayList class instead of MySQL database. This program lets the user do a bunch of tasks with the employee data like Adding, Inspecting, Deleting, Sorting and Modifying.

## Working
This has a menu-driven approach for the interface. It starts off with offering the user the menus he can do, and asking for an input. Based on user input the program performs the tasks.
The Home Screen has the following options:
- Add Employee Data
- View Employee Data
- Modify Employee Data
- Sort Employee Data
- Delete Employee Data
- Exit

## Adding Employee Data
When user selects the first option, the program then leads the user to add the details of the Employee to be added to the ArrayList. The Program asks the user the following data:
 - Employee ID
 - Employee NAME
 - Employee DESIGNATION
 - Employee SALARY
 - Employee CONTACT NUMBER
After the user adds the following information, the program then saves the data in the respective ArrayLists and stores them.

## Viewing Employee Data
This task offers the user to view all Employee Data, or selecting one of them and viewing that record. The program takes an input from the user to ask this question. Based on the input, the program either displays all Employee Data, or the one the user asks for.

## Modifying Employee Data
This task is performed by the program taking the Employee ID as input to search for the record to be edited. Then the program lets the user enter every detail again. When it's done, the program saves the updated information and stores it again.

## Sorting Employee Data
This task is performed by the program using a few sorting techniques. Firstly the program asks the user for the basis of sorting, like if the user wants to sort the data on the basis of Employee ID, NAME, DESIGNATION, or SALARY. Then after taking the input from the user, the program then sorts the data accordingly. Then the program offers the user an option to view the Data after sorting. If true, then the program performs the Iteration function to print all data. Else, the program returns to the Home Page.

## Deleting Employee Data
This task is performed by the program by taking an input, ideally the Employee ID, to perform the deletion. The program simply shifts each record after the unwanted record, backward by one place. This leads to removal of the unwanted record, and filling the gap by the records thereafter.

## Exiting the Program
This is just the termination of the program. When the user selects this option, the program ends executing. Remember that the data is stored in an ArrayList class, so if the program ends, no data is retained.