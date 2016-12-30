package com.nju.controller;

import com.nju.entity.Clock;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xmc1993 on 16/4/8.
 */
@Controller
@RequestMapping("/api")
public class ShowController {

    @RequestMapping("/test")
    public Clock test(){
        Clock clock = new Clock();
        return clock;
    }
}
