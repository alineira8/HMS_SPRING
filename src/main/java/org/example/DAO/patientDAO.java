package org.example.DAO;


import org.example.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class patientDAO {

    @Autowired
    private Connection connection;



    public void insertPatient(Patient patient) throws SQLException {
        String query = "INSERT INTO patients(first_name, last_name,gender, phone_number, email) VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, patient.getFirst_name());
        preparedStatement.setString(2, patient.getLast_name());
        //preparedStatement.setString(3, patient.getDate_of_birth());
        preparedStatement.setString(3, patient.getGender());
        preparedStatement.setInt(4, patient.getPhone_number());
        preparedStatement.setString(5, patient.getEmail());


        preparedStatement.executeUpdate();
    }

//    public void insertPatient(Patient patient) {
//    }
}
