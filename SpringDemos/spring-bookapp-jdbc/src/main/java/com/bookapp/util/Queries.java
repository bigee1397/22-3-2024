package com.bookapp.util;

public class Queries {

    public static final String INSERTQUERY = "Insert into bookappjdbc (bookTitle, bookAuthor, bookCategory, bookPrice) values (?,?,?,?);";
    public static final String UPDATEQUERY = "Update bookappjdbc set bookPrice=? where bookId=?";
    public static final String DELETEQUERY = "Delete from bookappjdbc where bookId=?";

    public static final String SELECTQUERY = "Select * from bookappjdbc";
    public static final String SELECTBYAUTHORQUERY = "Select * from bookappjdbc where bookAuthor=?";
    public static final String SELECTBYCATEGORYQUERY = "Select * from bookappjdbc where bookCategory=?";

    public static final String SELECTBYPRICEQUERY = "Select * from bookappjdbc where bookPrice<?";
    public static final String SELECTBYAUTHORCATQUERY = "Select * from bookappjdbc where bookAuthor=? and bookCategory=?";
    public static final String SELECTBYIDQUERY = "Select * from bookappjdbc where bookId=?";

}
