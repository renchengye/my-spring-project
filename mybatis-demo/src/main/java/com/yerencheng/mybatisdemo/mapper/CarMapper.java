package com.yerencheng.mybatisdemo.mapper;

import com.yerencheng.mybatisdemo.domain.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CarMapper {

    @Select("select * from car")
    List<Car> findAll();

    @Select("select * from car where brand = #{brand}")
    Car findByState(@Param("brand") String brand);

}
