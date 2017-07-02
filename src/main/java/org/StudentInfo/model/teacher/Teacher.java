package org.StudentInfo.model.teacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

import org.StudentInfo.model.Subject;
import org.StudentInfo.model.student.Student;

/**
 * Created by gn033604 on 7/2/17.
 */

@Entity
@Table(name="TEACHER")
public class Teacher {

    @Column(name="TEACHER_ID")
    private String teacherId;

    @Column(name="TEACHER_NAME")
    private String teacherName;

    @Column(name="TEACHER_CONTACT_NUMBER")
    private String teacherContactNumber;

    private Set<Subject> subjectExpertize;

    @Column(name="TEACHER_BDATE")
    private String teacherBdate;

    @Column(name="STUDENT_SET")
    private Set<Student> studentSet;

    @Column(name="TEACHER_ADDRESS")
    private String teacherAddress;


    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherContactNumber() {
        return teacherContactNumber;
    }

    public void setTeacherContactNumber(String teacherContactNumber) {
        this.teacherContactNumber = teacherContactNumber;
    }

    public Set<Subject> getSubjectExpertize() {
        return subjectExpertize;
    }

    public void setSubjectExpertize(Set<Subject> subjectExpertize) {
        this.subjectExpertize = subjectExpertize;
    }

    public String getTeacherBdate() {
        return teacherBdate;
    }

    public void setTeacherBdate(String teacherBdate) {
        this.teacherBdate = teacherBdate;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }
}
