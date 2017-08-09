package com.shareit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shareit.dao.ImageDao;
import com.shareit.model.Image;
import com.shareit.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageDao imageDao;
	
	@Override
	@Transactional
	public void add(Image image) {
		imageDao.persist(image);
	}

	@Override
	@Transactional
	public void update(Image image) {
		imageDao.update(image);
	}

	@Override
	@Transactional
	public void remove(Image image) {
		imageDao.delete(image);
	}

	@Override
	@Transactional
	public void removeById(String imageId) {
		imageDao.deleteById(imageId);
	}

	@Override
	@Transactional
	public Image get(String imageId) {
		return imageDao.get(imageId);
	}

	@Override
	@Transactional
	public List<Image> getByTags(String tag) {
		return imageDao.getByTags(tag);
	}

	@Override
	@Transactional
	public List<Image> getByUsername(String username) {
		return imageDao.getByUsername(username);
	}

	@Override
	@Transactional
	public List<Image> getAll() {
		return imageDao.getAll();
	}
}