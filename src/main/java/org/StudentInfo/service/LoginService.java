package org.StudentInfo.service;

import java.util.List;

import org.StudentInfo.model.Login;
import org.StudentInfo.model.student.Student;

/**
 * Created by gn033604 on 9/2/17.
 */
public interface LoginService {

    public Login validateUser(Login login);

    public List<Student> listofStudent();
}
