package com.geekster.urlCounter.controllers;

import com.geekster.urlCounter.services.urlService;
import com.geekster.urlCounter.users.userClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class urlController {
    @Autowired
    urlService urlservice;
    @RequestMapping(value="/user/{userName",method= RequestMethod.GET)
    public userClass urlHit(@PathVariable String userName){
        return urlservice.urlCount(userName);
    }
}
