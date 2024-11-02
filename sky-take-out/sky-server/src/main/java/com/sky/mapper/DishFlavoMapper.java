package com.sky.mapper;

import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavoMapper {

    /**
     * 批量插入口味数据
     * @param flavoList
     */
    void insertBatch(List<DishFlavor> flavoList);
}
