package com.fang.controller;

import com.fang.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("just")
    @ResponseBody
    public String dosome(@RequestParam int id) {
        System.out.println("~~调用~~");
        String person = "可能是空的吧";
        if (personService != null) {
            person = personService.getPerson(id);
        }
        return person;
    }
    @RequestMapping("/")
    public String index() {
        System.out.println("~~index调用~~");
        return "index";
    }
}
