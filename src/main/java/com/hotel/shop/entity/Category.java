package com.hotel.shop.entity;

import lombok.Data;

/**
 * 商品分类实体类
 */
@Data
public class Category {

    /**
     * 分类ID
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 状态（0-禁用，1-启用）
     */
    private Integer status;

}
