package test;

import controller.Controller;

public class testRemove {

    private static final Controller ctrl = new Controller();

    public testRemove (){
        String uniqueID = "23";
        ctrl.removePerson(uniqueID);
    }

    public static void main( String args[] )
    {
        new testRemove();
    } // end method main
}
