package Project1;

import java.util.ArrayList;

/*********************************************************
 * Student class.
 *
 * This file contains and edits the student information.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ********************************************************/
public class Student {
    // local variables
    private String firstName;
    private String lastName;
    private Address[] addresses = new Address[2];
    private ArrayList<Phone> phoneNumbers = new ArrayList<Phone>();
    private int gNumber = 1000000;
    // private static int currentID = 10000000; <- make gnumber variable static instead?

    /*********************************************************
     * Constructor.  Sets base state of a Student object to the
     * values passed in.
     ********************************************************/
    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.addresses[0] = new Address();
        this.addresses[1] = new Address();
        this.phoneNumbers = new ArrayList<Phone>();
        //this.gNumber = 10000000;
    }

    /*********************************************************
     * getFirstName.  Returns a String with the student's first name.
     * @return String
     ********************************************************/
    public String getFirstName() {
        return firstName;
    }

    /*********************************************************
     * setFirstName.  Sets the student's first name to the value passed in.
     * @String firstName.
     ********************************************************/
    public void setFirstName(String firstName) {

        // checking length and that the field is not blank
        if((firstName.length() < 50) && (firstName != "")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name must be between 1 and 50 characters");
        }

        // regex found from java api
        if(firstName.matches("[a-zA-Z]+")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name can only contain letters");
        }

    }

    /*********************************************************
     * getLastName.  Returns a String with the student's last name.
     * @return String
     ********************************************************/
    public String getLastName() {
        return lastName;
    }

    /*********************************************************
     * setLastName.  Sets the student's last name to the value passed in.
     * @String lastName.
     ********************************************************/
    public void setLastName(String lastName) {
        // checking length and that the field is not blank
        if((lastName.length() < 50) && (lastName != "")) {
            this.lastName = lastName;
        }
        else {
            throw new IllegalArgumentException("Last name must be between 1 and 50 characters");
        }
    }

    /*********************************************************
     * getAddresses.  Returns an Address[] with all the student's addresses.
     * @return Address[]
     ********************************************************/
    public Address[] getAddresses() {
        return addresses;
    }

    /*********************************************************
     * getPhoneNumbers.  Returns an ArrayList of type Phone with all the student's phone numbers.
     * @return ArrayList<Phone></Phone>
     ********************************************************/
    public ArrayList<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    /*********************************************************
     * setMailingAddr.  Sets the student's mailing address to the value passed in.
     * @Address mailingAddr.
     ********************************************************/
    public void setMailingAddr(Address mailingAddr) {
        addresses[0] = mailingAddr;
    }

    /*********************************************************
     * setBillingAddr.  Sets the student's billing address to the value passed in.
     * @Address billingAddr.
     ********************************************************/
    public void setBillingAddr(Address billingAddr) {
        addresses[1] = billingAddr;
    }

    /*********************************************************
     * addPhone.  Adds a phone number to the student's list of phone numbers.
     * @Phone phone.
     ********************************************************/
    public void addPhone(Phone phone) {
        phoneNumbers.add(phone);
    }

    /*********************************************************
     * getgNumber.  Returns an int with the student's G Number.
     * @return int
     ********************************************************/
    public int getgNumber() {
        return gNumber;
    }

    /*********************************************************
     * setgNumber.  Sets the student's G Number to the value passed in.
     * @int gNumber.
     ********************************************************/
    public void setgNumber(int gNumber) {

        // checking length
        if(gNumber > 1000000 && gNumber <= 99999999 ) {
            this.gNumber = gNumber;
        } else {
            throw new IllegalArgumentException("G Number must be between 10000000 and 99999999");
        }
    }

    /*********************************************************
     * toString.  Returns a formatted String with the student information.
     * @return String
     ********************************************************/
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Mailing Address: " + addresses[0] + "\n" +
                "Billing Address: " + addresses[1] + "\n" +
                "Phone #: " + getPhoneNumbers() + "\n" +
                "G #: " + gNumber + "\n";
    }

}