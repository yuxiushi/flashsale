package com.yuxiu.flashsale.db.mappers;

import com.yuxiu.flashsale.db.po.FlashSaleOrder;

public interface FlashSaleOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashSaleOrder record);

    int insertSelective(FlashSaleOrder record);

    FlashSaleOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashSaleOrder record);

    int updateByPrimaryKey(FlashSaleOrder record);
}