package com.org.example.springboot.web;

import com.org.example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController : 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "test_hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }

}
