package com.matk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matk.dao.ShopDao;
import com.matk.entity.Shop;

@Service
public class ShopServiceImpl implements ShopService {

	
	@Autowired
	private ShopDao shopDao;
	
	@Transactional
	public List<Shop> getShops() {
		return shopDao.getShops();
	}
	@Transactional
	public void saveShop(Shop theShop) {
		shopDao.saveShop(theShop);
		
	}
	@Transactional
	public Shop getShop(int theId) {
		return shopDao.getShop(theId);
	}
	@Transactional
	public void deleteShop(int theId) {
		shopDao.deleteShop(theId);
		
	}
	@Transactional
	public List<Shop> searchShops(String theSearchName) {
		return shopDao.searchShops(theSearchName);
	}
	 

}









