package com.doctorapp.util;

public class Queries {
    public static String INSERTQUERY = "insert into doctorappjdbc (doctor_name, speciality, experience, ratings, consultation_fee) values (?,?,?,?,?);";
    public static String UPDATEQUERY = "update doctorappjdbc set consultation_fee=? where doctor_id=?;";
    public static String DELETEQUERY = "delete from doctorappjdbc where doctor_id=?";
    public static String SELECTALL = "Select * from doctorappjdbc";
    
    public static String FINDBYID = "Select * from doctorappjdbc where doctor_id=?";
    public static String FINDBYSPECIALITY = "Select * from doctorappjdbc where speciality like ?";
    public static String FINDBYSPECANDEXP = "Select * from doctorappjdbc where speciality=? and experience>?";
    public static String FINDBYSPECANDFEES = "Select * from doctorappjdbc where speciality=? and consultation_fee<?";
    public static String FINDBYSPECANDRATINGS = "Select * from doctorappjdbc where speciality=? and ratings>?";
    public static String FINDBYSPECANDNAMECONTAINS = "Select * from doctorappjdbc where speciality=? and doctor_name like ?";

}
//	   public static String INSERTQUERY = "insert into doctor (doctor_name, speciality, experience, ratings, consultation_fee) values (?,?,?,?,?);";
//	    public static String UPDATEQUERY = "update doctor set consultation_fee=? where doctor_id=?;";
//	    public static String DELETEQUERY = "delete from doctor where doctor_id=?";
//	    public static String SELECTALL = "Select * from doctor";
//	    
//	    public static String FINDBYID = "Select * from doctor where doctor_id=?";
//	    public static String FINDBYSPECIALITY = "Select * from doctor where speciality like ?";
//	    public static String FINDBYSPECANDEXP = "Select * from doctor where speciality=? and experience>?";
//	    public static String FINDBYSPECANDFEES = "Select * from doctor where speciality=? and consultation_fee<?";
//	    public static String FINDBYSPECANDRATINGS = "Select * from doctor where speciality=? and ratings>?";
//	    public static String FINDBYSPECANDNAMECONTAINS = "Select * from doctor where speciality=? and doctor_name like ?";
//
//	}
