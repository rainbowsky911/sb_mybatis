package com.huarui.entity;

public class StudentGroup {
    private Integer studentId;

    private Integer groupId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentId=" + studentId +
                ", groupId=" + groupId +
                '}';
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}