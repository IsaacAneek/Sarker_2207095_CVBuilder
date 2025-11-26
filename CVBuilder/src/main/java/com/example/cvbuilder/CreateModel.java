package com.example.cvbuilder;

import javafx.fxml.FXML;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateModel {
    public String textFieldName;
    public String textFieldFamilyName;
    public String textFieldDesiredJobPosition;
    public String textFieldAddress;
    public String textFieldCity;
    public String textFieldEducation;
    public String textFieldEmailAddress;
    public String textFieldEmployer;
    public String textFieldGender;
    public String textFieldLinkedIn;
    public String textFieldNationality;
    public String textFieldPhoneNumber;
    public String textFieldPosition;
    public String textFieldSchool;
    public String textFieldSkill1;
    public String textFieldSkill2;
    public String textFieldSkill3;
    public String textFieldWorkCity;

    public double skillLevel1;
    public double skillLevel2;
    public double skillLevel3;

    public Connection connection;
    public CreateModel() throws SQLException {
        ConnectDB db = new ConnectDB();
        connection = db.getConnection();
        String create_table = "CREATE TABLE IF NOT EXISTS cvinfo (name TEXT PRIMARY KEY, family_name TEXT, desired_position TEXT, " +
                "address TEXT, nationality TEXT)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(create_table);

    }
}
