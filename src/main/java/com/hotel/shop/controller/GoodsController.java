package com.hotel.shop.controller;

import com.hotel.shop.entity.Goods;
import com.hotel.shop.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品Controller控制器
 */
@RestController
@RequestMapping("/api/goods")
public class GoodsController {

    private final GoodsService goodsService;

    /**
     * 构造函数注入GoodsService
     * @param goodsService 商品服务
     */
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /**
     * 查询商品列表接口
     * @return 商品列表
     */
    @GetMapping("/list")
    public List<Goods> list() {
        return goodsService.getGoodsList();
    }

}
