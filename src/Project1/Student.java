package Project1;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList address;
    private ArrayList phone;
    private int gnumber;

    private static int currentID = 10000000;

    public Student() {
        this.phone = phone;
        this.address = address;
        this.gnumber = Student.currentID;
        this.firstName = firstName;
        this.lastName = lastName;
        currentID++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList getAddress() {
        return address;
    }

    public void setAddresses(ArrayList address) {
        this.address = address;
    }

    public ArrayList getPhone() {
        return phone;
    }

    public void setPhone(ArrayList phone) {
        this.phone = phone;
    }

    public String toString(){return(firstName + " " + lastName);}
}
