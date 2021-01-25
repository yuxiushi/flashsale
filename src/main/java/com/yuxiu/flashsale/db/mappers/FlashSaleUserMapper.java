package com.yuxiu.flashsale.db.mappers;

import com.yuxiu.flashsale.db.po.FlashSaleUser;

public interface FlashSaleUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashSaleUser record);

    int insertSelective(FlashSaleUser record);

    FlashSaleUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashSaleUser record);

    int updateByPrimaryKey(FlashSaleUser record);
}