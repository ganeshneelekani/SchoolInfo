package org.StudentInfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.StudentInfo.model.Login;
import org.StudentInfo.model.student.Student;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
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
        mav.addObject("studentRegistration", new Student());


        return mav;
    }

}
