package com.dao;

import com.google.protobuf.Service;
import com.model.service;

import java.util.List;

public interface ServiceDAO {
    public List<service> services();
}
