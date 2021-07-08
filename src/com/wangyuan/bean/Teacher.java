package com.wangyuan.bean;

public class Teacher {
    private String tName;
    private String gender;

    public Teacher() {
    }

    public Teacher(String tName, String gender) {
        this.tName = tName;
        this.gender = gender;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
