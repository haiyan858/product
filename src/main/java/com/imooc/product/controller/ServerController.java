package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 23:52
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String msg(){
        return "this is product's msg!";
    }
}
