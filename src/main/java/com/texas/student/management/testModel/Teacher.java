package com.texas.student.management.testModel;

import java.security.SecureRandom;
import java.sql.Time;
import java.sql.Timestamp;

public class Teacher extends UserInfo
{
    private String teachingSubject;
    private Timestamp teachingTime;
    private String qualification;
    private String experience;
    private Type type;
    private UserInfo userInfo;

    public enum Type
    {
        PART_TIME,
        FULL_TIME
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public Timestamp getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(Timestamp teachingTime) {
        this.teachingTime = teachingTime;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
