package com.itheima.service;

import com.itheima.domain.Item;

import java.util.List;

public interface ItemService {

    /**
     * 全查询
     * @return
     */
    abstract List<Item> findAll();
}
