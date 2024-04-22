package com.live.practicavivo.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = ("/api/live"))
public class LiveController  implements LiveApi{


    @Override
    public String say() {
        return "Hello World";
    }
}
