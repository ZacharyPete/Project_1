package Project1;

/***********************************************
 * Phone class.
 *
 * This file contains and edits the phone numbers.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 **********************************************/
public class Phone {
    private int areaCode;
    private int prefix;
    private int number;
    private boolean primary;
    private PhoneType type;

    /**********************************************
     * PhoneType.  Enumeration class that sets the
     * phone number type.
     **********************************************/
    enum PhoneType {
        HOME,
        CELL,
        BUSINESS,
        FAX
    }

    /***********************************************
     * getAreaCode.  Returns an int with the phone number's area code.
     * @return int
     **********************************************/
    public int getAreaCode() {
        return areaCode;
    }

    /***********************************************
     * setAreaCode.  Sets the phone number's area code.
     * @int areaCode.
     **********************************************/
    public void setAreaCode(int areaCode) {

        // checking size
        if(areaCode > 99 && areaCode < 1000) {
            this.areaCode = areaCode;
        } else {
            throw new IllegalArgumentException("Please enter an area code between 100 and 999");
        }

    }

    /***********************************************
     * getPrefix.  Returns an int with the prefix of the phone number.
     * @return int
     **********************************************/
    public int getPrefix() {
        return prefix;
    }

    /***********************************************
     * setPrefix.  Sets the phone number's prefix.
     * @int prefix.
     **********************************************/
    public void setPrefix(int prefix) {

        // checking size
        if(prefix > 99 && prefix < 1000) {
            this.prefix = prefix;
        } else {
            throw new IllegalArgumentException("Please enter a prefix between 100 and 999");
        }
    }

    /***********************************************
     * getNumber.  Returns an int with the last 4 digits of the phone number.
     * @return int
     **********************************************/
    public int getNumber() {
        return number;
    }

    /***********************************************
     * setNumber.  Sets the phone number's last four digits.
     * @int number.
     **********************************************/
    public void setNumber(int number) {

        // checking size
        if(number > 999 && number < 10000) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Please enter a number between 1000 and 9999");
        }
    }

    /***********************************************
     * getType.  Returns a PhoneType with the type of phone number.
     * @return PhoneType
     **********************************************/
    public PhoneType getType() {
        return type;
    }

    /***********************************************
     * setType.  Sets the phone number's type to home, cell, business, fax.
     * @int areaCode.
     **********************************************/
    public void setType(PhoneType type) {
        this.type = type;
    }

    /***********************************************
     * getPrimary.  Returns a boolean confirming if the phone number is primary.
     * @return boolean
     **********************************************/
    public boolean getPrimary() {
        return primary;
    }

    /***********************************************
     * setPrimary.  Sets the phone number as primary.
     * @boolean primary.
     **********************************************/
    public void setPrimary(boolean primary) {
        if(primary) {
            this.primary = primary;
        }
    }

    /***********************************************
     * toString.  Returns a formatted String with the phone number.
     * @return String
     **********************************************/
    public String toString() {
        return this.type + ": (" + areaCode + ") " + prefix + "-" + number;
    }

}