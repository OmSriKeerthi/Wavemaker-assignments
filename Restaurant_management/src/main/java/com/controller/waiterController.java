package com.controller;
import com.model.waiter;
import com.services.waiterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/waiter")
public class waiterController {
    @Autowired
    waiterService waiterService;

    private static final Logger logger= LoggerFactory.getLogger(waiterController.class);

    @GetMapping
    public List<waiter> getwaiter(){
        logger.info("waiter list");
        return waiterService.getwaiter();
    }

    @PostMapping("/create")
    public waiter createwaiter(@RequestBody waiter waiter){
        logger.info("create waiter is invoked{}",waiter);
        return waiterService.create(waiter);
    }

    @GetMapping("/{id}")
    public waiter getwaiterById(@PathVariable("id") int waiter_id){
        logger.info("getwaiterById is invoked with waiter Id: {}",waiter_id);
        return waiterService.getwaiterById(waiter_id);
    }

    @PutMapping("/update")
    public waiter updatewaiter(@RequestBody waiter waiter){return waiterService.updatewaiter(waiter);}


    @DeleteMapping("/{id}")
    public waiter deletewaiterById(@PathVariable("id") int waiter_id){return waiterService.deletewaiterById(waiter_id);}
}
