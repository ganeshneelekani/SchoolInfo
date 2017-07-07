package org.StudentInfo.service.serviceImpl;


import java.util.List;

import org.StudentInfo.dao.LoginDao;
import org.StudentInfo.model.Login;
import org.StudentInfo.model.student.Student;
import org.StudentInfo.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gn033604 on 9/2/17.
 */
@Service
public class LoginServiceImpl implements LoginService{

    static Logger LOGGER = Logger.getLogger(LoginServiceImpl.class);

    @Autowired
    LoginDao loginDao;

    @Override
    public Login validateUser(Login login) {

        LOGGER.info(" ========== INSIDE LoginServiceImpl ");
        loginDao.validateUser(login);
        return  null;
    }


    @Override
    public List<Student> listofStudent() {
        loginDao.listofStudent();
    return  null;
    }
}