## Introduction
This is a mini-project where an Employee Management System is made using java. In this project, we have used text files as storage. This program lets the user do a bunch of tasks with the employee data like Adding, Viewing, Deleting, Updating and Modifying.

## Working
This has a menu-driven approach for the interface. It starts off with offering the user the menus he can do, and asking for an input. Based on user input the program performs the tasks.
The Home Screen has the following options:
- View all Employee Data
- Add Employee
- Search Employee
- Update Employee
- Delete Employee
- Exit

## Viewing all Employee Data
This task offers the user to view all Employee Data. The program displays all Employee Data one after another, reading from the file.

## Adding Employee Data
When user selects the first option, the program then leads the user to add the details of the Employee to be stored in the file. The Program asks the user the following data:
 - Employee ID
 - Employee NAME
 - Employee DESIGNATION
 - Employee GENDER
 - Employee SALARY
 - Employee ADDRESS
 - Employee CONTACT NUMBER

After the user adds the following information, the program then saves the data in the respective file and stores them.

## Searching Employee Data
This task is performed by the program by taking the Employee ID as input. After taking the input, it goes through the files for the respective Employee data. If found, it is printed. If not, an error message is sent to the terminal, informing the user about the unavailablity of the Employee data.

## Updating Employee Data
This task is performed by the program taking the Employee ID as input to search for the record to be updated. Then the program lets the user enter every detail again. When it's done, the program saves the updated information and stores it again.

## Deleting Employee Data
This task is performed by the program by taking an input, i.e. the Employee ID, to perform the deletion. The program deletes the line of the respective Employee data from the file. This leads to removal of the unwanted record, and filling the gap by the records thereafter.

## Exiting the Program
This is just the termination of the program. When the user selects this option, the program ends executing. The data is stored in a text file, so the data is retained even after termination of the program.