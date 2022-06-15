package Project1;
import java.util.ArrayList;

public class Course {
    private String prefix;
    private int number;
    private String title;

    public Course(){


    }

    public String getPrefix() {
        if (prefix.length() == 3){
            return prefix;
    }
    else
        throw new RuntimeException("Enter a course Prefix that is only 3 characters");
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNumber() {
        if(9999 > number && number > 0) {
            return number;
        }
        else {
            throw new RuntimeException("Please enter a course number between 9999-1");
        }
        }



    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        if(title != "") {
            return title;
        }
        else {

            throw new RuntimeException("Please enter a course title");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){return(prefix + " " + number + " " + title);}
}
