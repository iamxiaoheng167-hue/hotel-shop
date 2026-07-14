package com.hotel.shop.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品实体类
 */
@Data
public class Goods {

    /**
     * 商品ID
     */
    private Long id;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 状态（0-下架，1-上架）
     */
    private Integer status;

}
