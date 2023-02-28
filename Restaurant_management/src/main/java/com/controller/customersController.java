package com.controller;

import com.model.customers;
import com.services.customersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/customers")

public class customersController {
    @Autowired
    customersService customersService;
    private static final Logger logger = LoggerFactory.getLogger(customersController.class);

    @GetMapping
    public List<customers> getcustomers(){
        logger.info("customers List");
        return customersService.getcustomers();
    }
    @PostMapping("/create")
    public customers createcustomers(@RequestBody customers customers){
        logger.info("create customers is invoked{}",customers);
        return customersService.create(customers);
    }

    @GetMapping("/{id}")
    public customers getcustomersById(@PathVariable("id") int customer_id){
        logger.info("getcustomersById is invoked with customers Id : {}",customer_id);
        return customersService.getcustomersById(customer_id);
    }
    @PutMapping("/update")
    public customers updatecustomers(@RequestBody customers customers){return customersService.updatecustomers(customers);}

    @DeleteMapping("/{id}")
    public customers deletecustomersById(@PathVariable("id") int customer_id){return customersService.deletecustomersById(customer_id);}
}
