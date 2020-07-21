package com.nttdata.gpc.demorestapi.controllers;

import com.nttdata.gpc.demorestapi.models.TimeModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("time")
public class TimeController {
    @GetMapping()
    public TimeModel getCurrentTime() {
        return new TimeModel(new Date());
    }

}
