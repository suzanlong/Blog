package com.suzanlong.service;

import java.util.List;

import com.suzanlong.po.Items;
import com.suzanlong.po.ItemsCustom;

public interface ItemsService {
	public List<Items> findItemsList() throws Exception;
	
	//第二步
	public Items findItemsById(Integer id) throws Exception;
	
	public void updateItems(Items items)throws Exception;
	
	public void insertItems(Items items)throws Exception;
	
	public void deleteItems(Integer id) throws Exception;
	//包装类
	public ItemsCustom getTitleShow(Integer id)throws Exception;
	
}
