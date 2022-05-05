package com.funcoding.yaloos.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/form")
@RestController
public class PageMoveController {
    @GetMapping("/project")
    public String projectPage(){
        return "/form/project";
    }



}
