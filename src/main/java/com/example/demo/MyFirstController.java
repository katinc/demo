package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    @RequestMapping("/add/{a}/{b}")
    @ResponseBody public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
        return a + b;
    }

//    @RequestMapping("/sub/{a}/{b}")
//    @ResponseBody public int sub(@PathVariable ("a") int a, @PathVariable("b") int b){
//        return a - b;
//    }

    @RequestMapping("/div/{a}/{b}")
    @ResponseBody public double divide(@PathVariable ("a") int a, @PathVariable("b") int b){
        return a / b;
    }

    @RequestMapping("/mul/{a}/{b}")
    @ResponseBody public int multiply(@PathVariable ("a") int a, @PathVariable("b") int b){
        return a * b;
    }

    @RequestMapping("/mod/{a}/{b}")
    @ResponseBody public int mod(@PathVariable ("a") int a, @PathVariable("b") int b){
        return a % b;
    }
}
