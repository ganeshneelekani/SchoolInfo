package org.StudentInfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import org.StudentInfo.model.Login;
import org.StudentInfo.model.student.Student;
import org.StudentInfo.model.teacher.Teacher;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gn033604 on 9/7/17.
 */
@Controller
public class RegistrationController {

    static Logger LOGGER = Logger.getLogger(RegistrationController.class);

    @RequestMapping(value = "/RegisterStudent", method = RequestMethod.GET)
    public ModelAndView getRegistrationModel(HttpServletRequest request, HttpServletResponse response) {


        LOGGER.info("===================4===============");

        ModelAndView mav = new ModelAndView("studentRegistration");

        Teacher teacher=new Teacher();
        Teacher teacher1=new Teacher();
        teacher.setTeacherId("TeacherId");
        teacher1.setTeacherId("TeacherID2");

        List list=new ArrayList();
        list.add(teacher);
        list.add(teacher1);

        mav.addObject("faculties", list);
        mav.addObject("studentRegistration", new Student());

        return mav;
    }


    @RequestMapping(value = "/RegisterStudentDetails", method = RequestMethod.POST)
    public ModelAndView getRegistrationStudentDetails(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("studentRegistration") Student student) {


        LOGGER.info("===================5===============");

        LOGGER.info(student.getStudentId());
        LOGGER.info(student.getStudentName());
        LOGGER.info(student.getStudentGender());
        LOGGER.info(student.getStudentClass());
        LOGGER.info(student.getClassTeacherId());
        LOGGER.info(student.getStudentSection());
        LOGGER.info(student.getGuardianEmailAddress());
        LOGGER.info(student.getGuardianName());
        LOGGER.info(student.getGurdianContactNumber());
        LOGGER.info(student.getGurdianContactNumber());
        LOGGER.info(student.getPassword());
        LOGGER.info(student.getStudentAddress());





        return null;
    }

}
