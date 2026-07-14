package com.hotel.shop.service;

import com.hotel.shop.entity.Category;

import java.util.List;

/**
 * 商品分类Service接口
 */
public interface CategoryService {

    /**
     * 获取分类列表
     * @return 分类列表
     */
    List<Category> getCategoryList();

}
