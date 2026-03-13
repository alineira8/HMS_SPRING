package org.example;

import java.sql.Date;

public class Patient {

    private String first_name;
    private String last_name;
//    private  Date date_of_birth;
    private String gender;
    private int phone_number;
    private String email;

    public Patient(String first_name, String last_name,String gender, int phone_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
//        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

//    public Date getDate_of_birth() {
//        return date_of_birth;
//    }

//    public void setDate_of_birth(Date date_of_birth) {
//        this.date_of_birth = date_of_birth;
//    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getDate_of_birth() {
//        return "date_of_birth";
//    }
}

