package Project1;

import java.util.Scanner;

/*********************************************************
 * Student Menu class.
 *
 * This file creates a new student or modifies an existing student
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ********************************************************/
public class StudentMenu {
    private Scanner scnr = new Scanner(System.in);
    private boolean valid = false;

    /*********************************************************
     * addStudent.  Prompts user for all required information
     * about a student.
     ********************************************************/
    public void addStudent() {

        // creating new student, address, phone
        Student student = new Student();
        Address address = new Address();
        Phone phone = new Phone();

        // setting student's first and last name
        setFirst(student);
        setLast(student);

        // setting student's mailing and billing addresses
        setMail(student, address);
        setBill(student, address);

        // setting student's phone numbers
        setPhone(student, phone);

        // setting student's gNumber
        setGNum(student);

        SMS.smsInstance.addS(student); // adding new student to the list of students

        System.out.println(student); // printing out the student that was just added
        System.out.println("\n"); // newline
    }

    /*********************************************************
     * modStudent.  Prompts user for all required information
     * about a student.
     ********************************************************/
    public void modStudent(int gNum) {

        // creating a student and setting equal to the student entered
        Student student = new Student();
        Address address = new Address();
        Phone phone = new Phone();
        student = SMS.smsInstance.findS(gNum);

        // initializing variables
        int userNum = 0;

        // Displaying main menu
        System.out.println("Select which attribute you would like to modify\n");
        System.out.println("==========\n");
        System.out.println("1. First Name\n");
        System.out.println("2. Last Name\n");
        System.out.println("3. Mailing Address\n");
        System.out.println("4. Billing Address\n");
        System.out.println("5. Phone Number\n");

        userNum = scnr.nextInt(); // takes user input for menu choice
        scnr.nextLine();

        // different menu displayed based on user input
        switch (userNum) {
            case 1: setFirst(student); // if 1, student first name is modified
                break;
            case 2: setLast(student); // if 2, student last name is modified
                break;
            case 3: setMail(student, address); // if 3, student mailing address is modified
                break;
            case 4: setBill(student, address); // if 4, student billing address is modified
                break;
            case 5: setPhone(student, phone); // if 5, student phone number is modified
            default: System.out.println("Must choose an option"); // fix later
                break;
        }
        SMS.smsInstance.printS(); // printing the updated list of students
    }

    /*********************************************************
     * setFirst.  Sets a students first name.
     * @Student student
     ********************************************************/
    public void setFirst(Student student) {

        // Prompting user to enter student first name
        valid = false;
        while (!valid) {
            try {
                System.out.println("Enter student's first name");
                student.setFirstName(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }
    }

    /*********************************************************
     * setLast.  Sets a students last name.
     * @Student student
     ********************************************************/
    public void setLast(Student student) {

        // Prompting user to enter student last name
        valid = false;
        while (!valid) {
            try {
                System.out.println("Enter student's last name");
                student.setLastName(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }
    }

    /*********************************************************
     * setMail.  Sets a students mailing address.
     * @Student student
     * @Address address
     ********************************************************/
    public void setMail(Student student, Address address) {
        // Prompting user to enter MAILING address info
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter number");
                address.setNumber(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line in the stream
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address street name
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter street name");
                address.setStreet(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address city
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter city");
                address.setCity(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address state
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter state");
                address.setState(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address zipcode
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter zipcode");
                address.setZip(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        student.setMailingAddr(address); // setting the address entered as the mailing address
    }

    /*********************************************************
     * setBill.  Sets a students billing address.
     * @Student student
     * @Address address
     ********************************************************/
    public void setBill(Student student, Address address) {
        // Prompting user to enter BILLING address number
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter number");
                address.setNumber(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address name
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter street name");
                address.setStreet(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address city
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter city");
                address.setCity(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address state
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter state");
                address.setState(scnr.nextLine());
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address zipcode
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter zipcode");
                address.setZip(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        student.setBillingAddr(address); // setting the address entered as the billing address
    }

    /*********************************************************
     * setPhone.  Sets a students phone number
     * @Student student
     * @Phone phone
     ********************************************************/
    public void setPhone(Student student, Phone phone) {
        // Prompting user to enter PHONE NUMBER type
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter phone type\n HOME, CELL, BUSINESS, or FAX");
                phone.setType(Phone.PhoneType.valueOf(scnr.nextLine()));
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter PHONE NUMBER area code
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter area code");
                phone.setAreaCode(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter PHONE NUMBER prefix
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter prefix");
                phone.setPrefix(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter PHONE NUMBER last 4 digits
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter last 4 digits");
                phone.setNumber(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }

        phone.setPrimary(true); // setting the phone number entered to primary
        student.addPhone(phone); // assigning the phone entered to the student
    }

    /*********************************************************
     * setGNum.  Sets a students g number
     * @Student student
     ********************************************************/
    public void setGNum(Student student) {

        // Prompting user to enter gnumber
        valid = false;
        while(!valid) {
            try {
                System.out.println("Student G Number");
                student.setgNumber(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }
    }

    public void getS(int gNum) {
        SMS.smsInstance.findS(gNum);
    }

}