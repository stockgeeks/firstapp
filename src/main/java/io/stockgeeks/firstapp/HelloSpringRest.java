package io.stockgeeks.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class HelloSpringRest {

  @GetMapping("/hello")
  public String hello(@PathParam("name") String name) {
    return "Hello, " + name;
  }
}
