package com.shareit.dao;

import java.util.List;

import com.shareit.model.Image;

public interface ImageDao {
	
	public void persist(Image image);
	
	public void update(Image image);
	
	public void delete(Image image);
	
	public void deleteById(String imageId);
	
	public Image get(String imageId);
	
	public List<Image> getByTags(String tag);
	
	public List<Image> getByUsername(String username);
	
	public List<Image> getAll();
}