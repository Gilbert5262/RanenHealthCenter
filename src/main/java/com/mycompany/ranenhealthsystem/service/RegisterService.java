
package com.mycompany.ranenhealthsystem.service;



public class RegisterService {

    private  int opdno;
    private  String fname;
    private String lname;
    private int age;
    private int ph;
    private String location;
    private String address;
    private String Sex;

    public RegisterService(int opdno, String fname, String lname, int age, int ph, String location, String address, String Sex) {
        this.opdno = opdno;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.ph = ph;
        this.location = location;
        this.address = address;
        this.Sex = Sex;
    }

    public RegisterService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getOpdno() {
        return opdno;
    }

    public void setOpdno(int opdno) {
        this.opdno = opdno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

   
    }

    
   