package com.suzanlong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzanlong.mapper.ItemsMapper;
import com.suzanlong.po.Items;
import com.suzanlong.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> findItemsList() throws Exception {
		
		return itemsMapper.findItemsList();
	}
	
	//第二步
	@Override
	public Items findItemsById(Integer id) throws Exception {
		
		return itemsMapper.findItemsById(id);
	}

	@Override
	public void updateItems(Items items) throws Exception {
		itemsMapper.updateItems(items);
		
	}

	@Override
	public void insertItems(Items items) throws Exception {
		itemsMapper.insertItems(items);
		
	}

	@Override
	public void deleteItems(Integer id) throws Exception {
		itemsMapper.deleteItems(id);
		
	}

	
}
