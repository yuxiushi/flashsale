package com.yuxiu.flashsale.db.mappers;

import com.yuxiu.flashsale.db.po.FlashSaleCommodity;

public interface FlashSaleCommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashSaleCommodity record);

    int insertSelective(FlashSaleCommodity record);

    FlashSaleCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashSaleCommodity record);

    int updateByPrimaryKey(FlashSaleCommodity record);
}