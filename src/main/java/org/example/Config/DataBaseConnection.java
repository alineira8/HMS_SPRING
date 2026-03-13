package org.example.Config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DataBaseConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/HospitalManagement ";
    private static final String user = "postgres";
    private static final String password = "Aline@123";

    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, user, password);

    }
}
