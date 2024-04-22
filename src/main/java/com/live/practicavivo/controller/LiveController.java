package com.live.practicavivo.controller;


import com.live.practicavivo.model.LiveDto;
import com.live.practicavivo.service.LiveServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = ("/api/live"))
public class LiveController  implements LiveApi{

    private final LiveServiceImpl service;

    @Override
    public String say() {
        return "Hello World";
    }

    @Override
    public LiveDto saveLive(LiveDto dto) {
        return service.addLive(dto);
    }
}
