package com.suzanlong.service;

import java.util.List;

import com.suzanlong.po.Items;


public interface ItemsService {
	public List<Items> findItemsList() throws Exception;
	
	//第二步
	public Items findItemsById(Integer id) throws Exception;
	
	public void updateItems(Items items)throws Exception;
	
	public void insertItems(Items items)throws Exception;
	
	public void deleteItems(Integer id) throws Exception;
	//包装类

}
