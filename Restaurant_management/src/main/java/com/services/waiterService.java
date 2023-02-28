package com.services;

import com.model.waiter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface waiterService {
    List<waiter> getwaiter();

    waiter create(waiter  waiter);


    waiter getwaiterById(int waiter_id);

    waiter updatewaiter(waiter waiter);


    waiter deletewaiterById(int waiter_id);
}
