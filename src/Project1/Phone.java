package Project1;
import java.util.ArrayList;


public class Phone {
    private int areaCode;
    private int prefix;
    private int number;
    private boolean primary;

    public Phone(){


    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String toString(){return(prefix + " " + "(" + areaCode + ")" + number);}
}
