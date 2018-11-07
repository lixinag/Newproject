package com.lx.project.dao;

import com.lx.project.po.Card;

public interface CardMapper {
    int deleteByPrimaryKey(String id);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}