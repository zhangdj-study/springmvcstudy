package com.neusiri.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangdj
 * @date 2019/11/26
 */
public class BeanController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        System.out.println("BeanController run...");
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("name","zhangsan");
        throw new RuntimeException();
    }
}
