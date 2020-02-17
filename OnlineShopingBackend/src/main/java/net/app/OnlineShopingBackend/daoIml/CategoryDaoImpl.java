package net.app.OnlineShopingBackend.daoIml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.app.OnlineShopingBackend.dao.CategoryDao;
import net.app.OnlineShopingBackend.dto.Category;


@Repository("CategoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList();

	static {

		Category category = new Category();
		// first category
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("This is some description for Telivision! ");
		category.setImageUrl("CAT_1.png");
		categories.add(category);

		// second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile! ");
		category.setImageUrl("CAT_2.png");
		categories.add(category);

		// third category 
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for  Loptop! ");
		category.setImageUrl("CAT_3.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category getId(int id) {
		 
		for(Category categoey:categories) {
			if(categoey.getId()==id) return categoey;
		}
		return null;
	}

}
