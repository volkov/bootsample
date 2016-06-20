package ru.volkov.bootsample.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;


import java.util.stream.Collectors;


import ru.volkov.bootsample.entity.Location;
import ru.volkov.bootsample.repository.LocationRepository;

@Controller
public class MainController {

  @Resource
  LocationRepository locationRepository;

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hi, here list of locations:\n"
           + locationRepository.findAll().stream().map(Location::getName).collect(Collectors.joining("\n"));
  }

}