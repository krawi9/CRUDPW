package com.matk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.matk.entity.Shop;

@Repository
public class ShopDaoImpl implements ShopDao {
	
	@Autowired
	private SessionFactory sf;

	
	public List<Shop> getShops() {
		Session currSession = sf.getCurrentSession();
		Query<Shop> theQuery = currSession.createQuery("from Shop", Shop.class);
		List<Shop> shops = theQuery.getResultList();
		return shops;
	}


	public void saveShop(Shop theShop) {
		Session currSession = sf.getCurrentSession();
		currSession.saveOrUpdate(theShop);
		
		
	}


	public Shop getShop(int theId) {
		Session currSession = sf.getCurrentSession();
		Shop theShop = currSession.get(Shop.class, theId);
		return theShop;
	}


	public void deleteShop(int theId) {
		Session currSession = sf.getCurrentSession();
		Query theQuery = currSession.createQuery("delete from Shop where id=:shopId");
		theQuery.setParameter("shopId", theId);
		theQuery.executeUpdate();
		
	}


	
	public List<Shop> searchShops(String theSearchName) {

        Session currentSession = sf.getCurrentSession(); 
        Query<Shop> theQuery = null;
        if (theSearchName != null && theSearchName.trim().length() > 0) {
            theQuery = currentSession.createQuery("from Shop where lower(shopName) like :theName or lower(address) like :theName", Shop.class);
            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");
        }
        else {
            theQuery =currentSession.createQuery("from Shop", Shop.class);            
        }
        List<Shop> shops = theQuery.getResultList();     
        return shops;
        
    }
	
	
//

}








