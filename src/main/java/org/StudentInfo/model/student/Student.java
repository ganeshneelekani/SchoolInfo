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
    private String StudentGender;

    @Column(name = "STUDENT_BDATE")
    private Date StudentBDate;

    @Column(name = "STUDENT_CLASS")
    private String studentClass;

    @Column(name = "STUDENT_SECTION")
    private String studentSection;

    @Column(name = "CLASS_TEACHER_ID")
    private String classTeacherId;

    @Column(name = "STUDENT_ADDRESS")
    private String studentAddress;

    @Column(name = "GUARDIAN_NAME")
    private String guardianName;

    @Column(name = "GUARDIAN_EMAIL_ADDRESS")
    private String guardianEmailAddress;

    @Column(name = "GUARDIAN_CONTACT_NUMBER")
    private String gurdianContectNumber;

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
        return StudentGender;
    }

    public void setStudentGender(String studentGender) {
        StudentGender = studentGender;
    }

    public Date getStudentBDate() {
        return StudentBDate;
    }

    public void setStudentBDate(Date studentBDate) {
        StudentBDate = studentBDate;
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

    public String getClassTeacherId() {
        return classTeacherId;
    }

    public void setClassTeacherId(String classTeacherId) {
        this.classTeacherId = classTeacherId;
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

    public String getGurdianContectNumber() {
        return gurdianContectNumber;
    }

    public void setGurdianContectNumber(String gurdianContectNumber) {
        this.gurdianContectNumber = gurdianContectNumber;
    }
}