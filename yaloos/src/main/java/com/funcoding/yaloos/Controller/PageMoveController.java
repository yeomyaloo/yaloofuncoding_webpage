package com.funcoding.yaloos.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/form")
@Controller
public class PageMoveController {
    @RequestMapping("/project")
    public String projectPage(){
        return "/form/project";
    }

}
