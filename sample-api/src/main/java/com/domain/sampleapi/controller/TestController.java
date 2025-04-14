package com.domain.sampleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TestController {
  @GetMapping("/msg")
  public String getTestMessage(){
    return "Hello World";
  }
}
