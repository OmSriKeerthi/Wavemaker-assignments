package com.controller;

import com.model.chef;
import com.services.chefService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/chef")
public class chefController {
    @Autowired
    chefService chefService;


    private static final Logger logger = LoggerFactory.getLogger(chefController.class);

    @GetMapping
    public List<chef> getchef() {
        logger.info("chef List");
        return chefService.getchef();
    }

    @PostMapping("/create")
    public chef createchef(@RequestBody chef chef) {
        logger.info("create chef is invoked{}", chef);
        return chefService.create(chef);
    }

    @GetMapping("/{id}")
    public chef getchefById(@PathVariable("id") int chef_id){
        logger.info("getchefById is invoked with chef Id : {}",chef_id);
        return chefService.getchefById(chef_id);
    }
    @PutMapping("/update")
    public chef updatechef(@RequestBody chef chef){
        return chefService.updatechef(chef);
    }

    @DeleteMapping("/{id}")
    public chef deletechefById(@PathVariable("id") int chef_id){
        return chefService.deletechefById(chef_id);
    }
}

