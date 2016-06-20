package ru.volkov.bootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.Resource;


import ru.volkov.bootsample.entity.Location;
import ru.volkov.bootsample.repository.LocationRepository;

/**
 * User: serg-v
 * Date: 6/21/16
 * Time: 12:16 AM
 */
@Controller
public class LocationController {

  @Resource
  LocationRepository locationRepository;

  @RequestMapping(path = "/location", method = RequestMethod.GET)
  public String showLocation(Model model) {
    model.addAttribute("location", new Location("name","description"));
    return "location";
  }

  @RequestMapping(path = "/location", method = RequestMethod.POST)
  public String addLocation(@ModelAttribute Location location) {
    locationRepository.save(location);
    return "location";
  }


}
