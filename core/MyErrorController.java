package com.xin.aoc.controller.core;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping(value = "/error")
    public String handleError(){
        return "404";
    }
//    public String error(Model model, HttpServletRequest request) {
//        return "core/index";
//    }
}
