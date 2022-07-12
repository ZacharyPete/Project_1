package Project1;

import java.util.Scanner;

/*********************************************************
 * Course Menu class.
 *
 * This file can add new courses
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ********************************************************/
public class CourseMenu {
    private Scanner scnr = new Scanner(System.in);
    //private SMS sms = new SMS();
    private boolean valid = false;

    /*********************************************************
     * addCourse.  Prompts user for all required information
     * about a course.
     ********************************************************/
    public void addCourse() {
        Course course = new Course(); // creating new course

        setPre(course); // setting the course prefix
        setNum(course); // setting the course number
        setTitle(course); // setting the course title

        SMS.smsInstance.addC(course); // adding new course to the list of courses
        SMS.smsInstance.printC(); // printing out updated course list

        /* move to recordmenu later
        System.out.println("Enter course prefix and number");
        String pre = scnr.nextLine();
        int num = scnr.nextInt();
        scnr.nextLine();
        System.out.println(sms.findC(pre, num));*/

    }

    /*********************************************************
     * setPre.  sets the course prefix
     * @Course course.
     ********************************************************/
    public void setPre(Course course) {
        // Prompting user to enter course prefix
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter course prefix");
                course.setPrefix(scnr.nextLine());
                valid = true; // if valid entry, break out of loop
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }
    }

    /*********************************************************
     * setNum.  sets the course number
     * @Course course.
     ********************************************************/
    public void setNum(Course course) {
        // Prompting user to enter course number
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter course number");
                course.setNumber(scnr.nextInt());
                scnr.nextLine();
                valid = true; // if valid entry, break out of loop
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }
    }

    /*********************************************************
     * setTitle.  sets the course title
     * @Course course.
     ********************************************************/
    public void setTitle(Course course) {
        // Prompting user to enter course title
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter course title");
                course.setTitle(scnr.nextLine());
                valid = true; // if valid entry, break out of loop
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }
    }
}