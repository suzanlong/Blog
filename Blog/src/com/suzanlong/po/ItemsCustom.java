package com.suzanlong.po;

import java.util.List;

public class ItemsCustom extends Items{
	private List<Items> showItems;
	private Items oneItems;


	public List<Items> getShowItems() {
		return showItems;
	}

	public void setShowItems(List<Items> showItems) {
		this.showItems = showItems;
	}

	public Items getOneItems() {
		return oneItems;
	}

	public void setOneItems(Items oneItems) {
		this.oneItems = oneItems;
	}


}
