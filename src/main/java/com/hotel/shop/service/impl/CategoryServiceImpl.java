package com.hotel.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.shop.entity.Category;
import com.hotel.shop.mapper.CategoryMapper;
import com.hotel.shop.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品分类Service实现类
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Override
    public List<Category> getCategoryList() {
        return this.lambdaQuery()
                .orderByAsc(Category::getSort)
                .list();
    }

}
