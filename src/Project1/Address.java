package Project1;

/***********************************************
 * Address class.
 *
 * This file contains and edits the addresses.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 **********************************************/
public class Address {
    // local variables
    private int number;
    private String street;
    private String lineTwo;
    private String city;
    private String state;
    private int zip;

    /***********************************************
     * Constructor.  Sets base state of an Address object to the
     * values passed in.
     **********************************************/
    public Address(){
        this.number = 1;
        this.street = "Campus Dr.";
        this.lineTwo = "";
        this.city = "Allendale";
        this.state = "MI";
        this.zip = 49401;
    }

    /***********************************************
     * getNumber.  Returns the number of the students address.
     * @return int
     **********************************************/
    public int getNumber() {
        return number;
    }

    /***********************************************
     * setNumber.  Sets the number of the student's address to the value passed in.
     * @int number
     **********************************************/
    public void setNumber(int number) {

        // need to fix if user enters nothing
        // number must be greater than 0
        if(number > 0 && number < 1000000) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Number must be greater than 0 and less than 1000000");
        }
    }

    /***********************************************
     * getStreet.  Returns the street name of the students address.
     * @return String
     **********************************************/
    public String getStreet() {
        return street;
    }

    /***********************************************
     * setStreet.  Sets the street of the student's address to the value passed in.
     * @String street
     **********************************************/
    public void setStreet(String street) {

        // checks length and that entry is not null
        if((street.length() < 50) && (street != "")) {
            this.street = street;
        } else {
            throw new IllegalArgumentException("Street must be between 1 and 50 characters");
        }
    }

    /***********************************************
     * getLineTwo.  Returns line two of the students address.
     * @return String
     **********************************************/
    public String getLineTwo() {
        return lineTwo;
    }

    /***********************************************
     * setLineTwo.  Sets line two of the student's address to the value passed in.
     * @String lineTwo
     **********************************************/
    public void setLineTwo(String lineTwo) {

        // checks length
        if((street.length() < 50)) {
            this.lineTwo = lineTwo;
        } else {
            throw new IllegalArgumentException("Street must be between 1 and 50 characters");
        }
    }

    /***********************************************
     * getCity.  Returns what city the student's address is located in.
     * @return String
     **********************************************/
    public String getCity() {
        return city;
    }

    /***********************************************
     * setCity.  Sets the city of the student's address to the value passed in.
     * @String city
     **********************************************/
    public void setCity(String city) {

        // should we capitalize each word of the string
        // checks length and that the entry is not null
        if(city.length() < 50 && city != "") {
            this.city = city;
        }
        else {
            throw new IllegalArgumentException("City name must be between 1 and 50 characters");
        }

        // regex found from java api - a through z or A through Z, inclusive (range)
        if(state.matches("[a-zA-Z]+")) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("State name can only contain letters");
        }
    }

    /***********************************************
     * getState.  Returns what state the student's address is located in.
     * @return String
     **********************************************/
    public String getState() {
        return state;
    }

    /***********************************************
     * setState.  Sets the state of the student's address to the value passed in.
     * @String state
     **********************************************/
    public void setState(String state) {

        // checks length and null entry
        if((state != "") && (state.length() == 2)) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("Please enter a 2 letter state abbreviation");
        }

        // regex found from java api - a through z or A through Z, inclusive (range)
        if(state.matches("[a-zA-Z]+")) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("State name can only contain letters");
        }
    }

    /***********************************************
     * getZip.  Returns the zipcode of the student's address.
     * @return int
     **********************************************/
    public int getZip() {
        return zip;
    }

    /***********************************************
     * setZip.  Sets the zipcode of the student's address to the value passed in.
     * @int zip
     **********************************************/
    public void setZip(int zip) {

        // checks size of entry
        if(zip >= 1 && zip <= 99999) {
            this.zip = zip;
        }
        else {
            throw new IllegalArgumentException("Please enter a zipcode between 1 and 99999");
        }
    }

    /***********************************************
     * toString.  Returns a formatted String with the student's address.
     * @return String
     **********************************************/
    public String toString() {
        return number + " " + street + "\n" + city + ", " + state + " " + zip;
    }
}