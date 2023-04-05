package co.develhope.deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class BasicController {

    @GetMapping("")
    public Integer getSum(@RequestParam Integer n1, @RequestParam Integer n2){
        return n1 + n2;
    }


}
