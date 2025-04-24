package com.domain.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sample")
public class SampleController {
  @GetMapping("/msg")
  public String getMessage(){
    return "Hello World";
  }
}
