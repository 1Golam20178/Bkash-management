package com.bikash.bikash;

public class PersonDetails {
    private String mobile3;
    private String password3;

    public  PersonDetails (String mobile3,String password3) {
        this.mobile3=mobile3;
        this.password3=password3;

    }


    public void PersonDetails ()
    {

    }

    public String getMobile3() {
        return mobile3;
    }

    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3;
    }

    public String getPassword3() {
        return password3;
    }

    public void setPassword3(String password3) {
        this.password3 = password3;
    }
}
