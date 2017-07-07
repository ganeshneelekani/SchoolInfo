package org.StudentInfo.dao;

import java.util.List;

import org.StudentInfo.model.Login;
import org.StudentInfo.model.student.Student;

/**
 * Created by gn033604 on 9/2/17.
 */
public interface LoginDao {


        public Login validateUser(Login login);

        public List<Student> listofStudent();
}
