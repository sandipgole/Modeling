package com.texas.student.management.testModel;

public class Student extends UserInfo{
    private String regNumber;
    private String symbolNumber;
    private String house;
    private StudentType studentType;
    private ParentInformation parentInformation;
    private UserInfo userInfo;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getSymbolNumber() {
        return symbolNumber;
    }

    public void setSymbolNumber(String symbolNumber) {
        this.symbolNumber = symbolNumber;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public ParentInformation getParentInformation() {
        return parentInformation;
    }

    public void setParentInformation(ParentInformation parentInformation) {
        this.parentInformation = parentInformation;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public enum StudentType
    {
        FEE,SCHOLARSHIP
    }
}


