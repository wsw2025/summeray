package com.xin.aoc.controller.core;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PricingController {

    @GetMapping(value = "/pricing")
    public String pricing(Model model, HttpServletRequest request) {
        return "core/pricing";
    }
}
