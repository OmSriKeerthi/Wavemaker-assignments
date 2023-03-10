package com.controller;

import com.dao.LocationDAO;
import com.dao.UserDAO;
import com.model.Location;
import com.model.OtpModel;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/userService")
public class usercontroller {

    @Autowired
    UserDAO userDAO;

    @Autowired
    LocationDAO locationDAO;

    @GetMapping("/user")
    public ModelAndView userLogin(@RequestParam("phone") String phone){
        System.out.println("Phone:::"+phone);
        User user = userDAO.getUserByPhone(phone);
        if(user == null ){
            ModelAndView mav = new ModelAndView("addUser");
            mav.addObject("phone", phone);
            return mav;
        }else{
            ModelAndView mav = new ModelAndView("otpPage");
            mav.addObject("user", user);
            return mav;
        }
    }

    @RequestMapping(value = "/create",consumes = {"application/x-www-form-urlencoded"})
    public ModelAndView addUser(@ModelAttribute("userData") User user){
        System.out.println("Phone:::"+user.getPhone()+", Email:"+user.getEmail()+", Name:"+user.getName());

        try{
            userDAO.addUser(user);
            ModelAndView mav = new ModelAndView("otpPage");
            mav.addObject("user", user);
            return mav;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }

    @RequestMapping(value = "/validate",consumes = {"application/x-www-form-urlencoded"})
    public ModelAndView addUser(@ModelAttribute("otpData") OtpModel user){
        System.out.println("Phone:::"+user.getPhone()+", Email:"+user.getEmail()+", Name:"+user.getName());

        try{
            if(user.getOtp().equalsIgnoreCase("1234")){
                ModelAndView mav = new ModelAndView("location");
                User userObj = new User();
                userObj.setName(user.getName());
                userObj.setPhone(user.getPhone());
                userObj.setEmail(user.getEmail());
                mav.addObject("user", userObj);
               List<Location> locations = locationDAO.locations();
                mav.addObject("locations", locations);
                return mav;
            }else{
                throw new RuntimeException();
            }

        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
