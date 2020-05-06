package com.texas.student.management.testModel;

import java.sql.Timestamp;

public class UserInfo {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Timestamp yearEnrolled;
    private Timestamp dateOfBirth;
    private Gender gender;
    private String bloodGroup;
    private Address address;
    private Status status;
    private Disability disability;
    private String ethnicGroup;
    private String history;
    private String remarks;
    private Role role;

    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public enum Status {
        ACTIVE, PASSIVE,LEFT
    }

    public enum Disability{
        BLIND,DEAF,HANDICAP,IMMOBILE,NULL

    }

    public enum Role{
        STUDENT,
        TEACHER,
        STAFF,
        ADMIN,
        LIBRARIAN,
        HEAD,
        DRIVER,
        GUARD,
        CLEANING


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Timestamp getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(Timestamp yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Disability getDisability() {
        return disability;
    }

    public void setDisability(Disability disability) {
        this.disability = disability;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
