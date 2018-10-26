package com.matk.service;

import java.util.List;

import com.matk.entity.Shop;

public interface ShopService {

	public List<Shop> getShops();

	 void saveShop(Shop theShop);

	public Shop getShop(int theId);

	public void deleteShop(int theId);

	public List<Shop> searchShops(String theSearchName);

}














