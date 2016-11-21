package com.myvideos.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserVideoDaoImpl implements UserVideoDao {

	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template){
		this.template = template;
	}
	@Override
	public List<String> getVideosByUserId(int userid) {
		// TODO Auto-generated method stub
		String query = "SELECT v_url FROM UserVideos where userid=?";
		return (List<String>) template.find(query, new Object[]{userid});
	}

	@Override
	public void addVideoForUser(int userid, String v_url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVideoForUser(int userid, String v_url) {
		// TODO Auto-generated method stub
		
	}

}
