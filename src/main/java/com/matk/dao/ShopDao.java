package com.matk.dao;

import java.util.List;

import com.matk.entity.Shop;

public interface ShopDao {
	
	public List<Shop> getShops();

	public void saveShop(Shop theShop);

	public Shop getShop(int theId);

	public void deleteShop(int theId);

	public List<Shop> searchShops(String theSearchName);

}
