package Project1;

import java.util.Scanner;

/**************************************************************
 * Main Menu class.
 *
 * This file displays the main menu, student, course, and record menus.
 * It takes user input as a menu selection and displays the appropriate menu
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 **************************************************************/
public class MainMenu {

    private StudentMenu sm = new StudentMenu(); // creating object of the student menu class
    private CourseMenu cm = new CourseMenu(); // creating object of the course menu class
    private RecordsMenu rm = new RecordsMenu(); // creating object of the student menu class
    private Scanner scnr = new Scanner(System.in);

    /***************************************************************
     * displayMain.  Displays the main menu and takes user input that
     * directs to either the student, course, or record menus.
     **************************************************************/
    public void displayMain() {

        // initializing variables
        int userNum = 0;

        // Displaying main menu
        System.out.println("Main Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Work with Students\n");
        System.out.println("2. Work with Courses\n");
        System.out.println("3. Work with Records\n");
        System.out.println("4. Quit\n");

        userNum = scnr.nextInt(); // takes user input for menu choice

        // different menu displayed based on user input
        switch (userNum) {
            case 1:
                studentMenu(); // if 1, student menu is displayed
                break;
            case 2:
                courseMenu(); // if 2, course menu is displayed
                break;
            case 3:
                recordsMenu(); // if , record menu is displayed
                break;
            case 4:
                break; // if 4, break
            default:
                System.out.println("Must choose an option");
                displayMain();
                break;
        }
    }

    /***************************************************************
     * studentMenu.  Displays student menu and takes user input
     * to either add/modify a student or go back to the main menu.
     **************************************************************/
    public void studentMenu() {

        // initializing variables
        int userNum = 0;

        // Displaying student menu
        System.out.println("Student Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Add a Student\n");
        System.out.println("2. Modify a Student\n");
        System.out.println("3. Go back to Main Menu\n");

        userNum = scnr.nextInt(); // taking user input for menu selection

        // action is based on user input
        switch (userNum) {
            case 1:
                sm.addStudent(); // if 1, a student will be added
                break;
            case 2: System.out.println("Enter the G Number of the student you would like to modify");
                sm.modStudent(scnr.nextInt()); // if 2, student will be modified
                scnr.nextLine();
                break;
            case 3:
                displayMain();
                break;
            default:
                System.out.println("Must select an option"); // default case
                studentMenu();
        }
        displayMain(); // displays the main menu after
    }

    /***************************************************************
     * courseMenu.  Displays course menu and takes user input
     * to either add a course or go back to the main menu.
     **************************************************************/
    public void courseMenu() {
        // initializing variables
        int userNum = 0;

        // Displaying course menu
        System.out.println("Course Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Add a Course\n");
        System.out.println("2. Go back to Main Menu\n");

        userNum = scnr.nextInt(); // taking user input for menu selection

        // action is based on user input
        switch (userNum) {
            case 1:
                cm.addCourse(); // if 1, a course will be added
                break;
            case 2:
                displayMain(); // if 2, go back to main menu
                break;
            default:
                System.out.println("Must choose an option"); // default case
                courseMenu();
        }
        displayMain();
    }

    /***************************************************************
     * recordsMenu.  Displays student menu and takes user input
     * to either add/modify a student or go back to the main menu.
     **************************************************************/
    public void recordsMenu() {
        // initializing variables
        int userNum = 0;

        // Displaying records menu
        System.out.println("Records Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Add a Record\n");
        System.out.println("2. View a transcript for a Student\n");
        System.out.println("3. Save records to a disk\n");
        System.out.println("4. Load records from disk\n");
        System.out.println("5. Return to main menu\n");

        userNum = scnr.nextInt(); // taking user input for menu selection

        // action is based on user input
        switch (userNum) {
            case 1:
                rm.addRecord(); // if 1, a record will be added
                scnr.nextLine();
                break;
            case 2: System.out.println("Enter the G Number of the student whose transcript you would like to view\n");
                rm.viewTranscript(scnr.nextInt()); // if 2, a transcript will be displayed
                scnr.nextLine();
                break;
            case 3:
                rm.saveRecord("record.ser"); // if 3, the record will be saved to disk
                break;
            case 4:
                rm.loadRecord("record.ser"); // if 4, records will be loaded from disk
                break;
            case 5:
                displayMain(); // if 5, main menu will be displayed
                break;
            default:
                System.out.println("Must choose an option");
                recordsMenu();
        }
        displayMain();
    }
}