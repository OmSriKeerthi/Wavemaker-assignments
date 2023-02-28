package com.services;

import com.model.customers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface customersService {
    List<customers> getcustomers();

    customers create(customers customers);


    customers getcustomersById(int customer_id);

    customers updatecustomers(customers customers);


    customers deletecustomersById(int customer_id);
}
