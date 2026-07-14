package com.hotel.shop.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.shop.entity.Goods;
import com.hotel.shop.mapper.GoodsMapper;
import com.hotel.shop.service.GoodsService;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class GoodsServiceImpl
        extends ServiceImpl<GoodsMapper, Goods>
        implements GoodsService {



    @Override
    public List<Goods> getGoodsList(){


        return this.baseMapper.selectList(null);


    }


}