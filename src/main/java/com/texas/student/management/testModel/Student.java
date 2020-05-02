package com.texas.student.management.testModel;

public class Student{
    private String regNumber;
    private String symbolNumber;
    private String grade;
    private String section;
    private String roomNumber;
    private String ethnicGroup;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
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


