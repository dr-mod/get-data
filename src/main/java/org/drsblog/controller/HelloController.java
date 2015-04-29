package org.drsblog.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Dmitriy on 4/29/2015.
 */
@Controller
public class HelloController {

    public static final String JSP_NAME = "submit";
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    public String processor(@RequestParam("name") String param, Model model){
        model.addAttribute("name", param);
        logger.debug("[test] name = {}", param);
        return JSP_NAME;
    }



}
