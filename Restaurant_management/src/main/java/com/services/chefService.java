package com.services;

import com.model.chef;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface chefService {
    List<chef> getchef();

    chef create(chef chef);


    chef getchefById(int chef_id);

    chef updatechef(chef chef);


    chef deletechefById(int chef_id);
}