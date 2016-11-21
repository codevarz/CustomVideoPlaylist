package com.myvideos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="uservideos")
public class UserVideos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int video_id;
	@Column(name="user_id")
	private int userid;
	@Column(name="video_url")
	private String v_url;
	
	public UserVideos(){
		
	}

	public UserVideos(int userid, String v_url) {
		super();
		this.userid = userid;
		this.v_url = v_url;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getV_url() {
		return v_url;
	}

	public void setV_url(String v_url) {
		this.v_url = v_url;
	}

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	
	
}
