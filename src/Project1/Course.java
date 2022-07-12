package Project1;


/***********************************************
 * Course class.
 *
 * This file contains and edits the courses.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 **********************************************/
public class Course {
    // local variables
    private String prefix;
    private int number;
    private String title;

    /***********************************************
     * Constructor.  Sets base state of a Course object to the
     * values passed in.
     **********************************************/
    public Course(){
        this.prefix = "ABC";
        this.number = 123;
        this.title = "Default Course";
    }

    /***********************************************
     * getPrefix.  Returns a String of the course prefix.
     * @return String
     **********************************************/
    public String getPrefix() {
        return prefix;
    }

    /***********************************************
     * setPrefix.  Sets the course prefix.
     * @String prefix.
     **********************************************/
    public void setPrefix(String prefix) {

        // checks length of entry
        if (prefix.length() == 3){
            this.prefix = prefix;
        } else
            throw new IllegalArgumentException("Enter a course prefix that is 3 characters");

        // regex found from java api - a through z or A through Z, inclusive (range)
        if(prefix.matches("[a-zA-Z]+")) {
            this.prefix = prefix;
        } else {
            throw new IllegalArgumentException("course prefix can only contain letters");
        }
    }

    /***********************************************
     * getNumber.  Returns an int of the course number.
     * @return int
     **********************************************/
    public int getNumber() {
        return number;
    }

    /***********************************************
     * setNumber.  Sets the course number.
     * @String number.
     **********************************************/
    public void setNumber(int number) {

        // checks size of integer
        if(999 >= number && number > 0) {
            this.number = number;
        }
        else {
            throw new IllegalArgumentException("Please enter a course number between 1 and 999");
        }
    }

    /***********************************************
     * getTitle.  Returns a String of the course title.
     * @return String
     **********************************************/
    public String getTitle() {
        return title;
    }

    /***********************************************
     * setTitle.  Sets the class title.
     * @String title.
     **********************************************/
    public void setTitle(String title) {

        // checks for null entry
        if(title != "" && title.length() < 50) {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Please enter a course title");
        }
    }

    /***********************************************
     * toString.  Returns a formatted String with the course prefix, number, and title.
     * @return String
     **********************************************/
    public String toString() {
        return prefix + " " + number + ": " + title;
    }
}