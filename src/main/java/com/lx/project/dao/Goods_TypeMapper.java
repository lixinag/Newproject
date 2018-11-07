package com.lx.project.dao;

import com.lx.project.po.Goods_Type;

public interface Goods_TypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods_Type record);

    int insertSelective(Goods_Type record);

    Goods_Type selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods_Type record);

    int updateByPrimaryKey(Goods_Type record);
}