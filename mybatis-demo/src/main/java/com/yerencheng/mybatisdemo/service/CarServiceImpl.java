package com.yerencheng.mybatisdemo.service;

import com.yerencheng.mybatisdemo.mapper.CarMapper;
import com.yerencheng.mybatisdemo.rest.CarController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final static Logger logger = LoggerFactory.getLogger(CarServiceImpl.class);

    @Autowired
    CarMapper carMapper;

    @Override
    public List listAllCars() {
        logger.info("carMapper.findAll");
        return carMapper.findAll();
    }
}
