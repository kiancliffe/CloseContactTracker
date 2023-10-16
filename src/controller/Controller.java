// Kian Cliffe
// R00179744
// SD2 - B

package controller;

import java.sql.*;

public class Controller {

    public String DB_URL = "jdbc:mysql://localhost:3306/oop_data";
    public String USERNAME = "root";
    public String PASSWORD = "root";

    // Method to get and display a list of all persons within the database
    public String listPerson(){
        String response = "";
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
            while(resultSet.next())
                response = response + resultSet.getString("id") + ", " +
                        resultSet.getString("fname") + ", " +
                        resultSet.getString("mname") + ", " +
                        resultSet.getString("lname") + ", " +
                        resultSet.getString("phone") + ", " +
                        resultSet.getString("email") + " " + "\n";

            connection.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }

    //
    public void addPerson(String fname, String mname, String lname, String phone, String uniqueID,
                          String email){

        try{
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);


            Statement statement = connection.createStatement();
            String add = "INSERT INTO person(fname, mname, lname, id, phone, email)" +
                    "VALUES('" + fname + "', '" + mname + "', '" + lname + "', '" + uniqueID + "', '" +  phone
                    + "', '" + email + "')";
            statement.executeUpdate(add);

            connection.close();

        } catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    public void removePerson(String uniqueID){
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            String remove = "DELETE FROM person WHERE id=" + uniqueID;
            statement.executeUpdate(remove);
            connection.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
