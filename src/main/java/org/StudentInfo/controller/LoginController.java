package org.StudentInfo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    static Logger LOGGER = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {


        return "welcome";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect() {

        LOGGER.info("==========1======");
        return "redirect:/LoginPage.htm";
    }
}