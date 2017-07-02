package org.StudentInfo.model.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Map;

/**
 * Created by gn033604 on 7/2/17.
 */

@Entity
@Table(name="STUDENT_SUBJECT_DETAIL")
public class StudentSubjectDetail {


    @Column(name="STUDENT_ID")
    private String studentId;

    @Column(name="STUDENT_SUBJECT")
    private  String studentSubject;

    @Column(name="TEACHER_ID")
    private  String teacherId;

    @Column(name="TEACHER_NAME")
    private  String teacherName;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        this.studentSubject = studentSubject;
    }

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
}
