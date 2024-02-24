package com.bikash.bikash;

public class RegistationDetails {

    String fristName;
    String lastName;
    String mobileNumber;
    String userName;
    String password;
    String confrompassword;
    public void RegistationDetails (){

    }

    public RegistationDetails(String fristName, String lastName, String mobileNumber, String userName, String password, String confrompassword) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.userName = userName;
        this.password = password;
        this.confrompassword = confrompassword;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mo) {
        this.mobileNumber = mo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password4 ) {
        this.password = password4 ;
    }

    public String getConfrompassword() {
        return confrompassword;
    }

    public void setConfrompassword(String confrompassword) {
        this.confrompassword = confrompassword;
    }

    public void RegistationDetails (String fristName, String lastName, String mobileNumber, String userName, String password, String confrompassword){
        {
            this.fristName=fristName;
            this.lastName=lastName;
            this.mobileNumber=mobileNumber;
            this.userName=userName;
            this.password=password;
            this.confrompassword=confrompassword;

        }




    }



}
