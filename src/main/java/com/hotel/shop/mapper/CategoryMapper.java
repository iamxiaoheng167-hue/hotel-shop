package com.hotel.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.shop.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类Mapper接口
 * 继承BaseMapper<Category>后自动拥有selectList()、insert()、update()、delete()等方法
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
