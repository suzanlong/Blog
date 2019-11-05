package com.suzanlong.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.suzanlong.po.Items;
import com.suzanlong.service.ItemsService;

@Controller
public class MainShowController{

	@Autowired
	private ItemsService itemsService;
	
	//最普通的展示数据
	@RequestMapping("/blogmain")
	public ModelAndView blogmain(Integer id) throws Exception {
		
		System.out.println("控制器blogmain");
		List<Items> itemsList = itemsService.findItemsList();
		Items items= itemsService.findItemsById(id);
		
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.addObject("item", items);
		//modelAndView.addObject("itemsCustom", itemsCustom);
		modelAndView.setViewName("titleShow");
		return modelAndView;
	}
	//修改博客
	@RequestMapping("/editItemsSubmit")
	public ModelAndView editItemsSubmit(Integer id) throws Exception{
		
		System.out.println("editItemsSubmit控制");
		
		Items items = itemsService.findItemsById(id);
		
		String str=items.getContexts();
		str=str.replace("<br>", "\n");
		str=str.replace("&nbsp;", " ");
		items.setContexts(str);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("items", items);
		modelAndView.setViewName("EditItems");
		return modelAndView;
		
	}
	//修改提交文件
	@RequestMapping("/editItems")
	public ModelAndView editItems(Items items) throws Exception{
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String nowDate=sd.format(date);
		java.sql.Date now=java.sql.Date.valueOf(nowDate);
		
		items.setCreatetime(now);
		
		String str=items.getContexts();
		str=str.replace("\n", "<br>");
		str=str.replace(" ", "&nbsp;");
		items.setContexts(str);
		
		
		itemsService.updateItems(items);
		List<Items> itemsList = itemsService.findItemsList();
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("item",items);
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("titleShow");
		return modelAndView;
	}
	//列表展示标题
	@RequestMapping("titleShow")
	public ModelAndView titleShow() throws Exception{
		System.out.println("控制器titleShow");

		List<Items> itemsList = itemsService.findItemsList();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("titleShow");
		return modelAndView;
	}
	//添加
	@RequestMapping("insertItems")
	public ModelAndView insertItems() throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("insertItems");
		return modelAndView;
	}
	//新增提交
	@RequestMapping("insertItemsSubmit")
	public ModelAndView insertItemsSubmit(Items items) throws Exception{
		//日期
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String nowDate=sd.format(date);
		java.sql.Date now=java.sql.Date.valueOf(nowDate);
		
		items.setCreatetime(now);
		
		String str=items.getContexts();
		str=str.replace("\n", "<br>");
		str=str.replace(" ", "&nbsp;");
		items.setContexts(str);
		
		itemsService.insertItems(items);
		List<Items> itemsList = itemsService.findItemsList();
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("titleShow");
		return modelAndView;
	}
	//删除
	@RequestMapping("deleteItems")
	public ModelAndView deleteItems(Integer id) throws Exception{
		itemsService.deleteItems(id);
		List<Items> itemsList = itemsService.findItemsList();
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("titleShow");
		return modelAndView;
	}
	
}
