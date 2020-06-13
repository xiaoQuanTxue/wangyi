package com.wangyii.entity;

public class Lecturer {
    private Integer id;

    private String lecturername;

    private String lecturepassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLecturername() {
        return lecturername;
    }

    public void setLecturername(String lecturername) {
        this.lecturername = lecturername == null ? null : lecturername.trim();
    }

    public String getLecturepassword() {
        return lecturepassword;
    }

    public void setLecturepassword(String lecturepassword) {
        this.lecturepassword = lecturepassword == null ? null : lecturepassword.trim();
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "id=" + id +
                ", lecturername='" + lecturername + '\'' +
                ", lecturepassword='" + lecturepassword + '\'' +
                '}';
    }
}