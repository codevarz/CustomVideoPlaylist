package com.myvideos.Dao;

import java.util.List;

public interface UserVideoDao {

	public List<String> getVideosByUserId(int userid);
	public void addVideoForUser(int userid, String v_url);
	public void removeVideoForUser(int userid, String v_url);
}
