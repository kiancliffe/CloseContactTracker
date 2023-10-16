// Kian Cliffe
// R00179744
// SD2 - B

package app;

public class Person {

    private Name name;
    private String phone;
    private String uniqueID;
    private String email;

    public Person(Name name, String phone, String uniqueID, String email){
        this.name = name;
        this.phone = phone;
        this.uniqueID = uniqueID;
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String toString() {
        return name.toString() + " " + phone + " " + uniqueID + " " + email;
    }

}
