package com.suzanlong.mapper;

import java.util.List;

import com.suzanlong.po.Allpic;
import com.suzanlong.po.Blogpic;

public interface BlogpicMapper {
	public List<Blogpic> findAll();
	public Blogpic findPicById(Integer id);
	
	public void updateBlog(Blogpic blog);
	
	public void deleteBlog(Integer id);
	
	public void insertBlog(Blogpic blog);
	
	public void insertPic(Allpic allpic);
	
	public List<String> findPicByPicId(Integer picId);
	
	public void deletePic(Integer logs_id);
}
