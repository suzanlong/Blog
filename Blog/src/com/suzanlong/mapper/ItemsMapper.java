package com.suzanlong.mapper;

import java.util.List;

import com.suzanlong.po.Items;

public interface ItemsMapper {
	
	public List<Items> findItemsList();
	//第一步
	public Items findItemsById(Integer id);
	//更新
	public void updateItems(Items items);
	//添加
	public void insertItems(Items items);
	//
	public void deleteItems(Integer id);
}
