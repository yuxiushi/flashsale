package com.yuxiu.flashsale.db.mappers;

import com.yuxiu.flashsale.db.po.FlashSaleActivity;

public interface FlashSaleActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashSaleActivity record);

    int insertSelective(FlashSaleActivity record);

    FlashSaleActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashSaleActivity record);

    int updateByPrimaryKey(FlashSaleActivity record);
}