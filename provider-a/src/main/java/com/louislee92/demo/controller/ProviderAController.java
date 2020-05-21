package com.louislee92.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProviderAController {

    @GetMapping("/getUser/{id}")
    public String get(@PathVariable String id) {
        log.info("获取用户：{}", id);
        return "user:id=" + id;
    }
}
