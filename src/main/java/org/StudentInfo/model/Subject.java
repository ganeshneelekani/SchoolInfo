package org.StudentInfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gn033604 on 7/2/17.
 */
@Entity
@Table(name="SUBJECT")
public class Subject {

    @Column(name="SubjectId")
    private  String subjectId;

    @Column(name="subjectName")
    private  String subjectName;


    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
