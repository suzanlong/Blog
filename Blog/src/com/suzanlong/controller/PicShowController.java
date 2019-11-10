package com.suzanlong.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.suzanlong.po.Allpic;
import com.suzanlong.po.Blogpic;
import com.suzanlong.service.BlogService;

@Controller
public class PicShowController {
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private Allpic allPic;
	
	@RequestMapping("pic")
	public ModelAndView pic() throws Exception {
		System.out.println("控制器pic");
		List<Blogpic> blogList=blogService.findAll();
		
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("blogList", blogList);
		modelAndView.setViewName("pic");
		return modelAndView;
	}
	
	@RequestMapping("picchoose")
	public ModelAndView picchoose(Integer id) throws Exception{
		Blogpic blog=blogService.findPicById(id);
		List<Blogpic> blogList=blogService.findAll();
		List<String> allPicList=blogService.findPicByPicId(id);

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("blog", blog);
		modelAndView.addObject("blogList", blogList);
		modelAndView.addObject("allPicList",allPicList);
		modelAndView.setViewName("pic");
		return modelAndView;
	}
	
	@RequestMapping("picChange")
	public ModelAndView picChange(Integer id) throws Exception{
		Blogpic blog=blogService.findPicById(id);
		List<String> allPicList=blogService.findPicByPicId(blog.getId());

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("blog", blog);
		modelAndView.addObject("allPicList",allPicList);
		modelAndView.setViewName("picEdit");
		return modelAndView;
	}
	
	@RequestMapping("picChangeSubmit")
	public ModelAndView picChangeSubmit(Blogpic blog,MultipartFile allpic_pic) throws Exception{
		//更新记录
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String nowDate=sd.format(date);
		java.sql.Date now=java.sql.Date.valueOf(nowDate);
		
		blog.setCreatetime(now);
		blogService.updateBlog(blog);
		
		String originalFilename=allpic_pic.getOriginalFilename();
		
		if(allpic_pic!=null && originalFilename!=null && originalFilename.length()>0) {
			String pic_path="E:\\picdata\\";
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile=new File(pic_path+newFileName);
			//将内存中的数据写入磁盘
			allpic_pic.transferTo(newFile);
			allPic.setPic(newFileName);
			allPic.setLogs_id(blog.getId());
			blogService.insertPic(allPic);
		}
		
		
		//返回修改后的列表
		List<Blogpic> blogList=blogService.findAll();
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("blogList", blogList);

		modelAndView.setViewName("pic");
		return modelAndView;
	}
	
	@RequestMapping("picDelete")
	public ModelAndView picDelete(Integer id) throws Exception{
		
		blogService.deletePic(id);
		
		blogService.deleteBlog(id);
		//返回修改后的列表
		List<Blogpic> blogList=blogService.findAll();
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("blogList", blogList);
		modelAndView.setViewName("pic");
		return modelAndView;
	}
	

	
	@RequestMapping("picInsert")
	public ModelAndView picInsert() throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("picinsert");
		return modelAndView;
	}
	
	@RequestMapping("picInsertSubmit")
	public ModelAndView picInsertSubmit(Blogpic blog,MultipartFile allpic_pic) throws Exception{
		//更新记录
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String nowDate=sd.format(date);
		java.sql.Date now=java.sql.Date.valueOf(nowDate);
		blog.setCreatetime(now);
		blogService.insertBlog(blog);
		
		//返回修改后的列表
		List<Blogpic> blogList=blogService.findAll();
		//找到最后一个加入的id号
		blog=blogService.findPicById(blogList.get(blogList.size()-1).getId());
		
		//图片导入
		String originalFilename=allpic_pic.getOriginalFilename();
		
		if(allpic_pic!=null && originalFilename!=null && originalFilename.length()>0) {
			String pic_path="E:\\picdata\\";
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile=new File(pic_path+newFileName);
			//将内存中的数据写入磁盘
			allpic_pic.transferTo(newFile);
			allPic.setPic(newFileName);
			allPic.setLogs_id(blog.getId());
			blogService.insertPic(allPic);
		}
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("blogList", blogList);
		modelAndView.setViewName("pic");
		return modelAndView;
	}
//	@RequestMapping("picAdd")
//	public ModelAndView picAdd() throws Exception{
//		
//	}
}
