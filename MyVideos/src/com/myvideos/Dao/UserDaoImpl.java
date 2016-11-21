package com.myvideos.Dao;

import java.util.List;

//import org.hibernate.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myvideos.model.User;

@Service
public class UserDaoImpl implements UserDao {

	
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template){
		this.template = template;
	
	}
	
	@Transactional
	public void saveUser(User user){
		template.setCheckWriteOperations(false);
		System.out.println("inside saveuser");
		template.save(user);
	}

	@Override
	public List<User> getUserByUsername(String username) {
		// TODO Auto-generated method stub
		String query = "FROM User where username=?";
		return (List<User>) template.find(query, new Object[]{username});
//		return null;
	}

//	@Override
//	public List<Object> getPassword(String username) {
//		// TODO Auto-generated method stub
//		String query = "SELECT password,userid FROM User where username=?";
//		return (List<Object>) template.find(query, new Object[]{username});
//	}
}
