package com.suzanlong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.suzanlong.mapper.BlogpicMapper;
import com.suzanlong.po.Allpic;
import com.suzanlong.po.Blogpic;
import com.suzanlong.service.BlogService;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogpicMapper blogpicMapper;
	
	@Override
	public List<Blogpic> findAll() throws Exception{
		
		return blogpicMapper.findAll();
	}

	@Override
	public Blogpic findPicById(Integer id) throws Exception {
		
		return blogpicMapper.findPicById(id);
	}

	@Override
	public void updateBlog(Blogpic blog) throws Exception {
		
		blogpicMapper.updateBlog(blog);
	}

	@Override
	public void deleteBlog(Integer id) throws Exception {
		
		blogpicMapper.deleteBlog(id);
	}

	@Override
	public void insertBlog(Blogpic blog) throws Exception {
		
		blogpicMapper.insertBlog(blog);
	}

	@Override
	public void insertPic(Allpic allPic) throws Exception {
		
		blogpicMapper.insertPic(allPic);
	}

	@Override
	public List<String> findPicByPicId(Integer picId) throws Exception {
		
		return blogpicMapper.findPicByPicId(picId);
	}

	@Override
	public void deletePic(Integer logs_id) throws Exception {
		blogpicMapper.deletePic(logs_id);
		
	}
	
}
