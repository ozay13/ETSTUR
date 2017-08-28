/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ets.controller;

import com.ets.model.Otel;
import com.ets.util.HtmlParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ozaytunctan13
 */
@Controller
public class OtelController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping("/otelara")
    public ModelAndView showOtelDetay(@RequestParam(value = "url") String url) {
       
        ModelAndView mv = new ModelAndView("detail");
        HtmlParser parse=new HtmlParser(url);
        Otel[]ot=parse.getValue();
        mv.addObject("otel",ot);
        return mv;
    }
}
