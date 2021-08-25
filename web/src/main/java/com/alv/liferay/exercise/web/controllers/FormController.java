package com.alv.liferay.exercise.web.controllers;

import com.alv.liferay.exercise.api.FormService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    private final FormService formService;

    public FormController(final FormService formService) {
        this.formService = formService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }
}
