package com.yerencheng.mybatisdemo.rest;

import com.yerencheng.mybatisdemo.feign.StudentFeign;
import com.yerencheng.mybatisdemo.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private final static Logger logger = LoggerFactory.getLogger(CarController.class);

    @Autowired
    CarService carService;

    @Autowired
    StudentFeign studentFeign;

    @RequestMapping("/car")
    List listAllCars() {
        logger.info("carService.listAllCars");
        return carService.listAllCars();
    }

    @RequestMapping("/getStudents")
    List listAllStudents() {
        logger.info("studentFeign.getStudents()");
        return studentFeign.getStudents();
    }
}
