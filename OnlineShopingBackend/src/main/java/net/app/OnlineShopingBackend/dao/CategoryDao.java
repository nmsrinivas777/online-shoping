package net.app.OnlineShopingBackend.dao;

import java.util.List;

import net.app.OnlineShopingBackend.dto.Category;

public interface CategoryDao {
 
	public List<Category> list();
	Category getId(int id);
}
