package com.itheima.dao;

import com.itheima.domain.Item;

import java.util.List;

public interface ItemMapper {

    /**
     * 全查询
     * @return
     */
    abstract List<Item> findAll();

}
