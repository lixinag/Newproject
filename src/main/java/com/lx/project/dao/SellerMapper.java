package com.lx.project.dao;

import com.lx.project.po.Seller;

public interface SellerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}