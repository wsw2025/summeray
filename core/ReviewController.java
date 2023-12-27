package com.xin.aoc.controller.core;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
    @GetMapping(value = "/reviews")
    public String reviews(Model model, HttpServletRequest request) {
        return "core/review";
    }

    @GetMapping(value = "/reviews_write")
    public String write_review(Model model, HttpServletRequest request) {
        return "review/write-review";
    }

    @GetMapping(value = "/reviews_page")
    public String review_page(Model model, HttpServletRequest request) {
        return "review/reviews-page";
    }

    @GetMapping(value = "/reviews_confirm")
    public String confirm_page(Model model, HttpServletRequest request) {
        return "review/confirm";
    }

}
