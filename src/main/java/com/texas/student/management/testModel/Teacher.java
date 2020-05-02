package com.texas.student.management.testModel;

import java.sql.Time;

public class Teacher
{
    private String teachingSubject;
    private Time teachingTime;
    private UserInfo userInfo;

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public Time getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(Time teachingTime) {
        this.teachingTime = teachingTime;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
