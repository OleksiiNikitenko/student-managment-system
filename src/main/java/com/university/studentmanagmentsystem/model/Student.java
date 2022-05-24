package com.university.studentmanagmentsystem.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String faculty;
    private String studyYear;
    private String grade;
    private String groupName;
    private String appRole;
    private String email;
    private String reserveEmail;
    private String phone;
    private String imgUrl;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student() {
    }

    public Student(Long id, String name, String faculty, String studyYear, String grade, String groupName, String appRole, String email, String reserveEmail, String phone, String imgUrl, String studentCode) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.studyYear = studyYear;
        this.grade = grade;
        this.groupName = groupName;
        this.appRole = appRole;
        this.email = email;
        this.reserveEmail = reserveEmail;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.studentCode = studentCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(String studyYear) {
        this.studyYear = studyYear;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String group) {
        this.groupName = group;
    }

    public String getAppRole() {
        return appRole;
    }

    public void setAppRole(String role) {
        this.appRole = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReserveEmail() {
        return reserveEmail;
    }

    public void setReserveEmail(String reserveEmail) {
        this.reserveEmail = reserveEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", faculty='" + faculty + '\'' +
            ", year='" + studyYear + '\'' +
            ", grade='" + grade + '\'' +
            ", group='" + groupName + '\'' +
            ", role='" + appRole + '\'' +
            ", email='" + email + '\'' +
            ", reserveEmail='" + reserveEmail + '\'' +
            ", phone='" + phone + '\'' +
            ", imgUrl='" + imgUrl + '\'' +
            ", studentCode='" + studentCode + '\'' +
            '}';
    }
}
