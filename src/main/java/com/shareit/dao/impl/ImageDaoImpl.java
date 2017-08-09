package com.shareit.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.shareit.dao.ImageDao;
import com.shareit.model.Image;

@Repository
public class ImageDaoImpl implements ImageDao {

	private static final Logger logger = LoggerFactory.getLogger(ImageDao.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void persist(Image image) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(image);
	}

	@Override
	public void update(Image image) {
		Session session = sessionFactory.getCurrentSession();
		session.update(image);
	}

	@Override
	public void delete(Image image) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(image);
	}

	@Override
	public void deleteById(String imageId) {
		Session session = sessionFactory.getCurrentSession();
		Image image = session.load(Image.class, imageId);
		
		if(image != null)
			session.delete(image);
	}

	@Override
	public Image get(String imageId) {
		Session session = sessionFactory.getCurrentSession();
		Image image = session.load(Image.class, imageId);
		
		return image;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Image> getByTags(String tag) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select * from Image where tag=:tag");
		
		query.setParameter("tag", tag);
		
		List<Image> imageList = query.list();
		
		return imageList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Image> getByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select * from Image where username=:username");
		
		query.setParameter("username", username);
		
		List<Image> imageList = query.list();
		
		return imageList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Image> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Image> imageList = session.createQuery("select * from Image").list();
		
		return imageList;
	}

}
