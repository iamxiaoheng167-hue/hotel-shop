package com.hotel.shop.controller;

import com.hotel.shop.entity.Category;
import com.hotel.shop.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品分类Controller控制器
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    /**
     * 构造函数注入CategoryService
     * @param categoryService 分类服务
     */
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * 查询分类列表接口
     * @return 分类列表
     */
    @GetMapping("/list")
    public List<Category> list() {
        return categoryService.getCategoryList();
    }

}
