package org.example.DAO;


import org.example.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class doctorDAO {

    @Autowired
    private Connection connection;



    public void insertDoctor(Doctor doctor) throws SQLException {
        String query = "INSERT INTO doctors(first_name, last_name, specialty, phone_number, email) VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, doctor.getFirst_name());
        preparedStatement.setString(2, doctor.getLast_name());
        preparedStatement.setString(3, doctor.getSpecialty());
        preparedStatement.setInt(4, doctor.getPhone_number());
        preparedStatement.setString(5, doctor.getEmail());


        preparedStatement.executeUpdate();
    }

//    public void insertDoctor(Doctor doctor) {
//    }
}
