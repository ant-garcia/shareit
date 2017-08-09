package com.shareit.service;

import java.util.List;

import com.shareit.model.Image;

public interface ImageService {
	
	public void add(Image image);
	
	public void update(Image image);
	
	public void remove(Image image);
	
	public void removeById(String imageId);
	
	public Image get(String imageId);
	
	public List<Image> getByTags(String tag);
	
	public List<Image> getByUsername(String username);
	
	public List<Image> getAll();
}
