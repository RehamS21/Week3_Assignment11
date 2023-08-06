package com.example.rehamalmutairi_assignment11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(path = "/name")
    public String my_Name(){
        return "My name is Reham Almutairi";
    }
    @GetMapping(path = "/age")
    public String age(){
        return "My age is 23";
    }
    @GetMapping(path = "/check/status")
    public String status(){
        return "Everything OK";
    }

    @GetMapping(path="/health")
    public String your_health(){
        return "Server health is up and running";
    }

    @GetMapping(path = "/names")
    public String[] all_names(){
        String [] names = {"Raya","Reham","Rahaf","Sara"};

        return names;
    }


}
