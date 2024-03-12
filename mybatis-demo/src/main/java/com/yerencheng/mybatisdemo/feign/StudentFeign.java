package com.yerencheng.mybatisdemo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "student-client", fallback = StudentFeignFallback.class)
public interface StudentFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/student/listAllStudents")
    List getStudents();

}
