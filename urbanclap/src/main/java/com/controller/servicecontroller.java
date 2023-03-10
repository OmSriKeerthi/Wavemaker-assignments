package com.controller;

import com.model.LocationModel;
import com.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/serviceApi")
public class servicecontroller {
    @RequestMapping(value = "/services", method = RequestMethod.GET, headers = "Accept=application/json")
    public ModelAndView addUser(@ModelAttribute("locationData") LocationModel location) {
        System.out.println("Phone:::" + location.getPhone() + ", Email:" + location.getEmail() + ", Name:" + location.getName());

        try {
            ModelAndView mav = new ModelAndView("services");
            mav.addObject("location", location);
            return mav;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
