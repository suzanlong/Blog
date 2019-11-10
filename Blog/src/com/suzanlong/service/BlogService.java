package com.suzanlong.service;

import java.util.List;

import com.suzanlong.po.Allpic;
import com.suzanlong.po.Blogpic;

public interface BlogService {
	public List<Blogpic> findAll() throws Exception;
	
	public Blogpic findPicById(Integer id) throws Exception;
	
	public void updateBlog(Blogpic blog) throws Exception;
	
	public void deleteBlog(Integer id) throws Exception;
	
	public void insertBlog(Blogpic blog) throws Exception;
	
	public void insertPic(Allpic allPic) throws Exception;
	
	public List<String> findPicByPicId(Integer picId) throws Exception;
	
	public void deletePic(Integer logs_id)throws Exception;
}
