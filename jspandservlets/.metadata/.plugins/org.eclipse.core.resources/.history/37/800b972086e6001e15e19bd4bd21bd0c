package com.doctorapp.util;

public class Queries {
    public static String INSERTQUERY = "insert into doctorappjdbc (doctor_name, speciality, experience, ratings, consultation_fees) values (?,?,?,?,?);";
    public static String UPDATEQUERY = "update doctorappjdbc set consultation_fees=? where doctor_id=?;";
    public static String DELETEQUERY = "delete from doctorappjdbc where doctor_id=?";
    public static String SELECTALL = "Select * from doctorappjdbc";
    
    public static String FINDBYID = "Select * from doctorappjdbc where doctor_id=?";
    public static String FINDBYSPECIALITY = "Select * from doctorappjdbc where speciality=?";
    public static String FINDBYSPECANDEXP = "Select * from doctorappjdbc where speciality=? and experience>?";
    public static String FINDBYSPECANDFEES = "Select * from doctorappjdbc where speciality=? and consultation_fees<?";
    public static String FINDBYSPECANDRATINGS = "Select * from doctorappjdbc where speciality=? and ratings>?";
    public static String FINDBYSPECANDNAMECONTAINS = "Select * from doctorappjdbc where speciality=? and doctor_name like ?";

}
