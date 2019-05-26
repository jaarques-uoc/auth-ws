package com.jaarquesuoc.shop.authws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/private")
    public String testPrivate() {
        return "private";
    }
}
