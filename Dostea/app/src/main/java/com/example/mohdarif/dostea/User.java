package com.example.mohdarif.dostea;

public class User{

    public  String FIRST_NAME;
    public  String LAST_NAME;
    public  String EMAIL;
    public  String USERNAME;
    public  String PASSWORD;
    public  String MOBILE;
    public User(String FIRST_NAME, String LAST_NAME, String EMAIL, String USERNAME, String PASSWORD, String MOBILE) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.EMAIL = EMAIL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.MOBILE = MOBILE;
    }
    public User(String USERNAME,String PASSWORD)
    {
        this.USERNAME=USERNAME;
        this.PASSWORD=PASSWORD;
    }
    public User() {

    }
    public String getUsername(){
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public String getFIRST_NAME() { return  FIRST_NAME; }

    public String getLAST_NAME() { return  LAST_NAME; }

    public String getEMAIL() { return EMAIL; }

    public String getUSERNAME() { return  USERNAME; }

    public String getMOBILE() { return  MOBILE; }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }
    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }
}
