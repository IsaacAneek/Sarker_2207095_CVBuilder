package com.example.cvbuilder;

import javafx.fxml.FXML;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public void updateDB() {
        if(connection != null) {
            try{
                String insert = "INSERT INTO cvinfo (name, family_name, desired_position, address, nationality) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insert);
                preparedStatement.setString(1, textFieldName);
                preparedStatement.setString(2, textFieldFamilyName);
                preparedStatement.setString(3, textFieldDesiredJobPosition);
                preparedStatement.setString(4, textFieldAddress);
                preparedStatement.setString(5, textFieldCity);
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
