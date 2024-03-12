package com.yerencheng.mybatisdemo.feign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentFeignFallback implements StudentFeign {
    @Override
    public List getStudents() {
        return new ArrayList();
    }
}
