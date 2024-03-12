package com.shoping.onlineshop.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
public class CssController {

    private final ResourceLoader resourceLoader;

    public CssController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @GetMapping(value = "/css/style.css", produces ="text/css")
    @ResponseBody
    public String getCss() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:static/css/style.css");
        byte[] bytes = resource.getInputStream().readAllBytes();
        return new String(bytes, StandardCharsets.UTF_8);
    }
}

