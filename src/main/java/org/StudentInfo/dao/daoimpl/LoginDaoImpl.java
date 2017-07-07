package org.StudentInfo.dao.daoimpl;

import java.util.Iterator;
import java.util.List;

import org.StudentInfo.dao.LoginDao;
import org.StudentInfo.model.Login;
import org.StudentInfo.model.student.Student;
import org.StudentInfo.service.serviceImpl.LoginServiceImpl;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gn033604 on 9/2/17.
 */
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

    static Logger LOGGER = Logger.getLogger(LoginServiceImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Login validateUser(Login login) {

        LOGGER.info(" =====  INSIDE LoginDaoImpl ");

        LOGGER.info(login.getUsername());
        LOGGER.info(login.getPassword());
       return  null;
    }

    @Override
    public List<Student> listofStudent() {


        List<Student> studentList= sessionFactory.getCurrentSession().createCriteria(Student.class).list();

        Iterator iterator=studentList.iterator();
        while (iterator.hasNext()){

            Student student= (Student) iterator.next();
            LOGGER.info(student.getStudentName()+"    *******");
        }

        return studentList;


    }
}
