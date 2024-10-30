package com.zero.desensitization.controller;

import com.zero.desensitization.domain.entity.SystemUserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import red.zyc.desensitization.Sensitive;

@RestController
@RequestMapping("/desensitization")
public class DesensitizationController {

    @RequestMapping("/info")
    public SystemUserEntity showHelloWorld(){
        return Sensitive.desensitize(new SystemUserEntity(1,"Harries BLOG","400000000000000000","15900000000","1420000000@qq.com","123456789"));
    }

}