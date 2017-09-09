package org.StudentInfo.model.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "STUDENT_GENDER")
    private String studentGender;

    @Column(name = "STUDENT_BDATE")
    private Date studentBDate;

    @Column(name = "STUDENT_CLASS")
    private String studentClass;

    @Column(name = "STUDENT_SECTION")
    private String studentSection;

    @Column(name = "CLASS_TEACHER_NAME")
    private String classTeacherName;

    @Column(name = "STUDENT_ADDRESS")
    private String studentAddress;

    @Column(name = "GUARDIAN_NAME")
    private String guardianName;

    @Column(name = "GUARDIAN_EMAIL_ADDRESS")
    private String guardianEmailAddress;

    @Column(name = "GUARDIAN_CONTACT_NUMBER")
    private String gurdianContactNumber;

    @Column(name = "PASSWORD")
    private String password;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Date getStudentBDate() {
        return studentBDate;
    }

    public void setStudentBDate(Date studentBDate) {
        this.studentBDate = studentBDate;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianEmailAddress() {
        return guardianEmailAddress;
    }

    public void setGuardianEmailAddress(String guardianEmailAddress) {
        this.guardianEmailAddress = guardianEmailAddress;
    }

    public String getGurdianContactNumber() {
        return gurdianContactNumber;
    }

    public void setGurdianContactNumber(String gurdianContactNumber) {
        this.gurdianContactNumber = gurdianContactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}