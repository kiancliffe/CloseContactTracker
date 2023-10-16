// Kian Cliffe
// R00179744
// SD2 - B

package GUI;

import controller.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Tab1 extends Tab {
    private GridPane grid;
    private Button addBtn, removeBtn, listBtn, exitBtn;
    private TextArea textArea;
    private Text sceneTitle;
    private Label firstName;
    private Label middleName;
    private Label lastName;
    private Label uniqueID;
    private Label email;
    private Label phoneNum;
    private final TextField firstNameField;
    private final TextField middleNameField;
    private final TextField lastNameField;
    private final TextField uniqueIDField;
    private final TextField emailField;
    private final TextField phoneNumField;

    private static final Controller ctrl = new Controller();

    public Tab1(){

        setText("Tab 1");

        grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Creating buttons and HBox
        addBtn = new Button("ADD");
        removeBtn = new Button("Remove");
        listBtn = new Button("List");
        HBox h1 = new HBox(10);
        grid.add(h1, 0, 7);
        h1.getChildren().addAll(addBtn, removeBtn, listBtn);

        // Exit button
        exitBtn = new Button("Exit");
        HBox h2 = new HBox(10);
        h2.setAlignment(Pos.BOTTOM_RIGHT);
        h2.getChildren().add(exitBtn);
        grid.add(h2, 1, 8);


        // Event handler for Exit button
        exitBtn.setOnAction(e -> {
            System.exit(0);
        });

        // Adding text area and creating VBox
        textArea = new TextArea();
        HBox h3 = new HBox(10);
        h3.getChildren().add(textArea);
        grid.add(h3, 1, 7);

        // Welcome Text
        sceneTitle = new Text("----Enter contact details below----");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        grid.add(sceneTitle, 0, 0, 2, 1);

        // First name text
        firstName = new Label("First Name:");
        grid.add(firstName, 0, 1);

        // Text field for first name
        firstNameField = new TextField();
        grid.add(firstNameField, 1, 1);

        // Middle name text
        middleName = new Label("Middle Name:");
        grid.add(middleName, 0, 2);

        // Text field for last name
        middleNameField = new TextField();
        grid.add(middleNameField, 1, 2);

        // Last name text
        lastName = new Label("Last Name:");
        grid.add(lastName, 0, 3);

        // Text field for last name
        lastNameField = new TextField();
        grid.add(lastNameField, 1, 3);

        // Email text
        email = new Label("Email:");
        grid.add(email, 0, 4);

        // Text field for last name
        emailField = new TextField();
        grid.add(emailField, 1, 4);

        // Unique ID text
        uniqueID = new Label("Unique ID:");
        grid.add(uniqueID, 0, 5);

        // Text field for last name
        uniqueIDField = new TextField();
        grid.add(uniqueIDField, 1, 5);

        // Phone Number text
        phoneNum = new Label("Phone Number:");
        grid.add(phoneNum, 0, 6);

        // Text field for last name
        phoneNumField = new TextField();
        grid.add(phoneNumField, 1, 6);


        // Event handler for when add button is pressed
        addBtn.setOnAction(e -> {

            //public void handle(ActionEvent event) {
                String fname = firstNameField.getText();
                String mname = middleNameField.getText();
                String lname = lastNameField.getText();
                String uniqueID = uniqueIDField.getText();
                String phone = phoneNumField.getText();
                String email = emailField.getText();

                ctrl.addPerson(fname, mname, lname, phone, uniqueID, email);
        });


        // List Button Handler
        String currentText = textArea.getText() + "\n";

        listBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                String result = ctrl.listPerson();
                textArea.setText(currentText + result);

            }
        });


        // Remove Button Handler
        removeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String temp = uniqueIDField.getText();
                ctrl.removePerson(temp);
            }
        });

        setContent(grid);

    }
}
