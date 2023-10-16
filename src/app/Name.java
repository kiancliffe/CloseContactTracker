// Kian Cliffe
// R00179744
// SD2 - B

package app;

public class Name {
    // Attributes
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String fn, String mn, String ln){
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
    }

    public Name() {}

    public String getFirstname() {
        return firstName;
    }


    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }


    public String getMiddlename() {
        return middleName;
    }


    public void setMiddlename(String middlename) {
        this.middleName = middlename;
    }


    public String getLastname() {
        return lastName;
    }


    public void setLastname(String lastname) {
        this.lastName = lastname;
    }


    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

}
