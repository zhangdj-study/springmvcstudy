package com.neusiri.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangdj
 * @date 2020/12/11
 */
public class BeanNameHandlerController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("name","BeanNameHandlerController");
        return mv;
    }
}
