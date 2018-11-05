package com.itheima.service.impl;

import com.itheima.dao.ItemMapper;
import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemMapper itemMapper;

    /**
     * 全查询
     * @return
     */
    @Override
    public List<Item> findAll() {
        return itemMapper.findAll();
    }
}
