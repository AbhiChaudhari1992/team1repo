package com.javainuse.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController implements ErrorController{
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	@RequestMapping("/login.html")
	public ModelAndView secondPage() {
		return new ModelAndView("login");
	}
	@RequestMapping("/error.html")
	public ModelAndView thirdPage() {
		return new ModelAndView("error");
	}
	@RequestMapping("/success.html")
	public ModelAndView fourthPage() {
		return new ModelAndView("success");
	}
}