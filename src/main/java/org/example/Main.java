package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Date;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

//        Date date = Date.valueOf("2004-01-02");

       // Doctor doctor = new Doctor("Aline", "Iradukunda", "Cardiology", 0757342, "irak@gmai.com");
        Patient patient = new Patient("Ange", "Munezero", "female",0757342, "ange@gmai.com");


        ApplicationContext myContext = new AnnotationConfigApplicationContext("org.example");

        hospitalService service  = myContext.getBean(hospitalService.class);
        service.savePatient(patient);

    }
}