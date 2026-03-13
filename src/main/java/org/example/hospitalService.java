package org.example;

import org.example.DAO.doctorDAO;
import org.example.DAO.patientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class hospitalService {

    @Autowired
    private doctorDAO doctorDAO;
    @Autowired
    private patientDAO patientDAO;



    public void saveDoctor (Doctor doctor) throws SQLException {
        doctorDAO.insertDoctor(doctor);
    }
    public void savePatient (Patient patient) throws SQLException {
        patientDAO.insertPatient(patient);
    }
}


//public class hospitalService {
//    private patientDAO patientDAO;
//
//    // Constructor to initialize patientDAO
//    public hospitalService() {
//        this.patientDAO = new patientDAO();  // Make sure patientDAO has a default constructor
//    }
//
//    public void savePatient(Patient patient) {
//        patientDAO.insertPatient(patient);
//    }
//}