package Project1;

import java.io.Serializable;
import java.util.ArrayList;

/***************************************************************
 * Student Management System class.
 *
 * This file contains the records and student data
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 **************************************************************/
public class SMS implements Serializable {
    public static SMS smsInstance = new SMS(); // singleton object

    private ArrayList<Record> record = new ArrayList<Record>(); // arraylist to hold records
    private ArrayList<Student> student = new ArrayList<Student>(); // arraylist to hold students
    private ArrayList<Course> course = new ArrayList<Course>(); // arraylist to hold courses

    /**************************************************************
     * Main.  Allows program to run. Displays the main menu and
     * takes user input that directs to either the student,
     * course, or record menus.
     **************************************************************/
    public static void main(String[] args) {

        // creating an instance of main menu class and displaying the main menu
        MainMenu mm = new MainMenu();
        mm.displayMain();

    }

    /***************************************************************
     * addS.  Adds a Student to the ArrayList of Students
     * @Student s
     **************************************************************/
    public void addS(Student s) {
        student.add(s);
    }

    /***************************************************************
     * printS.  prints the ArrayList of Students
     **************************************************************/
    public void printS() {
        for (Student s : student) {
            System.out.println(s);
            System.out.println("END OF STUDENT\n");
        }
    }

    /***************************************************************
     * findS.  loops through the ArrayList of students to find matching
     * gNumber. Returns the Student
     * @int gNum
     **************************************************************/
    public Student findS(int gNum) {
        Student blank = new Student();

        // looping through list of students
        for(Student s : student) {
            if(gNum == s.getgNumber()) {
                blank = s;
            }
        }

        // if the ArrayList is still the default state after exiting throw exception
        if(blank.getgNumber() == 1000000) {
            throw new IllegalArgumentException("The following G number does not exist in the database: " + gNum);
        }

        return blank;
    }

    /***************************************************************
     * addC.  Adds a Student to the ArrayList of Students
     * @Course c
     **************************************************************/
    public void addC(Course c) {
        course.add(c);
    }

    /***************************************************************
     * printC.  prints the ArrayList of Students
     **************************************************************/
    public void printC() {
        for (Course c : course) {
            System.out.println(c);
            System.out.println("\n");
        }
    }

    /***************************************************************
     * findC.  loops through the ArrayList of students to find matching
     * gNumber. Returns the Student
     * @int gNum
     **************************************************************/
    public Course findC(String pre, int num) {
        Course blank = new Course();

        // looping through list of courses
        for(Course c : course) {
            if(pre.equals(c.getPrefix()) && num == c.getNumber()) {
                blank = c;
            }
        }

        // if the ArrayList is still the default state after exiting throw exception
        if(blank.getPrefix().equals("ABC") && blank.getNumber() == 123) {
            throw new IllegalArgumentException("The following course does not exist in the database: " + pre + " " + num);
        }

        return blank;
    }

    /***************************************************************
     * addR.  Adds a Student to the ArrayList of Students
     * @Record r
     **************************************************************/
    public void addR(Record r) {
        record.add(r);
    }

    /***************************************************************
     * printR.  prints the ArrayList of Records
     **************************************************************/
    public void printR() {
        for (Record r : record) {
            System.out.println(r);
            System.out.println("\n");
        }
    }

    /***************************************************************
     * findR.  loops through the ArrayList of students to find matching
     * gNumber. Returns the Student
     * @int gNum
     **************************************************************/
    public ArrayList<Record> findR(int gNum) {
        ArrayList<Record> blank = new ArrayList<Record>();

        // looping through list of records and adding all records that match the gnum
        for(Record r : record) {
            if(gNum == r.getStudent().getgNumber()) {
                blank.add(r);
            }
        }

        // if the ArrayList is empty after exiting the for loop, there is no student record with that g number
        if(blank.size() == 0) {
            throw new IllegalArgumentException("There are no students with G Number " + gNum);
        }
        return blank;
    }

}