package org.drsblog.controller;

import org.drsblog.representation.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 5/19/2015
 *
 * @author drmod
 */
@Controller
public class RestTestController {

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    @ResponseBody
    public Student getStudent(@RequestParam(value = "name", defaultValue = "Dima") String name){
        return new Student(name, "Hello world");
    }

    @RequestMapping(value = "/rest", method = RequestMethod.POST)
    @ResponseBody
    public Student getStudent(@RequestBody Student student){
        return student;
    }

}
