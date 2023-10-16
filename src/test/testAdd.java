package test;

import controller.Controller;

public class testAdd {

    private static final Controller ctrl = new Controller();

    public testAdd (){
        String fname = "Bob";
        String mname = "Bobby";
        String lname = "Clarkson";
        String uniqueID = "23";
        String phone = "123456789";
        String email = "contact@email.net";

        ctrl.addPerson(fname, mname, lname, phone, uniqueID, email);
    }

    public static void main( String args[] )
    {
        new testAdd();
    } // end method main
}

